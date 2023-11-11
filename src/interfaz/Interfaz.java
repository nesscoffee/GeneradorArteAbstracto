package interfaz;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfaz {
	
	private JFrame frame;
	private JPanel panel;
	
	public void desplegarInterfaz() {
		frame = new JFrame("Generador de arte abstracto");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public Graphics getInterfazGraphics() {
		return panel.getGraphics();
	}
	
	public void actualizarInterfaz() {
		panel.paint(panel.getGraphics());
		panel.validate();
		panel.repaint();
	}

}
