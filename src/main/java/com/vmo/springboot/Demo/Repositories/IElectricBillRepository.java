package com.vmo.springboot.Demo.Repositories;

import com.vmo.springboot.Demo.Model.ElectricBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IElectricBillRepository extends JpaRepository<ElectricBill, Integer> {
}
