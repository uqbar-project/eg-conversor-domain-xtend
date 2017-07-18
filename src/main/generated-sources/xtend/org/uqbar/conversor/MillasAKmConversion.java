package org.uqbar.conversor;

import org.uqbar.conversor.Conversion;

@SuppressWarnings("all")
public class MillasAKmConversion extends Conversion {
  @Override
  public double convertir(final double input) {
    return (input * 1.60934);
  }
  
  @Override
  public String getNombre() {
    return "millas -> km";
  }
}
