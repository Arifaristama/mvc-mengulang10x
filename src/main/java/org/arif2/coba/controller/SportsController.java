package org.arif2.coba.controller;

import org.arif2.coba.request.SportsReq;
import org.arif2.coba.response.SportsRes;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sports")
public class SportsController {
    private static final List<SportsRes> sportRes = new ArrayList<>();

    private SportsController() {
        sportRes.add(new SportsRes(357,"Catur","2 orang","india","in/outdoor"));
    }

    @GetMapping
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView("form/sports/index");
        mav.addObject("sports", this.sportRes);
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView show(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView("form/sports/detail");
        SportsRes sportsRes = this.sportRes.stream().filter(sportsRes1 -> sportsRes1.getId() == id).findFirst().get();
        mav.addObject("sports", sportsRes);
        return mav;
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("form/sports/add");
        mav.addObject("sports", this.sportRes);
        return mav;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("sports")SportsReq sports) {
        SportsRes response = new SportsRes();
        BeanUtils.copyProperties(sports, response);
        this.sportRes.add(response);
        return new ModelAndView("redirect:/sports");
    }

}
