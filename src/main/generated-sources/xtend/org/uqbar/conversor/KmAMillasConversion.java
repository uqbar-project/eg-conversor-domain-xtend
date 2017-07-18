package org.uqbar.conversor;

import org.uqbar.conversor.Conversion;

@SuppressWarnings("all")
public class KmAMillasConversion extends Conversion {
  @Override
  public double convertir(final double input) {
    return (input / 1.60934);
  }
  
  @Override
  public String getNombre() {
    return "km -> millas";
  }
}
