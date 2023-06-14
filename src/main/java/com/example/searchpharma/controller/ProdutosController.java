package com.example.searchpharma.controller;

import com.example.searchpharma.entity.Cosmetico;
import com.example.searchpharma.entity.Medicamento;
import com.example.searchpharma.entity.Outros;
import com.example.searchpharma.entity.Produtos;
import com.example.searchpharma.service.CosmeticoService;
import com.example.searchpharma.service.MedicamentoService;
import com.example.searchpharma.service.OutrosService;
import com.example.searchpharma.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
@AllArgsConstructor
public class ProdutosController {

}
