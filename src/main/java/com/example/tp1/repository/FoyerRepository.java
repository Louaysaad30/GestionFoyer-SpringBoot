package com.example.tp1.repository;

import com.example.tp1.entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepository extends JpaRepository
        <Foyer, Long> {
}
