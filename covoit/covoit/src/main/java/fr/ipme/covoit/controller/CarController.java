package fr.ipme.covoit.controller;

import com.fasterxml.jackson.annotation.JsonView;
import fr.ipme.covoit.model.Car;
import fr.ipme.covoit.model.User;
import fr.ipme.covoit.repository.CarRepository;
import fr.ipme.covoit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
@CrossOrigin
public class CarController {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    @JsonView(Car.class)
    public List<Car> List(){
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    public Car get(@PathVariable int id) {
        Car car = carRepository.getOne(id);
        return car;
    }

    @PostMapping
    public Car create(@RequestBody Car car){
        Car createdCar = carRepository.save(car);
        return createdCar;
    }

    @PutMapping("/{id}")
    public Car update(@PathVariable int id, @RequestBody Car car){
        Car savedCar = carRepository.getOne(id);
        if (savedCar != null){
            car.setId(savedCar.getId());
            savedCar = carRepository.save(car);
        }else{
            try{

            }catch(Exception e){
                System.out.println("Erreur : " + e);
            }
        }
        return savedCar;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        /*Destruction de la voiture inscrite sur un user*/
        User user =  userRepository.findByCar(carRepository.getOne(id));
        user.setCar(null);
        userRepository.save(user);

        /*suppression de la voiture*/
        carRepository.delete(id);
    }
}
