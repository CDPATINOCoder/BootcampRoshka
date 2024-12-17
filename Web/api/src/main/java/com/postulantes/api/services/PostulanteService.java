package com.postulantes.api.services;

import org.springframework.stereotype.Service;
import com.postulantes.api.entities.Postulante;
import java.util.List;

@Service
public interface PostulanteService {
    List<Postulante> getPostulantes();

    Postulante getPostulante(int nroCedula);

}
