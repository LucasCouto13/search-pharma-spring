package com.example.searchpharma.repository;

import com.example.searchpharma.entity.Medicamento;
import com.example.searchpharma.entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    @Query(value = "SELECT * FROM produto WHERE tipo=:tipo AND nome LIKE CONCAT ('%',:produto,'%')", nativeQuery = true)
    List<Produtos> filtro(String tipo, String produto);

    @Query(value = "SELECT * FROM produto WHERE tipo =:tipo", nativeQuery = true)
    List<Produtos> filtrarPorTipo(String tipo);

    @Query(value = "SELECT * FROM produto where categoria =:categoria", nativeQuery = true)
    List<Produtos> filtrarPorCategoria(String categoria);

    @Query(value = "UPDATE produto SET catalogo=:catalogo WHERE id=:id", nativeQuery = true)
    Produtos setarCatalogo(Boolean catalogo, Long id);
}
