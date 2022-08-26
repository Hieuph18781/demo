package com.vmo.springboot.demo.Repositories;

import com.vmo.springboot.demo.Model.Electric_Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IElectric_BillRepository extends JpaRepository<Electric_Bill, Integer> {
}
