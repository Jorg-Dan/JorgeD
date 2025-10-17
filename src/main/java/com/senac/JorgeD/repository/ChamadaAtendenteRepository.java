package com.senac.JorgeD.repository;

import com.senac.JorgeD.entity.ChamadaAtendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamadaAtendenteRepository extends JpaRepository<ChamadaAtendente, Integer> {

}
