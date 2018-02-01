package fr.ipme.covoit.controller;

import fr.ipme.covoit.model.User;
import fr.ipme.covoit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> List(){

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public User get(@PathVariable int id){

        User user = repository.getOne(id);
        return user;
    }

    @PostMapping
    public User create(@RequestBody User user){

        User createdUser = repository.save(user);
        return createdUser;
    }

    @PutMapping("/{id}")
    public User update(@PathVariable int id, @RequestBody User user){

        User savedUser = repository.getOne(id);
        if (savedUser != null){
            user.setId(savedUser.getId());
            savedUser = repository.save(user);
        }
        return savedUser;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        repository.delete(id);
    }
}
