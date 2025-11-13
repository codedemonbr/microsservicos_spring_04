package com.codedemonbr.login.repository;

import com.codedemonbr.login.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,  Long> {
}
