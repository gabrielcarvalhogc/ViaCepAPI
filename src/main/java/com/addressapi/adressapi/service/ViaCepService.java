package com.addressapi.adressapi.service;

import com.addressapi.adressapi.model.Endereco;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepService {

    public final Endereco buscarEnderecoPorCep (String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String URL_VIACEP = "https://viacep.com.br/ws/%s/json/";
        String url = String.format(URL_VIACEP, cep);
        try {
            return restTemplate.getForObject(url, Endereco.class);
        } catch (RestClientException e) {
            throw new RestClientException("CEP não encontrado!");
        }
    }
}
