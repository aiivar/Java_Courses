package com.company.Controller;

import com.company.Dao.UserDao;
import com.company.Objects.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/enter")
    public String login(@RequestParam String username, @RequestParam String password){

        if(username.equals("Admin") && password.equals("postgres")){
            return "save_car";
        }
        else {
            User u = userDao.findByName(username);
            if (u.getPassword().equals(password)) {
                return ("redirect:/user?id=" + u.getId());
            } else {
                return ("signIn_page");
            }
        }
    }


    @GetMapping("/register")
    public String register(){
        return "register_page";
    }

    @GetMapping("/create_user")
    public String saveUser(@RequestParam String username,
                           @RequestParam String password) {
        if (!userDao.exists(username)){
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);
        User savedUser = userDao.save(u);
        return ("redirect:/user?id=" + savedUser.getId());}
        else {
            return "register_page";
        }
    }


    @GetMapping("/user")
    public String userPage(Model model, @RequestParam Integer id){
        User u = userDao.find(id);
        model.addAttribute(u);
        return "user_page";
    }
}
