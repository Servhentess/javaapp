package fr.ipme.covoit.repository;

import fr.ipme.covoit.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Integer>{

    public List<City> findAllByName(String name);
}
