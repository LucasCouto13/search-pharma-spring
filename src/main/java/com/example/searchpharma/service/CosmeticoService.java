package com.example.searchpharma.service;

import com.example.searchpharma.entity.Cosmetico;
import com.example.searchpharma.entity.Medicamento;
import com.example.searchpharma.repository.CosmeticoRepository;
import com.example.searchpharma.repository.MedicamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CosmeticoService {

    final CosmeticoRepository repository;

    @Autowired
    public List<Cosmetico> buscarCosmeticos(){
        return repository.findAll();
    }
    public List<Cosmetico> filtrarCosmeticos(String nome){
        return repository.filtrarCosmeticos(nome);
    }
}
