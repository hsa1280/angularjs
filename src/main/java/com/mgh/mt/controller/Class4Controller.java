package com.mgh.mt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/21/12
 * Time: 12:23 AM
 */
@Controller
@RequestMapping("/class4")
public class Class4Controller {

    @RequestMapping("/layout")
    public String getClass1LayoutPage() {
        return "class4/layout";
    }
}
