package com.vmo.springboot.Demo.Repositories;

import com.vmo.springboot.Demo.Model.ERole;
import com.vmo.springboot.Demo.Model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
