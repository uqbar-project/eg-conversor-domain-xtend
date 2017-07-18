package org.uqbar.conversor

/**
 * 
 */
class ConversorBasico {
	static double FACTOR_CONVERSION_MILLAS_KM = 1.60934

	def convertir(double millas) {
		millas * FACTOR_CONVERSION_MILLAS_KM
	}

}
