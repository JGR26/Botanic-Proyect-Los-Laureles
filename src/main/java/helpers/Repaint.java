package helpers;

import javax.swing.JPanel;

public class Repaint {

	public void nuevoPanel(JPanel panelNuevo,JPanel Panel) {
		Panel.removeAll();
		Panel.add(panelNuevo);
		Panel.repaint();
		Panel.revalidate();

	}
}
