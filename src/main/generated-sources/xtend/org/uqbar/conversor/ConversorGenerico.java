package org.uqbar.conversor;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.annotations.Dependencies;
import org.uqbar.commons.model.annotations.Observable;
import org.uqbar.conversor.Conversion;
import org.uqbar.conversor.GramosAOnzaConversion;
import org.uqbar.conversor.KmAMillasConversion;
import org.uqbar.conversor.MillasAKmConversion;
import org.uqbar.conversor.OnzaAGramosConversion;

@Accessors
@Observable
@SuppressWarnings("all")
public class ConversorGenerico {
  private double input;
  
  private double output;
  
  private Conversion conversion;
  
  public void convertir() {
    double _convertir = this.conversion.convertir(this.input);
    this.output = _convertir;
  }
  
  @Dependencies("conversion")
  public boolean isPuedeConvertir() {
    return (!Objects.equal(this.conversion, null));
  }
  
  public List<? extends Conversion> getConversionesPosibles() {
    MillasAKmConversion _millasAKmConversion = new MillasAKmConversion();
    KmAMillasConversion _kmAMillasConversion = new KmAMillasConversion();
    OnzaAGramosConversion _onzaAGramosConversion = new OnzaAGramosConversion();
    GramosAOnzaConversion _gramosAOnzaConversion = new GramosAOnzaConversion();
    return Collections.<Conversion>unmodifiableList(CollectionLiterals.<Conversion>newArrayList(_millasAKmConversion, _kmAMillasConversion, _onzaAGramosConversion, _gramosAOnzaConversion));
  }
  
  @Pure
  public double getInput() {
    return this.input;
  }
  
  public void setInput(final double input) {
    this.input = input;
  }
  
  @Pure
  public double getOutput() {
    return this.output;
  }
  
  public void setOutput(final double output) {
    this.output = output;
  }
  
  @Pure
  public Conversion getConversion() {
    return this.conversion;
  }
  
  public void setConversion(final Conversion conversion) {
    this.conversion = conversion;
  }
}
