package br.edu.iffarroupilha.autocentersb.model.service;

import br.edu.iffarroupilha.autocentersb.model.Cliente;
import br.edu.iffarroupilha.autocentersb.model.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente salvar(Cliente novoCliente){
        return clienteRepository.save(novoCliente);
    }
    public List<Cliente> buscarTodos(){
        return this.clienteRepository.findAll();
    }

    public void delete(Long idCliente){
        this.clienteRepository.deleteById(idCliente);
    }

}
