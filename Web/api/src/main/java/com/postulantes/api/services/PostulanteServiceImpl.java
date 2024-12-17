package com.postulantes.api.services;

import com.postulantes.api.entities.Postulante;
import com.postulantes.api.repositories.PostulanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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

    @Override
    public Postulante createPostulante(Postulante postulante) {
        return postulanteRepository.save(postulante);
    }

    @Override
    public Postulante actualizarPostulante(int nroCedula, Postulante postulanteActualizado) {
        Postulante postulante = postulanteRepository.findByNroCedula(nroCedula);
        if (postulante == null) {
            throw new NoSuchElementException("Postulante no encontrado con nroCedula: " + nroCedula);
        }
        postulante.setNombre(postulanteActualizado.getNombre());
        postulante.setApellido(postulanteActualizado.getApellido());
        postulante.setCorreo(postulanteActualizado.getCorreo());
        postulante.setTelefono(postulanteActualizado.getTelefono());
        postulante.setDireccion(postulanteActualizado.getDireccion());
        postulante.setExperienciaLaboral(postulanteActualizado.getExperienciaLaboral());
        postulante.setEstudioUniversitario(postulanteActualizado.getEstudioUniversitario());
        postulante.setNotebook(postulanteActualizado.getNotebook());
        postulante.setAceptado(postulanteActualizado.getAceptado());
        return postulanteRepository.save(postulante);
    }



}
