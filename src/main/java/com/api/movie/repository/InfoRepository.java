package com.api.movie.repository;

import com.api.movie.model.Info;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepository extends JpaRepository<Info, Long>{

}
