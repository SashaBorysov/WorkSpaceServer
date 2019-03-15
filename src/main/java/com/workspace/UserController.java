package com.workspace;

import com.workspace.entity.Users;
import com.workspace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<Users> getAllTopics(){
        return userService.findAll();
    }

    @RequestMapping("/users/{name}")
    public List<Users> getUsersByName(@PathVariable String name){
        return userService.findAllByName(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users/clear")
    public void removeUsers() {
        userService.clearUsersDb();
    }

}
