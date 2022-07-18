package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.FacturaModel;
import com.example.demo.repositories.FacturaRestService;

@Service
public class FacturaService {
    @Autowired
    FacturaRestService FacturaRestService;

    public ArrayList<FacturaModel> obtenerFactura(){
        return (ArrayList<FacturaModel>) FacturaRestService.findAll();
    }
    public Optional<FacturaModel> findFacturaByPersona(Long id){
        return FacturaRestService.findById(id);
    }

    public FacturaModel guardarFactura(FacturaModel factura){
        return FacturaRestService.save(factura);
    }


}
