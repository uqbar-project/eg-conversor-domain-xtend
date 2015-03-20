package org.uqbar.conversor

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class ConversorModel {
	double millas
	double kilometros 
	
	def convertir() {
		kilometros = millas * 1.60934
	}
}
