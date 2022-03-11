package com.rodrigotosi.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigotosi.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
