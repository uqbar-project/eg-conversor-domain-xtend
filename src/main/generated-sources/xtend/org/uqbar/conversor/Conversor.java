package org.uqbar.conversor;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.annotations.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
public class Conversor {
  private static double FACTOR_CONVERSION_MILLAS_KM = 1.60934;
  
  private double millas;
  
  private double kilometros;
  
  public double convertir() {
    return this.kilometros = (this.millas * Conversor.FACTOR_CONVERSION_MILLAS_KM);
  }
  
  @Pure
  public double getMillas() {
    return this.millas;
  }
  
  public void setMillas(final double millas) {
    this.millas = millas;
  }
  
  @Pure
  public double getKilometros() {
    return this.kilometros;
  }
  
  public void setKilometros(final double kilometros) {
    this.kilometros = kilometros;
  }
}
