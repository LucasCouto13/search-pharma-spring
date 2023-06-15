package com.example.searchpharma.controller;

import com.example.searchpharma.entity.Cosmetico;
import com.example.searchpharma.service.CosmeticoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cosmetico")
@AllArgsConstructor
public class CosmeticoController {

    final private CosmeticoService service;
//    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("")
    public ResponseEntity<List<Cosmetico>> buscarCosmeticos(){
        return ResponseEntity.ok(service.buscarCosmeticos());
    }
//    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/filtrar/batom")
    public ResponseEntity<List<Optional<Cosmetico>>> filtrarCosmeticos(){
        return ResponseEntity.ok(service.filtrarBatons());
    }
//    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/filtrar/delineado")
    public ResponseEntity<List<Optional<Cosmetico>>> filtrarDelineado(){
        return ResponseEntity.ok(service.filtrarDelineados());
    }
}
