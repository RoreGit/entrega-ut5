package com.ramonegido.entregaut5.controller;

import com.ramonegido.entregaut5.VideojuegosServiceImpl;
import com.ramonegido.entregaut5.model.Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WebController {
    @Autowired
    VideojuegosServiceImpl vsi;

    @GetMapping("/videojuegos")
    public List<Videojuego> listatodos(){
        return vsi.findAll();
    }

    @GetMapping("/videojuegos/{id}")
    public Optional<Videojuego> listauno(@PathVariable Long id){
        return vsi.findById(id);
    }

    @PostMapping("/videojuegos")
    public void addVideojuego(Videojuego v){
        vsi.saveVideojuego(v);
    }

    @PutMapping("/videojuegos/{id}")
    public Videojuego updateJuego(@PathVariable Long id, Videojuego v){
        vsi.updateVideojuego(id,v);
        return v;
    }

    @DeleteMapping("/videojuegos/{id}")
    public void deleteVideojuego(@PathVariable Long id){
        vsi.deleteVideojuego(id);
    }
}
