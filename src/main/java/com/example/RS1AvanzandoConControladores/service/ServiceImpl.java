package com.example.RS1AvanzandoConControladores.service;

import com.example.RS1AvanzandoConControladores.clases.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImpl {

    List<Persona> listaPersonas = new ArrayList<>();

    public String obtenerPersonaPorId(int id)
    {
        Persona p = new Persona();
        for(Persona it: listaPersonas)
        {
            if(it.getId() == id)
            {
                p = it;
            }
        }
        System.out.println(p.toString());
        return p.toString();
    }

    public String obtenerPersonaPorNombre(String nombre)
    {
        Persona p = new Persona();
        for(Persona it: listaPersonas)
        {
            if(it.getNombre().equals(nombre))
            {
                p = it;
            }
        }
        System.out.println(p.toString());
        return p.toString();
    }

    public void anhadirPersonaALista(Persona persona)
    {
        System.out.println(persona.toString());
        listaPersonas.add(persona);
    }

    public void borrarPersona(int id)
    {
        for(Persona it: listaPersonas)
        {
            if(it.getId() == id)
            {
                listaPersonas.remove(it);
            }
        }
    }

    public void modificarPersona(int id, Persona persona)
    {
        for(Persona it: listaPersonas)
        {
            if(it.getId() == id)
            {
                listaPersonas.remove(it);
                listaPersonas.add(persona);
            }
        }
    }
}
