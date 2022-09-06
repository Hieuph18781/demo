package com.vmo.springboot.Apartment.Repositories;

import com.vmo.springboot.Apartment.Model.Leases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILeasesRepository extends JpaRepository<Leases, Integer> {


}
