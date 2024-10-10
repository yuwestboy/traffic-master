package com.everpower.traffic_system.web;

import java.net.http.HttpResponse;

import com.everpower.traffic_api_commons.*;
import com.everpower.traffic_system.info.UserInfo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import com.everpower.traffic_system.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

    // private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    // @GetMapping("/name")
    // public String getName() {

    //     logger.error("test my logger");
    //     return "hello, world!";
    // }
    // @Autowired
    // @RequestMapping("/addUser")
    // public ResponseResult addUser(UserInfo userInfo) {
    //     ResponseResult responseResult =  

    // }
    @Autowired
    UserService userService;
    
    @RequestMapping("/addUser")
    public ResponseResult addUser(UserInfo userInfo) {
        ResponseResult responseResult = ResponseResultFactory.buildResponseResult();

        return responseResult;
    }
    

}
