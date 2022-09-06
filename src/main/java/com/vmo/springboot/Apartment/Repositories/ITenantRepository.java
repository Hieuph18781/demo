package com.vmo.springboot.Apartment.Repositories;

import com.vmo.springboot.Apartment.Model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITenantRepository extends JpaRepository<Tenant, Integer> {

}
