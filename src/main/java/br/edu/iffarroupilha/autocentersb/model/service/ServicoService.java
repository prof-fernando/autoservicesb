package br.edu.iffarroupilha.autocentersb.model.service;

import br.edu.iffarroupilha.autocentersb.model.Cliente;
import br.edu.iffarroupilha.autocentersb.model.ClienteRepository;
import br.edu.iffarroupilha.autocentersb.model.Servico;
import br.edu.iffarroupilha.autocentersb.model.ServicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    private ServicoRepository servicoRepository;

    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public Servico salvar(Servico novoServico){
        return servicoRepository.save(novoServico);
    }

    public List<Servico> buscarTodos(){
        return this.servicoRepository.findAll();
    }

    public void delete(Long idServico)
    {
        this.servicoRepository.deleteById(idServico);
    }

    public List<Servico> buscaPorDescricao(String termo){
        return this.servicoRepository.findByDescricao(termo);
    }
}
