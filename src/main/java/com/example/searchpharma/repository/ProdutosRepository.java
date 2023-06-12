package com.example.searchpharma.repository;

import com.example.searchpharma.entity.Medicamento;
import com.example.searchpharma.entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
}
