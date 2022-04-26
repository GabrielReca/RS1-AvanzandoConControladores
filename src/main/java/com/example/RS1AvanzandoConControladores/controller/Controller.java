package com.example.RS1AvanzandoConControladores.controller;

import com.example.RS1AvanzandoConControladores.clases.Persona;
import com.example.RS1AvanzandoConControladores.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/persona")
public class Controller
{
    @Autowired
    ServiceImpl service;

    @GetMapping("/{id}")
    public String consultarPersonaPorId(@PathVariable int id)
    {
        return service.obtenerPersonaPorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public String consultarPersonaPorNombre(@PathVariable String nombre)
    {
        return service.obtenerPersonaPorNombre(nombre);
    }

    @PostMapping("/anhadirPersona")
    public void anhadirPersona(@RequestBody Persona persona)
    {
        service.anhadirPersonaALista(persona);
    }

    @PutMapping("/{id}")
    public void modificarPersona(@PathVariable int id, @RequestBody Persona persona)
    {
        service.modificarPersona(id, persona);
    }

    @DeleteMapping("/{id}")
    public void borrarPersona(@PathVariable int id)
    {
        service.borrarPersona(id);
    }
}
