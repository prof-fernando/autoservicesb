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

    @CrossOrigin("http://localhost:4200")
    @GetMapping()
    public List<Cliente> listarCliente() {
        return servico.buscarTodos();
    }
    @CrossOrigin("http://localhost:4200")
    @PostMapping
    public void cadastrarNovoCliente(@RequestBody Cliente cliente) {
        servico.salvar(cliente);
    }

    @PutMapping
    public void atualizarCliente(@RequestBody Cliente cliente) {
        servico.salvar(cliente);
    }

    @DeleteMapping("/{idCliente}")
    public void cadastrarNovoCliente(@RequestParam Long idCliente) {
        servico.delete(idCliente);
    }

    @GetMapping("/teste")
    public String teste(){
        return "Deu certo CI/CD";
    }
}
