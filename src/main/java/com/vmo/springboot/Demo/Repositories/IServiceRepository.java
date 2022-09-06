package com.vmo.springboot.Demo.Repositories;

import com.vmo.springboot.Demo.Model.ServiceOther;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRepository extends JpaRepository<ServiceOther, Integer> {
}
