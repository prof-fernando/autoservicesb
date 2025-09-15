package br.edu.iffarroupilha.autocentersb.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numeroOrdem;
    @ManyToOne
    @JoinColumn(name = "id_veiculo", nullable = false)
    private Veiculo veiculo;
    @ManyToOne
    @JoinColumn(name = "id_servico", nullable = false)
    private Servico servico;
    private double valorTotar;
    @Column(nullable = false)
    private LocalDate data;
}
