package com.example.searchpharma.repository;

import com.example.searchpharma.entity.Cosmetico;
import com.example.searchpharma.entity.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CosmeticoRepository extends JpaRepository<Cosmetico, Long> {

    @Query(value = "SELECT id, nome, preco, imagem, categoria FROM cosmetico where categoria = 'Batom'", nativeQuery = true)
    List<Optional<Cosmetico>> filtrarBatons();
    @Query(value = "SELECT id, nome, preco, imagem, categoria FROM cosmetico where categoria = 'Pincel'", nativeQuery = true)
    List<Optional<Cosmetico>> filtrarDelineado();
}
