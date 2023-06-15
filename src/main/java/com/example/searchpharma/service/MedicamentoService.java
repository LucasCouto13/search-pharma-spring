package com.example.searchpharma.service;

import com.example.searchpharma.entity.Medicamento;
import com.example.searchpharma.entity.Outros;
import com.example.searchpharma.repository.MedicamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MedicamentoService {

    final MedicamentoRepository repository;

    @Autowired
    public List<Medicamento> buscarMedicamentos(){
        return repository.findAll();
    }

    public List<Optional<Medicamento>> filtrarPorControlado(){
        return repository.filtrarControlado();
    }
    public List<Optional<Medicamento>> filtrarPorGenerico(){
        return repository.filtrarGenerico();
    }
}
