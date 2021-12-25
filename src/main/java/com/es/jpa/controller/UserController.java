package com.es.jpa.controller;

import com.es.jpa.model.Contact;
import com.es.jpa.model.User;
import com.es.jpa.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/add/{id}")
    public String addUser(@PathVariable String id) {
        String resultStr = "TG33";
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String createTime = formatter.format(new Date());
            Contact contact = new Contact("18900000"+id,"深圳XXXX"+id,"haha"+id+"@163.com");
            User user = new User("id"+id,"name"+id,10+Integer.parseInt(id),createTime,contact);
            user.setId(id);
            user.setContact(contact);
            resultStr = userService.addUser(user);
        } catch (Exception e) {
            resultStr = e.getMessage();
            e.printStackTrace();
        }
        return resultStr;
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        String resultStr = "";
        try {

            String jsonStr = new Gson().toJson(user);
            System.out.println("------jsonStr="+jsonStr);
            resultStr = userService.addUser(jsonStr);

        } catch (Exception e) {
            resultStr = e.getMessage();
            e.printStackTrace();
        }
        return resultStr;
    }

    @GetMapping("/deleteall")
    public String deleteAll() {
        return userService.deleteAll();
    }

}
