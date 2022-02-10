package controllers;

import java.util.ArrayList;

import controllers.layer.iCRUDOrnamental;
import models.Cactus;
import models.Ornamental;

public class CRUDOrnamental implements iCRUDOrnamental{
	
	private Ornamental orna;


	public String addOrnamental(Ornamental ornamental) {
		
		this.orna=ornamental;
		return "Ornamental plant added";
	}
	
	public Ornamental getOrna() {
		return orna;
	}

}
