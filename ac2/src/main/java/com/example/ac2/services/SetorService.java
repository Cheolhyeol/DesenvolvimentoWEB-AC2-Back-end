package com.example.ac2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2.repositories.SetorRepository;

@Service
public class SetorService {

    @Autowired
    private SetorRepository setorRepository;
}

