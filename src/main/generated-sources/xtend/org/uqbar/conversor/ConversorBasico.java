package org.uqbar.conversor;

@SuppressWarnings("all")
public class ConversorBasico {
  private static double FACTOR_CONVERSION_MILLAS_KM = 1.60934;
  
  public double convertir(final double millas) {
    return (millas * ConversorBasico.FACTOR_CONVERSION_MILLAS_KM);
  }
}
