package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Long> {

}
