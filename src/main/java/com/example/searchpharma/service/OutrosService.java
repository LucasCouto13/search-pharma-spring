package com.example.searchpharma.service;

import com.example.searchpharma.entity.Cosmetico;
import com.example.searchpharma.entity.Medicamento;
import com.example.searchpharma.entity.Outros;
import com.example.searchpharma.repository.MedicamentoRepository;
import com.example.searchpharma.repository.OutrosRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OutrosService {

    final OutrosRepository repository;
    @Autowired
    public List<Outros> buscarOutros(){
        return repository.findAll();
    }

    public List<Optional<Outros>> filtrarHigienePessoal(){
        return repository.filtrarHigienePessoal();
    }

    public List<Optional<Outros>> filtrarProdutosPele(){
        return repository.filtrarProdutosPeleRosto();
    }
}
