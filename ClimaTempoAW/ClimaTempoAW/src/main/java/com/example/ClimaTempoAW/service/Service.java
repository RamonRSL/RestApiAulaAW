package com.example.ClimaTempoAW.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {
    public String preverTempo(){
        String apiUrl = "https://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=153c267152bbe0ed62f441946e6e572f";
        String dadosMeteorologicos = "";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()){

            dadosMeteorologicos = responseEntity.getBody();
        } else {
            dadosMeteorologicos = " Falha ao obter Dados meteorologicos" + responseEntity.getStatusCode();
        }
        return dadosMeteorologicos;
    }

}