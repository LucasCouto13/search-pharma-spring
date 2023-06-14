package com.example.searchpharma.controller;

import com.example.searchpharma.entity.Outros;
import com.example.searchpharma.service.OutrosService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/outros")
@AllArgsConstructor
public class OutrosController {
    final private OutrosService service;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping()
    public ResponseEntity<List<Outros>> buscarOutros(){
        return ResponseEntity.ok(service.buscarOutros());
    }
}
