package com.company.Controller;

import com.company.Dao.CarDao;
import com.company.Objects.Car;
import com.company.Objects.CarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by roi on 4/23/2019.
 */
@Controller
public class SiteConroller {
    @Autowired
    CarDao carDao;

    @GetMapping("/main_page")
    public String MainPage(Model model){
        List<CarList> cars = carDao.CarList();
        model.addAttribute("carList", cars);
        return "main_page";
    }

    @GetMapping(value = "/main_page", params = {"mark_id"})
    public String SortedMainPage(Model model, @RequestParam Integer mark_id){
        List<CarList> cars = carDao.CarListByMark(mark_id);
        model.addAttribute("carList", cars);
        return "main_page";
    }
}
