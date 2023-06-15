package com.example.searchpharma.repository;

import com.example.searchpharma.entity.Cosmetico;
import com.example.searchpharma.entity.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
    @Query(value = "SELECT id, nome, preco, imagem, generico, controlado FROM medicamento where controlado is true", nativeQuery = true)
    List<Optional<Medicamento>> filtrarControlado();
    @Query(value = "SELECT id, nome, preco, imagem, generico, controlado FROM medicamento where generico is true", nativeQuery = true)
    List<Optional<Medicamento>> filtrarGenerico();
}
