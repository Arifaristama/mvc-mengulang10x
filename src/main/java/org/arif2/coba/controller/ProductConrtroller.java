package org.arif2.coba.controller;

import org.arif2.coba.request.ProductReq;
import org.arif2.coba.response.ProductRes;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductConrtroller {
    private static final List<ProductRes> productRes = new ArrayList<>();

    public ProductConrtroller() {
        productRes.add(new ProductRes(123,"Cilok","Asgar",1000,"5gram"));
    }

    @GetMapping
    public ModelAndView getList() {
        ModelAndView mav = new ModelAndView("form/product/index");
        mav.addObject("product", productRes);
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView getDetail(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("form/product/detail");
        mav.addObject("product", productRes);
        return mav;
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("form/product/add");
        mav.addObject("product", new ProductReq());
        return mav;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("product")ProductReq product) {
        ProductRes response = new ProductRes();
        BeanUtils.copyProperties(product,response);
        this.productRes.add(response);
        return new ModelAndView("redirect:/product");
    }
}
