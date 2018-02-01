package fr.ipme.covoit.repository;

import fr.ipme.covoit.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {

    public List<Car> findAllByModel(String model);
}
