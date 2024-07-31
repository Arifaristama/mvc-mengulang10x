package org.arif2.coba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class FormController {
    @GetMapping("list")
    public ModelAndView list(){
        ModelAndView mav = new ModelAndView("form/list");
        return mav;
    }
    @GetMapping("form")
    public ModelAndView form() {
        ModelAndView mav = new ModelAndView("form/form");
        return mav;
    }
}
