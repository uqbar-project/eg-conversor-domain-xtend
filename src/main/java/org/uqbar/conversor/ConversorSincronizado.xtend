package org.uqbar.conversor

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.annotations.Observable

@Accessors
@Observable
class ConversorSincronizado {
	static double FACTOR_CONVERSION_MILLAS_KM = 1.60934
	
	double millas
	double kilometros
	
	def void setMillas(double millas) {
		this.millas = millas
		this.kilometros = millas * FACTOR_CONVERSION_MILLAS_KM 
	}
	
	def void setKilometros(double kilometros) {
		this.kilometros = kilometros
		this.millas = kilometros / FACTOR_CONVERSION_MILLAS_KM
	}
	
}