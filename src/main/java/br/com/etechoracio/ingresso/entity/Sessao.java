package br.com.etechoracio.ingresso.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;


@Setter
@Getter
@Entity
@Table(name ="TBL_SESSAO")
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SESSAO")
    private Long id;

    @Column(name = "DT_DATA")
    private LocalDate data;

    @Column(name = "DT_HORARIO")
    private LocalTime horario;

    @ManyToOne
    @JoinColumn(name = "FILME_ID")
    //1:N
    private Filme filme;

    @Column(name = "PRECO")
    private double preco;

    @Column(name = "TX_SALA")
    private String sala;
}
