package com.vmo.springboot.demo.Repositories;

import com.vmo.springboot.demo.Model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IApartmentRepository extends JpaRepository<Apartment, Integer> {

}
