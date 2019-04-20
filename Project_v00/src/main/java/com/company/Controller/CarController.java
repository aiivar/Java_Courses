package com.company.Controller;

import com.company.Dao.CarDao;
import com.company.Objects.Car;
import com.company.Objects.CarColor;
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
        model.addAttribute("mark_id", mark_id);
        return "save_car2";
    }

    @GetMapping("/save_car3")
    public String saveCar3(Model model, @RequestParam Integer modelId, @RequestParam Integer mark_id){
        List<CarColor> carColors = carDao.carColors();
        model.addAttribute("colorList", carColors);
        model.addAttribute("model_id", modelId);
        model.addAttribute("mark_id", mark_id);
        return "save_car3";
    }

    @GetMapping("/save_car4")
    public String saveCar4(Model model, @RequestParam Integer color_id, @RequestParam Integer mark_id, @RequestParam Integer model_id){
        Car c = new Car();
        c.setCarColor_id(color_id);
        c.setCarMark_id(mark_id);
        c.setCarModel_id(model_id);
        Car savedCar =carDao.save(c);
        return "redirect:/car?id="+savedCar.getId();
    }

    @GetMapping("/car")
    public String carPage(Model model, @RequestParam Integer id){
        Car c = carDao.find(id);
        Integer carId = c.getId();
        String carMark = carDao.MarkById(c.getCarMark_id()).getName();
        String carModel = carDao.ModelById(c.getCarModel_id()).getName();
        String carColor = carDao.ColorById(c.getCarColor_id()).getColor();
        model.addAttribute("carId", carId);
        model.addAttribute("carMark", carMark);
        model.addAttribute("carModel", carModel);
        model.addAttribute("carColor", carColor);
        return "car_page";
    }
}

