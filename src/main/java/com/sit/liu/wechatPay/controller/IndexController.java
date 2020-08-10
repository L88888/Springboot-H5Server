package com.sit.liu.wechatPay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: willWangServer
 * @description:
 * @author: LIULEI
 * @create: 2020-08-10 17:24:
 **/
@Controller
public class IndexController {

    /**
     * http://127.0.0.1:8080/server-track/show
     * @param model
     * @param modelMap
     * @return
     */
    @RequestMapping("server-track/show")
    public String indexToShow(Model model, ModelMap modelMap) {
        System.out.println("ssssssssssss");
        return "system/index";
    }

    /**
     * http://127.0.0.1:8080/server-track/result
     * @param model
     * @param modelMap
     * @return
     */
    @RequestMapping("server-track/result")
    public String resultToPage(Model model, ModelMap modelMap) {
        // 支付成功0.1元
        model.addAttribute("message",0.1);
        System.out.println("resultToPage");
        return "resultpage/success";
    }
}
