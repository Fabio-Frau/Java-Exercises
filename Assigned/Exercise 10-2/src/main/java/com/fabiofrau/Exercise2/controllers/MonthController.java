package com.fabiofrau.Exercise2.controllers;

import com.fabiofrau.Exercise2.entities.Month;
import com.fabiofrau.Exercise2.interceptors.MonthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {


    @GetMapping("/getmonth")
    public Month getMonth(@RequestAttribute ("month") Month month) {
        return month;
    }

}
