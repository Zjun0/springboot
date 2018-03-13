package com.zj.springboot.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: zj
 * @date: ${date}
 */

@ControllerAdvice
public class DemoControllerAdvice {
    @ModelAttribute
    public void newUser() {
        System.out.println("============应用到所有@RequestMapping注解方法，在其执行之前把返回值放入Model");
    }
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
        System.out.println("============应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器");
    }
    // @ExceptionHandler(UnauthenticatedException.class)//http://blog.csdn.net/chenaschen/article/details/51291566
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    public String processUnauthenticatedException(NativeWebRequest request, UnauthenticatedException e) {
//        System.out.println("===========应用到所有@RequestMapping注解的方法，在其抛出UnauthenticatedException异常时执行");
//        return "viewName"; //返回一个逻辑视图名
//    }
}
