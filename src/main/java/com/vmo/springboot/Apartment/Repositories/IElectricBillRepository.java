package com.vmo.springboot.Apartment.Repositories;

import com.vmo.springboot.Apartment.Model.ElectricBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IElectricBillRepository extends JpaRepository<ElectricBill, Integer> {
}
