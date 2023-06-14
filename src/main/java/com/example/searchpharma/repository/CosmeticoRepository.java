package com.example.searchpharma.repository;

import com.example.searchpharma.entity.Cosmetico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CosmeticoRepository extends JpaRepository<Cosmetico, Long> {

    @Query("SELECT cosmetico.id, cosmetico.nome, cosmetico.categoria, cosmetico.imagem, cosmetico.preco FROM Cosmetico cosmetico WHERE cosmetico.nome=:nome")
    List<Cosmetico> filtrarCosmeticos(String nome);
}
