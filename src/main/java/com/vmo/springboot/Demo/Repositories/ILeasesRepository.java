package com.vmo.springboot.Demo.Repositories;

import com.vmo.springboot.Demo.Model.Leases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILeasesRepository extends JpaRepository<Leases, Integer> {


}
