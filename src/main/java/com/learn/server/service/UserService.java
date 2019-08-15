package com.learn.server.service;

import org.springframework.stereotype.Service;

/**
 * @author TimeMagician
 * @since 2019/8/4
 */
@Service
public class UserService {
    public String printMsg(){
        System.out.println("123");
        return "123";
    }
}
