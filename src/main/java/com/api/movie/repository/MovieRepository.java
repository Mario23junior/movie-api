package com.api.movie.repository;

import java.util.Optional;

import com.api.movie.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository	
public interface MovieRepository extends JpaRepository<Movie, Long> {
	Movie findByNome(String nome);
	Optional<Movie> findByNomeContainingIgnoreCase(String move);

}
