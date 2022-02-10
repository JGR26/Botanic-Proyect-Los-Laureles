package helpers;

import java.util.ArrayList;
import java.util.stream.Stream;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.Cactus;
import models.Ornamental;
import models.Planta;

public class PrintData {
	
	private int id;

	public void getDataOrna(JTable table,Ornamental orna) {
		

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		Object rows[] = new Object[6];
		if(orna !=null) {
			if(orna.getCodigo()!=null) {
				
				rows[0]=id;
				rows[1]=orna.getCodigo();
				rows[2]=orna.getNombre();
				rows[3]=orna.getDescripcion();
				rows[4]=orna.getColor();
				rows[5]=orna.metodoDeCrianza();
				model.addRow(rows);
				table.setModel(model);
				id++;
			}
		}
		
		
		
	}
	
	public void getDataCactus(JTable table,Cactus cactus) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		Object rows[] = new Object[6];
		if(cactus != null) {
			if(cactus.getNombre()!=null) {
				rows[0]=id;
				rows[1]=cactus.getCodigo();
				rows[2]=cactus.getNombre();
				rows[3]=cactus.getDescripcion();
				rows[4]=cactus.colorDeFlor("");
				rows[5]=cactus.metodoDeCrianza();
				model.addRow(rows);
				table.setModel(model);
				id++;
			}
		}
		
		
	}
	
	public void deleteTable(JTable table) {
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int i=table.getSelectedRow();
		
		model.removeRow(i);
		
	}
}
