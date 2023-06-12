package com.example.searchpharma.controller;

import com.example.searchpharma.entity.Produtos;
import com.example.searchpharma.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
@AllArgsConstructor
public class ProdutosController {
    final private ProdutoService service;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produtos>> buscarMedicamentos(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarProdutos(id));
    }
}
