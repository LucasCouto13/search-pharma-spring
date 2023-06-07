package com.example.searchpharma.repository;

import com.example.searchpharma.entity.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

//    List<Medicamento> findByNome(String nome);
}
