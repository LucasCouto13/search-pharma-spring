package com.example.searchpharma.controller;


import com.example.searchpharma.entity.Produtos;

import com.example.searchpharma.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
@AllArgsConstructor
public class ProdutosController {

    final private ProdutoService service;
    @GetMapping()
    public ResponseEntity<List<Produtos>> buscarProdutos(){
        return ResponseEntity.ok(service.buscarProdutos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produtos>> buscarPorId(@PathVariable() Long id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }
    @GetMapping("/filtra-Todos/{nome}")
    public ResponseEntity<List<Produtos>> filtrarTodos(@PathVariable() String nome){
        return ResponseEntity.ok(service.filtrarPorTodos(nome));
    }
    @GetMapping("/{tipo}/{nome}")
    public ResponseEntity<List<Produtos>> filtrarProdutos(@PathVariable() String tipo, @PathVariable() String nome){
        return ResponseEntity.ok(service.filtrarProdutos(tipo, nome));
    }
    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<List<Produtos>> filtrarPorTipo(@PathVariable() String tipo){
        return ResponseEntity.ok(service.filtrarPorTipo(tipo));
    }
    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<List<Produtos>> filtrarPorCategoria(@PathVariable() String categoria){
        return ResponseEntity.ok(service.filtrarPorCategoria(categoria));
    }

    @PostMapping()
    public ResponseEntity<Produtos> salvarProduto(@RequestBody final Produtos produto){
        return ResponseEntity.ok(service.salvarProduto(produto));
    }

    @PostMapping("/{catalogo}/{id}")
    public ResponseEntity<Produtos> setarCatalogo(@PathVariable() final Boolean catalogo, @PathVariable() Long id){
        return ResponseEntity.ok(service.setarCatalogo(catalogo, id));
    }

    @PutMapping()
    public ResponseEntity<Produtos> editarProduto(@RequestBody final Produtos produto) {
        return ResponseEntity.ok(service.editarProduto(produto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity.BodyBuilder deletarProduto(@PathVariable() Long id){
       service.deletarProduto(id);
       return ResponseEntity.ok();
    }
}
