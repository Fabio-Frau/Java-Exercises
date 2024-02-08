package com.fabiofrau.Live7Feb.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Component
public class EmailValidationInterceptor implements HandlerInterceptor {

    private static boolean isEmailValid(final String input) {
        // Compile regular expression
        final Pattern pattern = Pattern.compile("[-A-Za-z0-9!#$%&'*+/=?^_`{|}~]+(?:\\.[-A-Za-z0-9!#$%&'*+/=?^_`{|}~]+)*@(?:[A-Za-z0-9](?:[-A-Za-z0-9]*[A-Za-z0-9])?\\.)+[A-Za-z0-9](?:[-A-Za-z0-9]*[A-Za-z0-9])?", Pattern.CASE_INSENSITIVE);
        // Match regex against input
        final Matcher matcher = pattern.matcher(input);
        // Use results...
        return matcher.matches();
    }

    Logger logger = LoggerFactory.getLogger(EmailValidationInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        logger.info("Pre-handle " + request.getHeaderNames());
        logger.info("Pre-handle " + request.getRequestURL());

        logger.info("Email validator: isEmailValid = " + isEmailValid(request.getHeader("email")) );

        if(!isEmailValid(request.getHeader("email"))) {
            //response.setStatus(418);
            response.sendError(432, "email non formattata correttamente");
        }

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        logger.info("Post-handle " + request.getHeaderNames());
//        logger.info("Post-handle " + request.getRequestURL());
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        logger.info("after " + request.getHeaderNames());
//        logger.info("after " + request.getRequestURL());
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
