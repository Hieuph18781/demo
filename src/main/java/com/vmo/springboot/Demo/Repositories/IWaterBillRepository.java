package com.vmo.springboot.Demo.Repositories;

import com.vmo.springboot.Demo.Model.WaterBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWaterBillRepository extends JpaRepository<WaterBill, Integer> {
}
