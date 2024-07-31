package org.arif2.coba.controller;

import org.arif2.coba.request.FruitsReq;
import org.arif2.coba.response.FruitsRes;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/fruits")
public class FruitsController {
    private static final List<FruitsRes> fruitRes = new ArrayList<>();

    public FruitsController() {
        fruitRes.add(new FruitsRes(137,"Pisang","Kuning",12000,"Manis"));
    }

    @GetMapping
    public ModelAndView getList() {
        ModelAndView mav = new ModelAndView("form/fruits/index");
        //List<FruitsRes> fruitsRes = new ArrayList<>();
        mav.addObject("fruits", fruitRes);
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView getDetail(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("form/fruits/detail");
        FruitsRes fruitsRes = this.fruitRes.stream().filter(fruitsRes1 -> fruitsRes1.getId() == id).findFirst().get();
        mav.addObject("fruits", fruitsRes);
        return mav;
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("form/fruits/add");
        mav.addObject("fruits", new FruitsReq());
        return mav;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("fruits")FruitsReq fruits) {
        FruitsRes response = new FruitsRes();
        BeanUtils.copyProperties(fruits, response);
        this.fruitRes.add(response);
        return new ModelAndView("redirect:/fruits");
    }
}

