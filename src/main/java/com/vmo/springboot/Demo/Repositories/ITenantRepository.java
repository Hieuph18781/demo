package com.vmo.springboot.Demo.Repositories;

import com.vmo.springboot.Demo.Model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITenantRepository extends JpaRepository<Tenant, Integer> {

}
