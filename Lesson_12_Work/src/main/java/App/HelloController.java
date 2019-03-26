package App;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by roi on 3/26/2019.
 */
@Controller
public class HelloController {
    @RequestMapping("/app")
    public String name(){
        return "name";
    }

    @RequestMapping("/app/hello")
    public String greeting(Model model, @RequestParam String username){
        model.addAttribute("username", username);
        return "greeting";
    }

    @RequestMapping("/app/calc")
    public String calc(){
        return "calc";
    }

    @RequestMapping("/app/result")
    public String result(Model model, @RequestParam long  pr1, long pr2){
        model.addAttribute("result", pr1+pr2);
        return "result";
    }

}
