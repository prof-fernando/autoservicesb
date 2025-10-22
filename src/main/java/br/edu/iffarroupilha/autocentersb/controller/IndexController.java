package br.edu.iffarroupilha.autocentersb.controller;

import br.edu.iffarroupilha.autocentersb.model.Cliente;
import br.edu.iffarroupilha.autocentersb.model.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class IndexController {

    private ClienteService servico;

    public IndexController(ClienteService servico) {
        this.servico = servico;
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping()
    public String listarCliente() {
        return "deu certo !";
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
}
