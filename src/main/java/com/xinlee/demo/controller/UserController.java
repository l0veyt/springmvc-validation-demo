package com.xinlee.demo.controller;

import com.xinlee.demo.controller.validation.ValidGroup1;
import com.xinlee.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by xin.lee on 2017/2/17.
 * 用户控制器
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("gotoRegister")
    public String gotoRegister() {
        return "user/register";
    }

    @SuppressWarnings("UnusedParameters")
    @RequestMapping("/register")
    public String register(Model model, @Validated(value = {ValidGroup1.class}) User user, BindingResult bindingResult) throws UnsupportedEncodingException {
        // 如果绑定结果中有校验错误信息
        if(bindingResult.hasErrors()) {
            List<ObjectError> allErrors = bindingResult.getAllErrors();                                 // 获取所有错误信息
            for (ObjectError error : allErrors) {                                                       // 遍历错误信息
                System.out.println(error.getDefaultMessage());                                          // 打印错误信息
            }
            model.addAttribute("allErrors", allErrors);
            return "user/register";
        }
        return "user/success";
    }
}
