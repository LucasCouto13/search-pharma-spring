package com.example.searchpharma.repository;

import com.example.searchpharma.entity.Medicamento;
import com.example.searchpharma.entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    @Query(value = "SELECT * FROM produto WHERE nome LIKE CONCAT ('%',:produto,'%')", nativeQuery = true)
    List<Produtos> filtro(String produto);

    @Query(value = "SELECT * FROM produto WHERE tipo =:tipo", nativeQuery = true)
    List<Produtos> filtrarPorTipo(String tipo);
}
