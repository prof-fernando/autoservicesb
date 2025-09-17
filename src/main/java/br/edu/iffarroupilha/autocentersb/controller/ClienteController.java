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


    @GetMapping()
    public List<Cliente> listarCliente() {
        return servico.buscarTodos();
    }

    @PostMapping
    public void cadastrarNovoCliente(@RequestBody Cliente cliente) {
        servico.salvar(c);
    }

    @PutMapping
    public void cadastrarNovoCliente(@RequestBody Cliente cliente) {
        servico.salvar(c);
    }

    @DeleteMapping('/{idCliente}')
    public void cadastrarNovoCliente(@RequestParam Long idCliente) {
        servico.delete(idCliente);
    }
}
