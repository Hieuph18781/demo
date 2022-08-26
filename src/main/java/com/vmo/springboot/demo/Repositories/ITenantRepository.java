package com.vmo.springboot.demo.Repositories;

import com.vmo.springboot.demo.Model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITenantRepository extends JpaRepository<Tenant, Integer> {
}
