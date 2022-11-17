package com.example.lektion4endpoint;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    //Debugging ()pretend database
    List<User> userList = new ArrayList(
            Arrays.asList(
                    new User(0,"Benny"),
                    new User(1,"Sara"),
                    new User(2,"Kalle"),
                    new User(3,"Anna"),
                    new User(4,"Knasboll")
            )
    );


    @DeleteMapping("/deleteFirstUser")
    public User removeFirstUser(){
        return userList.remove(0);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        System.out.println(userList);
        return userList;
    }

    @GetMapping("/getUser")
    public User getFirstUser(){

        return userList.get(3);
    }
}
