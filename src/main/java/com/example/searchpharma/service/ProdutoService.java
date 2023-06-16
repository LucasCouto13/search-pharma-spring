package com.example.searchpharma.service;

import com.example.searchpharma.entity.Produtos;
import com.example.searchpharma.repository.ProdutosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {

    final private ProdutosRepository produtosRepository;

    public List<Produtos> buscarProdutos() {
        return produtosRepository.findAll();
    }

    public List<Produtos> filtrarProdutos(String nome){ return produtosRepository.filtro(nome);}

    public List<Produtos> filtrarPorTipo(String tipo) { return produtosRepository.filtrarPorTipo(tipo);}
}
