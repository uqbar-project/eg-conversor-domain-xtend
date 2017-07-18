package org.uqbar.conversor;

import org.uqbar.conversor.Conversion;

@SuppressWarnings("all")
public class GramosAOnzaConversion extends Conversion {
  @Override
  public double convertir(final double input) {
    return (input / 28.3495231);
  }
  
  @Override
  public String getNombre() {
    return "gr -> onza";
  }
}
