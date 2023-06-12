package com.example.searchpharma.service;

import com.example.searchpharma.entity.Produtos;
import com.example.searchpharma.repository.ProdutosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProdutoService {

    final private ProdutosRepository produtosRepository;

    public Optional<Produtos> buscarProdutos(Long id) {
        return produtosRepository.findById(id);
    }
}
