package com.ramonegido.entregaut5;

import com.ramonegido.entregaut5.model.Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideojuegosServiceImpl implements VideojuegosService{
    @Autowired
    VideojuegosRepository vr;
    @Override
    public List<Videojuego> findAll() {
        return (List<Videojuego>) vr.findAll();
    }

    @Override
    public Optional<Videojuego> findById(Long id) {
        return vr.findById(id);
    }

    @Override
    public void saveVideojuego(Videojuego v) {
        vr.save(v);
    }

    @Override
    public Videojuego updateVideojuego(Long id, Videojuego v) {
        if(vr.findById(id).isPresent()){
            vr.save(v);
        }
        return v;
    }

    @Override
    public void deleteVideojuego(Long id) {
        vr.deleteById(id);
    }
}
