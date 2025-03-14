package com.example.tp1.repository;

import com.example.tp1.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository
        <Etudiant, Long> {
}
