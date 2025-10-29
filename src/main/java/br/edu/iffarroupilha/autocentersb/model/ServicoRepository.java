package br.edu.iffarroupilha.autocentersb.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {

    // busca todos os servicos pela descricao
    List<Servico> findByDescricao(String descricao);

}
