package com.senac.johnny.service;


import com.senac.johnny.repository.ChamadaAtendenteRepository;
import org.springframework.stereotype.Service;

@Service
public class ChamadaAtendenteService {
    private final ChamadaAtendenteRepository chamadaAtendenteRepository;

    public ChamadaAtendenteService(ChamadaAtendenteRepository chamadaAtendenteRepository) {
        this.chamadaAtendenteRepository = chamadaAtendenteRepository;
    }
}
