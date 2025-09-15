package br.edu.iffarroupilha.autocentersb.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;
    @Column(nullable=false)
    private String nome;
    @Column(nullable=false, length=11)
    private String cpf;
    @Column(length = 11)
    private String telefone;

}
