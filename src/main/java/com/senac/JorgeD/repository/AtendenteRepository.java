package com.senac.JorgeD.repository;

import com.senac.JorgeD.entity.Atendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendenteRepository extends JpaRepository<Atendente, Integer> {

}
