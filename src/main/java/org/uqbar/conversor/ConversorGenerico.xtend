package org.uqbar.conversor

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import org.uqbar.conversor.Conversion
import org.uqbar.conversor.GramosAOnzaConversion
import org.uqbar.conversor.KmAMillasConversion
import org.uqbar.conversor.MillasAKmConversion
import org.uqbar.conversor.OnzaAGramosConversion

import static org.uqbar.commons.model.ObservableUtils.*

@Accessors
@Observable
class ConversorGenerico {
	double input
	double output
	Conversion conversion
	
	def void convertir() {
		output = conversion.convertir(this.input)
	}
	
	def setConversion(Conversion conversion) {
		this.conversion = conversion
		firePropertyChanged(this, "puedeConvertir", puedeConvertir)
	}
	
	def isPuedeConvertir() {
		conversion != null 
	}
	
	def getConversionesPosibles() {
		#[	new MillasAKmConversion, 
			new KmAMillasConversion, 
			new OnzaAGramosConversion, 
			new GramosAOnzaConversion
		]
	}
	
}