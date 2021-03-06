package com.educandoweb.cursofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.cursofullstack.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
