package com.fabiofrau.Exercise2.interceptors;

import com.fabiofrau.Exercise2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.ArrayList;
import java.util.List;

@Component
public class MonthInterceptor implements HandlerInterceptor {

    private List<Month> getMonths() {
        List<Month> months = new ArrayList<>();
        Month month = new Month(1, "January", "Gennaio", "Januar");
        Month month1 = new Month(2, "February", "Febbraio", "Februar");
        Month month2 = new Month(3, "March", "Marzo", "Marsch");
        Month month3 = new Month(4, "April", "Aprile", "April");
        Month month4 = new Month(5, "May", "Maggio", "Mai");

        months.add(month);
        months.add(month1);
        months.add(month2);
        months.add(month3);
        months.add(month4);

        return months;
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumberFromHeader = request.getHeader("monthNumber");

        if (monthNumberFromHeader == null || monthNumberFromHeader.isEmpty()) {
            response.setStatus(400);
            return false;
        } else {
            int monthNumber = Integer.parseInt(monthNumberFromHeader);
            Month monthAttribute = getMonths().stream().filter(
                    month -> month.getMonthNumber() == monthNumber)
                    .findFirst()
                    .orElseGet(() -> new Month(monthNumber, "nope", "nope", "nope")
            );

            request.setAttribute("month", monthAttribute);
            return true;
        }


    }
}
