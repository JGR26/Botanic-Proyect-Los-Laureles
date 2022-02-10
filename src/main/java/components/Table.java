package components;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import helpers.PrintData;
import models.Cactus;
import models.Ornamental;

public class Table {
	
	public JScrollPane createTable(JTable table) {
		
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "CODIGO", "NOMBRE", "DESCRIPCION", "COLOR","METODO DE CRIANZA"}));
		table.setBounds(10, 202, 509, 153);
		table.setPreferredScrollableViewportSize(new Dimension(450, 63));
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setVisible(true);
		scroll.setBounds(10, 202, 509, 153);
		return scroll;

	}

}
