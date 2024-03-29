package com.learn.server.web;

import com.learn.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TimeMagician
 * @since 2019/8/4
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/v1/msg", method = RequestMethod.GET)
    public String print(){
        return userService.printMsg();
    }
}
