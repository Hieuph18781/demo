package com.vmo.springboot.Demo.Repositories;

import com.vmo.springboot.Demo.Model.receivable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReceivableRepository extends JpaRepository<receivable, Integer> {
}
