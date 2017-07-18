package org.uqbar.conversor;

import org.uqbar.commons.model.annotations.Observable;

@Observable
@SuppressWarnings("all")
public abstract class Conversion {
  public abstract double convertir(final double input);
  
  public abstract String getNombre();
}
