package fr.ipme.covoit.repository;

import fr.ipme.covoit.model.Car;
import fr.ipme.covoit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>{

    public List<User> findAllByName (String name);

    public List<User> findAllByCar (Car car);
}
