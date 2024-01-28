package com.fabiofrau.Test.CRUD;

import com.fabiofrau.Test.CRUD.controllers.UserController;
import com.fabiofrau.Test.CRUD.entities.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TestCrudApplicationTests {

	@Autowired
	private UserController userController;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	ObjectMapper objectMapper;

	@Test
	void userControllerLoads() {
		assertThat(userController).isNotNull();
	}

	@Test
	void createAUserTest() throws Exception {
//		User user = new User();
//		user.setActive(true);
//		user.setName("Fabio");
//		user.setSurname("Frau");
//		user.setAge(32);
//
//		String userJson = objectMapper.writeValueAsString(user);


		MvcResult result = createAUser();
//				this.mockMvc.perform(post("/user")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(userJson)).andDo(print())
//				.andExpect(status().isOk())
//				.andReturn();

		User userFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), User.class);

		assertThat(userFromResponse.getId()).isNotNull();
	}

	private MvcResult createAUser() throws Exception {
		User user = new User();
		user.setActive(true);
		user.setName("Fabio");
		user.setSurname("Frau");
		user.setAge(32);

		return createAUser(user);
	}

	private MvcResult createAUser(User user) throws Exception {
		if(user == null) {
			return null;
		} else {
			String userJson = objectMapper.writeValueAsString(user);

			return this.mockMvc.perform(post("/user")
							.contentType(MediaType.APPLICATION_JSON)
							.content(userJson)).andDo(print())
					.andExpect(status().isOk())
					.andReturn();
		}


	}

	@Test
	void readUserList() throws Exception {

		createAUser();
		createAUser();
		createAUser();

		MvcResult result = this.mockMvc.perform(get("/user/")
				.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();

		List<User> userFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(),
													List.class );
		System.out.println("Users in DB are" + userFromResponse.size());
		assertThat(userFromResponse.size()).isNotZero();
	}



}
