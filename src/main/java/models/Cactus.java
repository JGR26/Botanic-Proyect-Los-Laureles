package models;

import planta.layer.iPlanta;

public class Cactus extends Planta implements iPlanta{
	
	
	@Override
	public String colorDeFlor(String color) {
		
		return "No tienen Flor.";
	}

	public String metodoDeCrianza() {
		
		return "uso de sustrato y luz directa";
	}
}
