package com.example.searchpharma.repository;

import com.example.searchpharma.entity.Cosmetico;
import com.example.searchpharma.entity.Medicamento;
import com.example.searchpharma.entity.Outros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OutrosRepository extends JpaRepository<Outros, Long> {
    @Query(value = "SELECT id, nome, preco, imagem, categoria FROM outros where categoria = 'Higiene Pessoal'", nativeQuery = true)
    List<Optional<Outros>> filtrarHigienePessoal();
    @Query(value = "SELECT id, nome, preco, imagem, categoria FROM outros where categoria = 'Pele/Rosto'", nativeQuery = true)
    List<Optional<Outros>> filtrarProdutosPeleRosto();
}
