package org.arif2.coba.controller;

import org.arif2.coba.request.FishReq;
import org.arif2.coba.response.FishRes;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/fish")
public class FishController {
    private static final List<FishRes> fishRes = new ArrayList<>();

    private FishController() {
        fishRes.add(new FishRes(537,"Tuna","2kg","Biru tua","Samudera Pasifik"));

    }

    @GetMapping
    public ModelAndView getList() {
        ModelAndView mav = new ModelAndView("form/fish/index");
        mav.addObject("fish", this.fishRes);
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView getDetail(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("form/fish/detail");
        FishRes fishRes = this.fishRes.stream().filter(fishRes1 -> fishRes1.getId() == id).findFirst().get();
        mav.addObject("fish", fishRes);
        return mav;
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("form/fish/add");
        mav.addObject("fish", new FishReq());
        return mav;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("fish")FishReq fish){
        FishRes response = new FishRes();
        BeanUtils.copyProperties(fish, response);
        this.fishRes.add(response);
        return new ModelAndView("redirect:/fish");
    }

}
