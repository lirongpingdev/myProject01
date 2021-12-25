package com.es.jpa.service;

import com.es.jpa.dao.UserRepository;
import com.es.jpa.model.User;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String addUser(User user){
        System.out.println("------Before save-----user="+new Gson().toJson(user));
        User save = userRepository.save(user);
        System.out.println("------After save111111122222222222TG1001tg22-----user="+new Gson().toJson(save));


         //test commit;
		 //test pull

        return new Gson().toJson(save);
    }

    public String addUser(String jsonStr){
        User user = new Gson().fromJson(jsonStr,User.class);
        System.out.println("------Before save-----user="+new Gson().toJson(user));
        User save = userRepository.save(user);
        System.out.println("------After save-----user="+new Gson().toJson(save));
        return new Gson().toJson(save);
    }


    public String deleteAll(){
        userRepository.deleteAll();
        return "OK";
    }
}
