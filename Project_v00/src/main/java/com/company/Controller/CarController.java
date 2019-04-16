package com.company.Controller;

import com.company.Dao.CarDao;
import com.company.Objects.Car;
import com.company.Objects.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by roi on 4/16/2019.
 */
@Controller
public class CarController {
    @Autowired
    CarDao carDao;

    @GetMapping("/save_car")
    public String saveCar(){
        return "save_car";
    }

    @GetMapping("/save_car2")
    public String saveCar2(Model model, @RequestParam Integer mark_id){
        List<CarModel> carModels = carDao.carsByMark(mark_id);
        model.addAttribute("carList", carModels);
        return "save_car2";
    }

    @GetMapping("/save_car3")
    public String saveCar3(@RequestParam Integer modelId){
        Car c = new Car();

        return "save_car3";
    }
}
