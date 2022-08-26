package com.vmo.springboot.demo.Repositories;

import com.vmo.springboot.demo.Model.Leases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILeasesRepository extends JpaRepository<Leases, Integer> {
}
