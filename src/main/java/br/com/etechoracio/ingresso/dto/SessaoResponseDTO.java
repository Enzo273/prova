package br.com.etechoracio.ingresso.dto;


import java.time.LocalDate;
import java.time.LocalTime;

public record SessaoResponseDTO(
        Long id,
        LocalDate data,
        LocalTime horario,
        double preco,
        String sala
) {
}
