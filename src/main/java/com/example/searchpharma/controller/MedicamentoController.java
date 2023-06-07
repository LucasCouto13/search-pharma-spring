package com.example.searchpharma.controller;

import com.example.searchpharma.entity.Medicamento;
import com.example.searchpharma.service.MedicamentoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medicamento")
@AllArgsConstructor
public class MedicamentoController {

    final private MedicamentoService service;

    @GetMapping()
    public ResponseEntity<List<Medicamento>> buscarMedicamentos(){
        return ResponseEntity.ok(service.buscarMedicamentos());
    }
}
