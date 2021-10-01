package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping("/cars")
	@SuppressWarnings("uncheked")
	public String printCars(@RequestParam(value = "count", required = false) int count, ModelMap model) {
		List<Car> carsList = new ArrayList<>();
		carsList.add(new Car("BMW", "BLUE", 17));
		carsList.add(new Car("LAMBA", "YELLOW", 2020));
		carsList.add(new Car("CAMRY", "BLACK", 35));
		carsList.add(new Car("CADILLAC", "BLACK", 666));
		carsList.add(new Car("PORSHE", "RED", 2005));
		Stream carsStream = carsList.stream();
		switch(count) {
			case 1:
				List<Car> cars = (List<Car>) carsStream.limit(1).collect(Collectors.toList());
				model.addAttribute("cars", cars);
				break;
			case 2:
				cars = (List<Car>) carsStream.limit(2).collect(Collectors.toList());
				model.addAttribute("cars", cars);
				break;
			case 3:
				cars = (List<Car>) carsStream.limit(3).collect(Collectors.toList());
				model.addAttribute("cars", cars);
				break;
			case 4:
				cars = (List<Car>) carsStream.limit(4).collect(Collectors.toList());
				model.addAttribute("cars", cars);
				break;
			default:
				model.addAttribute("cars", carsList);
				break;
		}
		return "cars";
	}
	
}