package com.vmo.springboot.Apartment.Repositories;

import com.vmo.springboot.Apartment.Model.ReceivableSevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReceivableServiceRepository extends JpaRepository<ReceivableSevice, Integer> {
}
