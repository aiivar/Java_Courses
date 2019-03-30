package ru.itis.lesson13;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by roi on 3/30/2019.
 */
@Controller
public class UserConroller {
    @Autowired
    UserDao userDao;

    @GetMapping("/user")
    public String getUserById(Model model, @RequestParam Integer id) {
        User u = userDao.find(id);
        model.addAttribute("user", u);
        return "user_page";
    }

    @GetMapping("/new_user")
    public String createUser() {
        return "new_user";
    }

    @GetMapping("/save_user")
    public String saveUser(@RequestParam String username, @RequestParam String password) {
        User u = new User();
        u.username = username;
        u.password = password;
        User savedUser = userDao.save(u);
        return ("redirect:/user?id="+savedUser.id);
    }
}
