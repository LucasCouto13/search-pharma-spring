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

@RestController
@RequestMapping("/cosmetico")
@AllArgsConstructor
public class CosmeticoController {

    final private CosmeticoService service;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("")
    public ResponseEntity<List<Cosmetico>> buscarCosmeticos(){
        return ResponseEntity.ok(service.buscarCosmeticos());
    }
    @GetMapping()
    public ResponseEntity<List<Cosmetico>> filtrarCosmeticos(String nome){
        return ResponseEntity.ok(service.filtrarCosmeticos(nome));
    }
}
