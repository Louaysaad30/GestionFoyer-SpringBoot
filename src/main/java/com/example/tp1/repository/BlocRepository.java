package com.example.tp1.repository;

import com.example.tp1.entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends JpaRepository
        <Bloc, Long> {
}
