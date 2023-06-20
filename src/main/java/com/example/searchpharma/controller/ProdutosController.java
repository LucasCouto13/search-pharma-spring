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

@RestController
@RequestMapping("/produtos")
@AllArgsConstructor
public class ProdutosController {

    final private ProdutoService service;
    @GetMapping()
    public ResponseEntity<List<Produtos>> buscarProdutos(){
        return ResponseEntity.ok(service.buscarProdutos());
    }

    @GetMapping("/{nome}")
    public ResponseEntity<List<Produtos>> filtrarProdutos(@PathVariable() String nome){
        return ResponseEntity.ok(service.filtrarProdutos(nome));
    }
    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<List<Produtos>> filtrarPorTipo(@PathVariable() String tipo){
        return ResponseEntity.ok(service.filtrarPorTipo(tipo));
    }

    @PostMapping()
    public ResposeEntity<Produtos> salvarProduto(@RequestBody final Produto produto){
        ResponseEntity.ok.body(service.salvarProduto());
    }
}
