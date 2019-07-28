package com.shanhe.provider.controller;

import com.shanhe.provider.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {


    @RequestMapping("/getUser")
    public List<User> getUsers(){
        List<User> list = new ArrayList<User>();
        list.add(new User("zhanshanfeng","80","10000"));
        list.add(new User("zhancuishan","43","10000"));
        list.add(new User("zhanwuji","25","10000"));
        return list;
    }

}
