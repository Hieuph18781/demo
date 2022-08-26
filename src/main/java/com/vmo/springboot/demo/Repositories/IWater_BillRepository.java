package com.vmo.springboot.demo.Repositories;

import com.vmo.springboot.demo.Model.Water_Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWater_BillRepository extends JpaRepository<Water_Bill, Integer> {
}
