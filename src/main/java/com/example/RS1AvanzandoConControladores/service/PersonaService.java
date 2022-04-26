package com.example.RS1AvanzandoConControladores.service;

import com.example.RS1AvanzandoConControladores.clases.Persona;

public interface PersonaService {

    void anhadirPersonaALista(Persona persona);

    String obtenerPersonaPorId();

    String obtenerPersonaPorNombre();

    void borrarPersona();

    void modificarPersona();
}
