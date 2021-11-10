package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarService;



@Controller
@RequestMapping(value = "/car")
public class CarController {

    private CarService carService;

    @Autowired
    public void setCarService(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/car")
    public String getCar (int number, Model model){
        model.addAttribute("cars", this.carService.carCount(number));
        return "car";
    }
}
