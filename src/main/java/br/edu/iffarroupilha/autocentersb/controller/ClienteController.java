package br.edu.iffarroupilha.autocentersb.controller;

import br.edu.iffarroupilha.autocentersb.model.Cliente;
import br.edu.iffarroupilha.autocentersb.model.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteService servico;

    public ClienteController(ClienteService servico) {
        this.servico = servico;
    }

    @GetMapping
    public String teste(){
        Cliente teste = new Cliente();
        teste.setIdCliente(3);
        teste.setNome(" professor atualizado");
        teste.setCpf("1234567890");
        teste.setTelefone("55981058846");
       teste =  servico.salvar(teste );
        return "Funcionou API, o idgerado foi "+teste.getIdCliente();
    }
    @GetMapping("/list")
    public List<Cliente> listarCliente(){
        return servico.buscarTodos();
    }

    @PostMapping
    public void cadastrarNovoCliente(
             @RequestParam String nome,
             @RequestParam String cpf,
             @RequestParam String telefone
             ){
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setCpf(cpf);
        c.setTelefone(telefone);
        servico.salvar(c);

        System.out.println(
                "Cadastrando novo cliente: "
                +
                c.getIdCliente()
        );
    }
}
