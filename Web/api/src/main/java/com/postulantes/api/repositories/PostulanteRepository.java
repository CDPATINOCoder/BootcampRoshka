package com.postulantes.api.repositories;


import com.postulantes.api.entities.Postulante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostulanteRepository extends JpaRepository<Postulante, Integer> {
    Postulante findByNroCedula(int nroCedula);

}
