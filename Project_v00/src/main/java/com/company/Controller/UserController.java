package com.company.Controller;

import com.company.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by roi on 4/9/2019.
 */
@Controller
public class UserController {
    @Autowired
    UserDao userDao;

    @GetMapping("/")
    public String signInForm(){
        return "signIn_page";
    }

    

    @GetMapping("/user")
    public String userPage(){

        return "user_page";
    }
}
