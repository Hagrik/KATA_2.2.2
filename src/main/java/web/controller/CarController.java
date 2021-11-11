package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car")
    public String carCount(@RequestParam(value = "count", required = false) Integer number, Model model) {
        if (number == null) {
            model.addAttribute("cars", carService.getCarList());
        } else {
            model.addAttribute("cars", carService.getCarByCount(number));
        }
        return "car";
    }
}
