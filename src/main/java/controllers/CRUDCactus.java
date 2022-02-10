package controllers;

import java.util.ArrayList;

import controllers.layer.iCRUDCactus;
import models.Cactus;

public class CRUDCactus implements iCRUDCactus{
	
	private Cactus cactus;


	public String addCactus(Cactus cactus) {
		

		this.cactus=cactus;
		
		return "Cactus added";
		
	}

	public Cactus getCact() {
		return cactus;
	}

	
	
}
