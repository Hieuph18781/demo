package com.vmo.springboot.Apartment.Repositories;

import com.vmo.springboot.Apartment.Model.receivable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReceivableRepository extends JpaRepository<receivable, Integer> {
}
