package com.vmo.springboot.Apartment.Repositories;

import com.vmo.springboot.Apartment.Model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IApartmentRepository extends JpaRepository<Apartment, Integer> {

}
