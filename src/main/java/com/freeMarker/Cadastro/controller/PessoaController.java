package com.freeMarker.Cadastro.controller;

import com.freeMarker.Cadastro.entity.Pessoa;
import com.freeMarker.Cadastro.service.PessoaService;
import com.freeMarker.Cadastro.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

  @Autowired
  private QueryService queryService;
    @Autowired
    private PessoaService pessoaService;
    @GetMapping
    public String getAllPessoas(Model model) throws IOException {
        String sqlQuery = queryService.loadQuery("queries.sql");
        model.addAttribute("pessoas", pessoaService.findAll());
        return "pessoas"; // nome do arquivo .ftlh
    }

    @GetMapping("/add")
    public String addPessoaForm(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "add-pessoa";
    }

    @PostMapping("/add")
    public String addPessoa(@ModelAttribute Pessoa pessoa) {
        pessoaService.save(pessoa);
        return "redirect:/pessoas";
    }

    @GetMapping("/edit/{id}")
    public String editPessoaForm(@PathVariable Long id, Model model) {
        Optional<Pessoa> pessoaOpt = pessoaService.findById(id);
        if (pessoaOpt.isPresent()) {
            model.addAttribute("pessoa", pessoaOpt.get());
            return "edit-pessoa";
        }
        return "redirect:/pessoas";
    }

    @PostMapping("/edit/{id}")
    public String editPessoa(@PathVariable Long id, @ModelAttribute Pessoa pessoa) {
        pessoa.setId(id);
        pessoaService.save(pessoa);
        return "redirect:/pessoas";
    }

    @GetMapping("/delete/{id}")
    public String deletePessoa(@PathVariable Long id) {
        pessoaService.deleteById(id);
        return "redirect:/pessoas";
    }

}
