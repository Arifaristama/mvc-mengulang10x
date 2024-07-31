package org.arif2.coba.controller;

import jdk.jfr.MemoryAddress;
import org.arif2.coba.request.AccessoriesReq;
import org.arif2.coba.response.AccessoriesRes;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/accessories")
public class AccessoriesController {
    private static final List<AccessoriesRes> accessoriesRes = new ArrayList<>();

    public AccessoriesController() {
        accessoriesRes.add(new AccessoriesRes(173, "Kalung", "Logam", "Gold","Yes"));
    }

    @GetMapping
    public ModelAndView getList() {
        ModelAndView mav = new ModelAndView("form/accessories/index");
        mav.addObject("accessories", this.accessoriesRes);
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView getOne(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("form/accessories/detail");
        AccessoriesRes accessoriesRes = this.accessoriesRes.stream().filter(accessoriesRes1 -> accessoriesRes1.getId() == id).findFirst().get();
        mav.addObject("accessories", accessoriesRes);
        return mav;
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("form/accessories/add");
        mav.addObject("accessoriesRes", new AccessoriesRes());
        return mav;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("accessories") AccessoriesReq accessories) {
        AccessoriesRes response = new AccessoriesRes();
        BeanUtils.copyProperties(accessories, response);
        this.accessoriesRes.add(response);
        return new ModelAndView("redirect:/accessories");
    }
}
