package com.example.app.service.impl;
//import com.alibaba.dubbo.config.annotation.Reference;
import com.example.app.service.CouponService;
import org.apache.dubbo.config.annotation.DubboReference;

import org.springframework.stereotype.Service;

/**
 @Description
 @author Administrator
 @date  2020/6/24
*/
@Service
public class CouponServiceImpl implements CouponService {

     @DubboReference
   //  UserServiceApi userServiceApi;

    @Override
    public String getById() {
     //   return userServiceApi.getUserById(1L);
         return  null;
    }

}
