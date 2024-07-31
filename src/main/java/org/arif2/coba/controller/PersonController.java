package org.arif2.coba.controller;

import org.arif2.coba.request.PersonReq;
import org.arif2.coba.response.PersonRes;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {
    private static final List<PersonRes> personRes = new ArrayList<>();

    public PersonController() {
        personRes.add(new PersonRes(123, "arif","metro 25 januari 2004","kotagajah","islam"));
        personRes.add(new PersonRes(456, "Eko","metra 26 januari 2004","kotagajah","islam"));
        personRes.add(new PersonRes(789, "Diko","metri 27 januari 2004","kotagajah","islam"));

    }


    @GetMapping
    public ModelAndView getlist() {
        ModelAndView mav = new ModelAndView("form/person/index");
        //List<PersonRes> person = new ArrayList<>();
        mav.addObject("person", this.personRes);
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView show(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("form/person/detail");
        PersonRes personRes = this.personRes.stream().filter(person -> person.getId() == id).findFirst().get();
        mav.addObject("person", personRes);
        return mav;
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("form/person/add");
        mav.addObject("person",new PersonReq());
        return mav;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("person") PersonReq person) {
        PersonRes response = new PersonRes();
        BeanUtils.copyProperties(person, response);
        this.personRes.add(response);
        return new ModelAndView("redirect:/person");
    }
}
