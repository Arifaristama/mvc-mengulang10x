package org.arif2.coba.controller;

import org.arif2.coba.request.SnackReq;
import org.arif2.coba.response.SnackRes;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/snack")
public class SnackController {
    private static final List<SnackRes> snackRes = new ArrayList<>();

    public SnackController() {
        snackRes.add(new SnackRes(253,"Biskuat","Indofood","Cokelat","500gr"));
    }

    @GetMapping
    public ModelAndView getList() {
        ModelAndView mav = new ModelAndView("form/snack/index");
        mav.addObject("snack", snackRes);
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView getDetail(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("form/snack/detail");
        SnackRes snackRes = this.snackRes.stream().filter(snackRes1 -> snackRes1.getId() == id).findFirst().get();
        mav.addObject("snack", snackRes);
        return mav;
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("form/snack/add");
        mav.addObject("snack", new SnackReq());
        return mav;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("snack")SnackReq snack) {
        SnackRes response = new SnackRes();
        BeanUtils.copyProperties(snack, response);
        this.snackRes.add(response);
        return new ModelAndView("redirect:/snack");
    }
}
