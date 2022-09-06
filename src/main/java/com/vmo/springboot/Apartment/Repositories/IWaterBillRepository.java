package com.vmo.springboot.Apartment.Repositories;

import com.vmo.springboot.Apartment.Model.WaterBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWaterBillRepository extends JpaRepository<WaterBill, Integer> {
}
