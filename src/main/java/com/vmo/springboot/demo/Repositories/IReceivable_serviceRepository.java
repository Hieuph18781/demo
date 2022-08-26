package com.vmo.springboot.demo.Repositories;

import com.vmo.springboot.demo.Model.receivable_sevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReceivable_serviceRepository extends JpaRepository<receivable_sevice, Integer> {
}
