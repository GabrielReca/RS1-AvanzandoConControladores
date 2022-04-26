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
        return listaPersonas.get(id).toString();
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
        listaPersonas.remove(id);
    }

    public void modificarPersona(int id, Persona persona)
    {
        listaPersonas.remove(id);
        listaPersonas.add(persona);
    }
}
