package org.uqbar.conversor;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.annotations.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
public class ConversorSincronizado {
  private static double FACTOR_CONVERSION_MILLAS_KM = 1.60934;
  
  private double millas;
  
  private double kilometros;
  
  public void setMillas(final double millas) {
    this.millas = millas;
    this.kilometros = (millas * ConversorSincronizado.FACTOR_CONVERSION_MILLAS_KM);
  }
  
  public void setKilometros(final double kilometros) {
    this.kilometros = kilometros;
    this.millas = (kilometros / ConversorSincronizado.FACTOR_CONVERSION_MILLAS_KM);
  }
  
  @Pure
  public double getMillas() {
    return this.millas;
  }
  
  @Pure
  public double getKilometros() {
    return this.kilometros;
  }
}
