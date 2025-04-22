package com.example.ac2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ac2.models.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Integer> {
}

