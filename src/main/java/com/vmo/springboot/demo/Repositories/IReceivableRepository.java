package com.vmo.springboot.demo.Repositories;

import com.vmo.springboot.demo.Model.receivable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReceivableRepository extends JpaRepository<receivable, Integer> {
}
