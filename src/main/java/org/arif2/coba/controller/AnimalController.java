package org.arif2.coba.controller;

import org.arif2.coba.request.AnimalReq;
import org.arif2.coba.response.AnimalRes;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalController {
    private static final List<AnimalRes> animalRes = new ArrayList<>();

    public AnimalController() {
        animalRes.add(new AnimalRes(123, "Kucing", "2Bulan","Male", "MixDom"));
    }

    @GetMapping
    public ModelAndView getList() {
        ModelAndView mav = new ModelAndView("form/animal/index");
        //List<AnimalRes> animalres = new ArrayList<>();
        mav.addObject("animal", this.animalRes);
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView getDetail(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("form/animal/detail");
        AnimalRes animalRes = this.animalRes.stream().filter(animalRes1 -> animalRes1.getId() == id).findFirst().get();
        mav.addObject("animal", animalRes);
        return mav;
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("form/animal/add");
        mav.addObject("animal", new AnimalReq());
        return mav;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("animal")AnimalReq animal) {
        AnimalRes response = new AnimalRes();
        BeanUtils.copyProperties(animal, response);
        this.animalRes.add(response);
        return new ModelAndView("redirect:/animal");
    }
}
