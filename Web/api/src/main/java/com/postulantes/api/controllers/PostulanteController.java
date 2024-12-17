package com.postulantes.api.controllers;

import com.postulantes.api.entities.Postulante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.postulantes.api.services.PostulanteService;

import java.util.List;

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
        return postulanteService.getPostulante(nroCedula);
    }
}
