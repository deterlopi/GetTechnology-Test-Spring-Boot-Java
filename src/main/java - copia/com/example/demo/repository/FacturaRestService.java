package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FacturaRepository;

public interface FacturaRestService extends JpaRepository<FacturaRepository, Long> {

}
