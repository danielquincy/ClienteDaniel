package com.examen.servicio;

import com.examen.model.entity.Persona;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class PersonaServicio {

    private final RestTemplate restTemplate;


    public Persona[] obtenerTodo() {
         Persona[] personaList = restTemplate.getForObject("http://localhost:8080/firstapi/personas/todo", Persona[].class);
        return personaList;
    }

    public void guardar(Persona persona) {
        restTemplate.postForObject("http://localhost:8080/firstapi/personas/guardar", persona , Persona.class);
    }

}
