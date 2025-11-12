package com.codedemonbr.jpa.repository;

import com.codedemonbr.jpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
