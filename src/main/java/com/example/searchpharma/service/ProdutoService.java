package com.example.searchpharma.service;

import com.example.searchpharma.entity.Produtos;
import com.example.searchpharma.repository.ProdutosRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProdutoService {

    final private ProdutosRepository produtosRepository;

    public List<Produtos> buscarProdutos() {
        return produtosRepository.findAll();
    }
    public Optional<Produtos> buscarPorId(Long id){ return produtosRepository.findById(id);}
    public List<Produtos> filtrarPorTodos(String nome){ return produtosRepository.filtrarTodos(nome);}
    public List<Produtos> filtrarProdutos(String tipo, String nome){ return produtosRepository.filtro(tipo, nome);}
    public List<Produtos> filtrarPorTipo(String tipo) { return produtosRepository.filtrarPorTipo(tipo);}

    public List<Produtos> filtrarPorCategoria(String categoria) { return produtosRepository.filtrarPorCategoria(categoria);}

    public Produtos salvarProduto(final Produtos produtos) {
        return produtosRepository.save(produtos);
    }

    public Produtos setarCatalogo(final Boolean catalogo, final Long id) { return produtosRepository.setarCatalogo(catalogo, id);}

    public Produtos editarProduto(final Produtos produto){
        Produtos produtoSelecionado = buscarPorId(produto.getId()).get();
        produtoSelecionado.setNome(produto.getNome());
        produtoSelecionado.setTipo(produto.getTipo());
        produtoSelecionado.setCategoria(produto.getCategoria());
        produtoSelecionado.setPreco(produto.getPreco());
        produtoSelecionado.setQuantidadeEstoque(produto.getQuantidadeEstoque());
        produtoSelecionado.setCatalogo(produto.getCatalogo());
        produtoSelecionado.setImagem(produto.getImagem());
        return produtosRepository.save(produtoSelecionado);
    }

    public void deletarProduto(Long id){
        Produtos produto = buscarPorId(id).get();
        produtosRepository.delete(produto);
    }
}
