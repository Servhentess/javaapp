package fr.ipme.covoit.controller;

import fr.ipme.covoit.model.Car;
import fr.ipme.covoit.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<Car> List(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Car get(@PathVariable int id) {
        Car car = repository.getOne(id);
        return car;
    }

    @PostMapping
    public Car create(@RequestBody Car car){
        Car createdCar = repository.save(car);
        return createdCar;
    }

    @PutMapping("/{id}")
    public Car update(@PathVariable int id, @RequestBody Car car){
        Car savedCar = repository.getOne(id);
        if (savedCar != null){
            car.setId(savedCar.getId());
            savedCar = repository.save(car);
        }
        return savedCar;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        repository.delete(id);
    }
}
