package com.example.app.controller;


import com.example.app.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 @Description
 @author ${USER}
 @date  ${TIME}
*/
@RestController
public class TestController {

           @Autowired
           private   CouponService couponService;

            @RequestMapping("/getList")
            public String getMessage(){
                  return "11111";
            }




}
