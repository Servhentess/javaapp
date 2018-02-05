package fr.ipme.covoit.controller;

import com.fasterxml.jackson.annotation.JsonView;
import fr.ipme.covoit.model.City;
import fr.ipme.covoit.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityRepository repository;

    @GetMapping
    @JsonView(City.class)
    public List<City> List(){

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public City get(@PathVariable int id){
        City city = repository.getOne(id);
        return city;
    }

    @PostMapping
    public City create(@RequestBody City city){
        City createdCity = repository.save(city);
        return createdCity;
    }

    @PutMapping("/{id}")
    public City update(@PathVariable int id, @RequestBody City city){
        City savedCity = repository.getOne(id);
        if (savedCity != null){
            city.setId(savedCity.getId());
            savedCity = repository.save(city);
        }
        return savedCity;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        repository.delete(id);
    }
}
