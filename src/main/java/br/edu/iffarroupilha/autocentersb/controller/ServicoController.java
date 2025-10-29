package br.edu.iffarroupilha.autocentersb.controller;

import br.edu.iffarroupilha.autocentersb.model.Cliente;
import br.edu.iffarroupilha.autocentersb.model.Servico;
import br.edu.iffarroupilha.autocentersb.model.service.ClienteService;
import br.edu.iffarroupilha.autocentersb.model.service.ServicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servico")
public class ServicoController {

    private final ServicoService servicoService;
    private ServicoService servico;

    public ServicoController(ServicoService servico, ServicoService servicoService) {
        this.servico = servico;
        this.servicoService = servicoService;
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping()
    public List<Servico> listarServico() {

        return servico.buscarTodos();
    }

    @CrossOrigin("http://localhost:4200")
    @PostMapping
    public void cadastrarNovoServico(@RequestBody Servico servico)
    {
        servicoService.salvar(servico);
    }

    @PutMapping
    public void atualizarServico(@RequestBody Servico servico)
    {
        servicoService.salvar(servico);
    }

    @DeleteMapping("/{idServico}")
    public void deletarServico(@RequestParam Long idServico) {

        servico.delete(idServico);
    }

    @GetMapping("/busca-por-descricao/{termo}")
    public List<Servico> teste(@PathVariable String termo){
        return  servico.buscaPorDescricao(termo);
    }
}
