package com.addressapi.adressapi.controller;

import com.addressapi.adressapi.model.Endereco;
import com.addressapi.adressapi.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/enderecos")
public class EnderecoController {
    @Autowired
    private ViaCepService viaCepService;

    @GetMapping("/{cep}")
    public Endereco buscarEndereco(@PathVariable String cep) {
        return viaCepService.buscarEnderecoPorCep(cep);
    }
}
