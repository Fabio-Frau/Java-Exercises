package com.fabiofrau.Interceptors.Interceptors;

import com.fabiofrau.Interceptors.entities.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class LoggedUserInterceptor implements HandlerInterceptor {

    public static List<User> users = new ArrayList<>(Arrays.asList(
            new User(1, "Fabio", "Frau", "Cagliari"),
            new User(2, "Mario", "Rossi", "Palermo"),
            new User(3, "Luca", "Bianchi", "Palermo"),
            new User(4, "Anna", "Verdi", "Roma")
    ));

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userIdString = request.getHeader("userId");
        if(userIdString == null) {
            return true;
        }
        long userId = Long.parseLong(userIdString);
        Optional<User> user = users.stream().filter(singleUser-> {
            return singleUser.getId() == userId;
        }).findFirst();

        if(user.isPresent()) {
            request.setAttribute("LoggedUserInterceptor-user", user.get());
        }
        return true;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }

}
