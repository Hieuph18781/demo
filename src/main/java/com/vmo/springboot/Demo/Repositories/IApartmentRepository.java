package com.vmo.springboot.Demo.Repositories;

import com.vmo.springboot.Demo.Model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IApartmentRepository extends JpaRepository<Apartment, Integer> {

}
