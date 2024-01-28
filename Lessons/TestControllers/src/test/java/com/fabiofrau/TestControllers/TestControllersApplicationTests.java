package com.fabiofrau.TestControllers;

import com.fabiofrau.TestControllers.controllers.HomeController;
import com.fabiofrau.TestControllers.entities.User;
import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class TestControllersApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private HomeController homeController;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		assertThat(homeController).isNotNull();
	}

	@Test
	void restTemplateTest() {
		String output = this.testRestTemplate.getForObject(
				"http://127.0.0.1:" + port +"/",
				String.class);
		assertThat(output).contains("Hello world");
	}

	@Test
	void restTemplateTestUser() {

		User user = this.testRestTemplate.getForObject(
				"http://127.0.0.1:" + port +"/user",
				User.class
		);
		assertThat(user.getName()).contains("Fabio");
		assertThat(user.getSurname()).contains("Frau");
	}

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello world")));
	}

	@Test
	public void mockMvcUserTest() throws Exception {
		this.mockMvc.perform(get("/user")).andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.name").value("Fabio"))
				.andExpect(jsonPath("$.surname").value("Frau"));
	}

}
