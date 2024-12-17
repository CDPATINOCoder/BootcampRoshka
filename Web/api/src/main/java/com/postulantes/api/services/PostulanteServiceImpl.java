package com.postulantes.api.services;

import com.postulantes.api.entities.Postulante;
import com.postulantes.api.repositories.PostulanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostulanteServiceImpl implements PostulanteService {

    @Autowired
    private PostulanteRepository postulanteRepository;

    @Override
    public List<Postulante> getPostulantes() {
        return postulanteRepository.findAll();
    }

    @Override
    public Postulante getPostulante(int nroCedula) {
        return postulanteRepository.findByNroCedula(nroCedula);
    }


}
