package org.uqbar.conversor

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Dependencies
import org.uqbar.commons.utils.Observable

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
		// con la annotation dependencies no hace falta esta línea
		// firePropertyChanged(this, "puedeConvertir", puedeConvertir)
	}
	
	// la annotation de abajo indica que puedeConvertir 
	// depende de la propiedad conversion
	@Dependencies("conversion") 
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