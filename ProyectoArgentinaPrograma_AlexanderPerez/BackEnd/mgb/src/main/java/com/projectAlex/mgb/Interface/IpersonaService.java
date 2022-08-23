package com.projectAlex.mgb.Interface;

import com.projectAlex.mgb.Entity.Persona;
import java.util.List;


public interface IpersonaService {
   
    //Lista Persona    
    public List<Persona> getPersona();

    //Guarda Personas
    public void guardarPersona(Persona persona);
    
    //Elimina Personas
    public void deletePersona(Long id);
    
    //Busca Persona
    public Persona buscaPersona(Long id);

    public Persona buscaPersona(int i);
    
    
}