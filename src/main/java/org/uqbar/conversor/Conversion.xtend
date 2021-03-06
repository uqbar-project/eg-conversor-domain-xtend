package org.uqbar.conversor

import org.uqbar.commons.model.annotations.Observable

@Observable
abstract class Conversion {
	def double convertir(double input)
	def String getNombre()
}

class MillasAKmConversion extends Conversion {
	override convertir(double input) { return input * 1.60934 }
	override getNombre() { "millas -> km" }
}

class KmAMillasConversion extends Conversion {
	override convertir(double input) { return input / 1.60934 }
	override getNombre() { "km -> millas" }
}

class OnzaAGramosConversion extends Conversion {
	override convertir(double input) { return input * 28.3495231 }
	override getNombre() { "onza -> gr" }
}

class GramosAOnzaConversion extends Conversion {
	override convertir(double input) { return input / 28.3495231 }
	override getNombre() { "gr -> onza" }
}