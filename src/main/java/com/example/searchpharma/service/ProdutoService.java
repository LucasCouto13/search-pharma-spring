package com.example.searchpharma.service;

import com.example.searchpharma.entity.Produtos;
import com.example.searchpharma.repository.ProdutosRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {

    final private ProdutosRepository produtosRepository;

    public List<Produtos> buscarProdutos() {
        return produtosRepository.findAll();
    }
    public List<Produtos> filtrarProdutos(String tipo, String nome){ return produtosRepository.filtro(tipo, nome);}

    public List<Produtos> filtrarPorTipo(String tipo) { return produtosRepository.filtrarPorTipo(tipo);}

    public List<Produtos> filtrarPorCategoria(String categoria) { return produtosRepository.filtrarPorCategoria(categoria);}

    public Produtos salvarProduto(final Produtos produtos) {
        return produtosRepository.save(produtos);
    }

    public Produtos setarCatalogo(final Boolean catalogo, final Long id) { return produtosRepository.setarCatalogo(catalogo, id);}
}
