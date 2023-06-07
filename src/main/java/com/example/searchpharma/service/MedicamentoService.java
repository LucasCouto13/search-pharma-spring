package com.example.searchpharma.service;

import com.example.searchpharma.entity.Medicamento;
import com.example.searchpharma.repository.MedicamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MedicamentoService {

    final MedicamentoRepository repository;

    @Autowired
    public List<Medicamento> buscarMedicamentos(){
        return repository.findAll();
    }

//    public List<Medicamento> buscarPorNome(String nome){
//        return repository.findByNome(nome);
//    }
}
