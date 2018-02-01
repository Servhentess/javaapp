package fr.ipme.covoit.repository;

import fr.ipme.covoit.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Integer>{

    public List<Trip> findAllByPrice (Long price);
}
