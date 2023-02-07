package com.ramonegido.entregaut5;

import com.ramonegido.entregaut5.model.Videojuego;

import java.util.List;
import java.util.Optional;

public interface VideojuegosService {
    List<Videojuego> findAll();
    Optional<Videojuego> findById(Long id);
    void saveVideojuego(Videojuego v);
    Videojuego updateVideojuego(Long id,Videojuego v);
    void deleteVideojuego(Long id);
}
