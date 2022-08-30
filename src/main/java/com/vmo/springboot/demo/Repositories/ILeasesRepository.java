package com.vmo.springboot.demo.Repositories;

import com.vmo.springboot.demo.Model.Apartment;
import com.vmo.springboot.demo.Model.Leases;
import com.vmo.springboot.demo.Model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILeasesRepository extends JpaRepository<Leases, Integer> {

    List<Leases> findAllByApartment_Id(int id);
    List<Leases> findAllByTenant_Id(int id);
}
