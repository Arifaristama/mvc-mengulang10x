package org.arif2.coba.controller;

import org.arif2.coba.request.SingerReq;
import org.arif2.coba.response.SingerRes;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/singer")
public class SingerController {
    private static final List<SingerRes> singerRes = new ArrayList<>();

    public SingerController() {
        singerRes.add(new SingerRes(123,"Hindia","Jakarta","Pop",28));
    }

    @GetMapping
    public ModelAndView getList() {
        ModelAndView mav = new ModelAndView("form/singer/index");
        mav.addObject("singer", singerRes);
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView get(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("form/singer/detail");
        SingerRes singerRes = this.singerRes.stream().filter(singerRes1 -> singerRes1.getId() == id).findFirst().get();
        mav.addObject("singer", singerRes);
        return mav;
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("form/singer/add");
        mav.addObject("singer", new SingerReq());
        return mav;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("singer")SingerReq singer) {
        SingerRes response = new SingerRes();
        BeanUtils.copyProperties(singer, response);
        this.singerRes.add(response);
        return new ModelAndView("redirect:/singer");
    }
}
