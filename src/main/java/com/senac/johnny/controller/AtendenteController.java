package com.senac.johnny.controller;

import com.senac.johnny.entity.Atendente;
import com.senac.johnny.service.AtendenteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/atendente")
public class AtendenteController {
    private final AtendenteService atendenteService;

    public AtendenteController(AtendenteService atendenteService) {
        this.atendenteService = atendenteService;
    }

    @GetMapping("/listarTodos")
    public ResponseEntity <List<Atendente>> listarTodos(){
        return ResponseEntity.ok(atendenteService.listarTodos());
    }

    @GetMapping("/listarPorId/{id}")
    public ResponseEntity<Atendente> listarPorId(@PathVariable("id")Integer id){
        return ResponseEntity.ok(atendenteService.listarPorId(id));
    }

}
