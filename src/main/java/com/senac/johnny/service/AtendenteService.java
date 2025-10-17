package com.senac.johnny.service;


import com.senac.johnny.entity.Atendente;
import com.senac.johnny.repository.AtendenteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AtendenteService {
    private final AtendenteRepository atendenteRepository;

    public AtendenteService(AtendenteRepository atendenteRepository) {
        this.atendenteRepository = atendenteRepository;
    }

    public List<Atendente> listarTodos(){
        return atendenteRepository.findAll();
    };

    public Atendente listarPorId(Integer id){
        return atendenteRepository.findById(id).orElse(null);
    };

}
