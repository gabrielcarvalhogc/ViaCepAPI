package com.addressapi.adressapi.controller;

import com.addressapi.adressapi.model.Endereco;
import com.addressapi.adressapi.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/enderecos")
@CrossOrigin(origins = "http://localhost:4200")
public class EnderecoController {
    @Autowired
    private ViaCepService viaCepService;

    @GetMapping("/{cep}")
    public Endereco buscarEndereco(@PathVariable String cep) {
        return viaCepService.buscarEnderecoPorCep(cep);
    }
}
