package fr.ipme.covoit.controller;

import fr.ipme.covoit.model.Car;
import fr.ipme.covoit.repository.carRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class carController {

    @Autowired
    private carRepository repository;

    @GetMapping
    public List<Car> List(){
        return repository.findAll();
    }

    @GetMapping("/(id)")
    public Car get(@PathVariable int id) {
        Car car = repository.getOne(id);
        return car;
    }

    @PostMapping
    public Car create(@RequestBody Car car){
        Car createdCar = repository.save(car);
        return createdCar;
    }
}
