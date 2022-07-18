package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.FacturaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FacturaRestService extends CrudRepository<FacturaModel, Long>{
    public abstract ArrayList<FacturaModel> findAll();
}
