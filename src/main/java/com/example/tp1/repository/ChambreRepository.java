package com.example.tp1.repository;

import com.example.tp1.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepository extends JpaRepository
        <Chambre, Long> {

}
