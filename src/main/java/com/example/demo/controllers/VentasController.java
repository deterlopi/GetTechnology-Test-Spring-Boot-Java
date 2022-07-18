package com.example.demo.controllers;
import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.FacturaModel;
import com.example.demo.services.FacturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/Ventas")
public class VentasController {
    @Autowired
    FacturaService FacturaService;

    @GetMapping()
    public ArrayList<FacturaModel> obtenerVentas(){
        return FacturaService.obtenerFactura();
    }

    @GetMapping( path = "/{id}")
    public Optional<FacturaModel> findFacturaByPersona(@PathVariable("id") Long id) {
        return this.FacturaService.findFacturaByPersona(id);
    }

    @PostMapping()
    public FacturaModel guardarFactura(@RequestBody FacturaModel factura){
        return this.FacturaService.guardarFactura(factura);
    }


}