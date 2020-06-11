package com.example.app.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Description
 * @date 15:13
 */
@RestController
public class testController {


            /** @Author Administrator
            * @Description
            * @Date 2020/6/10
            * @Param []
            * @return java.lang.String
            **/
            @RequestMapping("/getList")
            public String getMessage(){
                  return "11111";
            }


}
