package com.projectAlex.mgb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1 , max = 45 , message = "Longitud no válida")    
    private String nombre;
    
    @NotNull
    @Size(min = 1 , max = 45 , message = "Longitud no válida")    
    private String apellido;
    
   @Size(min = 1 , max = 45 , message = "Longitud no válida")    
    private String img;   
   
}
