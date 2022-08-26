package com.vmo.springboot.demo.Repositories;

import com.vmo.springboot.demo.Model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRepository extends JpaRepository<Service, Integer> {
}
