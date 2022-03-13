package com.rodrigotosi.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigotosi.dsmovie.entities.Score;
import com.rodrigotosi.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
