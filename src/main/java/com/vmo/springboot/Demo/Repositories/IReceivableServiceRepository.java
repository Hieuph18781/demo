package com.vmo.springboot.Demo.Repositories;

import com.vmo.springboot.Demo.Model.ReceivableSevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReceivableServiceRepository extends JpaRepository<ReceivableSevice, Integer> {
}
