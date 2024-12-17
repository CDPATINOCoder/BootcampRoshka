package com.postulantes.api.controllers;

import com.postulantes.api.entities.Postulante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.postulantes.api.services.PostulanteService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class PostulanteController {

    @Autowired
    private PostulanteService postulanteService;


    @GetMapping("/postulantes")
    public List<Postulante> getPostulantes() {
        return postulanteService.getPostulantes();
    }

    @GetMapping("/postulantes/{nroCedula}")
    public Postulante getPostulante(@PathVariable int nroCedula) {
        Postulante postulante = postulanteService.getPostulante(nroCedula);
        if (postulante == null) {
            throw new NoSuchElementException("Postulante no encontrado con nroCedula: " + nroCedula);
        }
        return postulanteService.getPostulante(nroCedula);
    }

    @PostMapping("/postulantes")
    public ResponseEntity<Postulante> createPostulante(@RequestBody Postulante postulante) {
        Postulante nuevoPostulante = postulanteService.createPostulante(postulante);
        return new ResponseEntity<>(nuevoPostulante, HttpStatus.CREATED);
    }

    @PutMapping("/postulantes/{nroCedula}")
    public ResponseEntity<Postulante> updatePostulante(@PathVariable int nroCedula, @RequestBody Postulante postulanteActualizado) {
        try {
            Postulante postulante = postulanteService.actualizarPostulante(nroCedula, postulanteActualizado);
            return new ResponseEntity<>(postulante, HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
