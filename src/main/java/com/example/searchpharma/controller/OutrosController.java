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
import java.util.Optional;

@RestController
@RequestMapping("/outros")
@AllArgsConstructor
public class OutrosController {
    final private OutrosService service;

    @GetMapping()
    public ResponseEntity<List<Outros>> buscarOutros(){
        return ResponseEntity.ok(service.buscarOutros());
    }
    @GetMapping("/filtrar/higiene-pessoal")
    public ResponseEntity<List<Optional<Outros>>> filtrarHigienePessoal(){
         return ResponseEntity.ok(service.filtrarHigienePessoal());
    }
    @GetMapping("/filtrar/pele-rosto")
    public ResponseEntity<List<Optional<Outros>>> filtrarPeleRosto(){
        return ResponseEntity.ok(service.filtrarProdutosPele());
    }

}
