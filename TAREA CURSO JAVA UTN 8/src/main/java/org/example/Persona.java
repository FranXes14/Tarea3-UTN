package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Persona {


  @Getter @Setter private String nombre;
  @Getter @Setter  private String apellido;
  @Getter @Setter  private String fechaDeNacimuento;

}
