package org.uqbar.conversor

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class ConversorSincronizado {
	double millas
	double kilometros
	
	def void setMillas(double millas) {
		this.millas = millas
		this.kilometros = millas * 1.60934 
	}
	
	def void setKilometros(double kilometros) {
		this.kilometros = kilometros
		this.millas = kilometros / 1.60934
	}
	
}