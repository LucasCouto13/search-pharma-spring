package com.example.searchpharma.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="medicamento")
public class Medicamento implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String SEQ = "medicamento_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = SEQ, sequenceName = SEQ, allocationSize = 1)
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="preco")
    private Float preco;

    @Column(name="controlado")
    private Boolean controlado;

    @Column(name="generico")
    private Boolean generico;

    @Column(name="imagem")
    private String imagem;
}
