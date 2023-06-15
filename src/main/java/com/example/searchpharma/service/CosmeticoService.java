package com.example.searchpharma.service;

import com.example.searchpharma.entity.Cosmetico;
import com.example.searchpharma.entity.Medicamento;
import com.example.searchpharma.repository.CosmeticoRepository;
import com.example.searchpharma.repository.MedicamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CosmeticoService {

    final CosmeticoRepository repository;

    @Autowired
    public List<Cosmetico> buscarCosmeticos(){
        return repository.findAll();
    }

    public List<Optional<Cosmetico>> filtrarBatons(){
        return repository.filtrarBatons();
    }

    public List<Optional<Cosmetico>> filtrarDelineados(){
        return repository.filtrarDelineado();
    }
}
