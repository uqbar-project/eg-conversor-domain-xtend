package org.uqbar.conversor

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.annotations.Observable

@Accessors
@Observable
class Conversor {
	static double FACTOR_CONVERSION_MILLAS_KM = 1.60934
	
	double millas
	double kilometros 
	
	def convertir() {
		kilometros = millas * FACTOR_CONVERSION_MILLAS_KM
	}
	
}
