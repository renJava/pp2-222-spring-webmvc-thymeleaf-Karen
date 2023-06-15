package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private final CarServiceImpl carService;

    public CarController(CarServiceImpl carImpl) {
        this.carService = carImpl;
    }



    @GetMapping(value = "/cars")
    public String car(Model model, @RequestParam(value = "count", defaultValue = "10") int count) {
        model.addAttribute("cars", carService.getCarsByCount(count));
        return "cars";
    }
}
