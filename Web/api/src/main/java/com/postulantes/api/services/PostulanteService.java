package com.postulantes.api.services;

import org.springframework.stereotype.Service;
import com.postulantes.api.entities.Postulante;
import java.util.List;

@Service
public interface PostulanteService {
    List<Postulante> getPostulantes();

    Postulante getPostulante(int nroCedula);

    Postulante createPostulante(Postulante postulante);

    Postulante actualizarPostulante(int nroCedula, Postulante postulanteActualizado);

    void deletePostulante(int nroCedula);
}
