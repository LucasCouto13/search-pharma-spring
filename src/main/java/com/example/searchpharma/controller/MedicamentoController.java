package com.example.searchpharma.controller;

import com.example.searchpharma.entity.Medicamento;
import com.example.searchpharma.service.MedicamentoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicamento")
@AllArgsConstructor
public class MedicamentoController {

    final private MedicamentoService service;
//    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping()
    public ResponseEntity<List<Medicamento>> buscarMedicamentos(){
        return ResponseEntity.ok(service.buscarMedicamentos());
    }
//    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/filtrar/controlado")
    public ResponseEntity<List<Optional<Medicamento>>> filtrarMedicamentosControlados(){
        return ResponseEntity.ok(service.filtrarPorControlado());
    }
//    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/filtrar/generico")
    public ResponseEntity<List<Optional<Medicamento>>> filtrarMedicamentosGenericos(){
        return ResponseEntity.ok(service.filtrarPorGenerico());
    }
}
