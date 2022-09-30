package com.letscode.moviesbattle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letscode.moviesbattle.entities.Movie;

import java.util.UUID;

@Repository
public interface MovieRepository extends JpaRepository<Movie, UUID> {
    boolean existsByTitle(String title);
}
