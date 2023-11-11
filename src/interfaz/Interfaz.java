package interfaz;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfaz {
	
	private JFrame frame;
	private JPanel panel;
	private BufferedImage buffer;
	
	public void desplegarInterfaz() {
		frame = new JFrame("Generador de arte abstracto");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(buffer, 0, 0, null);
			}
		};
		buffer = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public Graphics getInterfazGraphics() {
		return buffer.getGraphics();
	}
	
	public void actualizarInterfaz() {
		panel.validate();
		panel.repaint();
	}

}
