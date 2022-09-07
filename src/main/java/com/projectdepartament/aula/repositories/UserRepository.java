package com.projectdepartament.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectdepartament.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
