package pintores;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class PintorRayas implements Pintor {
	
	private static final int ANCHO_MINIMO = 10;
	private static final int ANCHO_MAXIMO = 100;
	private static final int ALTURA_MINIMA = 10;
	private static final int ALTURA_MAXIMA = 100;

	@Override
	public void pintar(Graphics graphics) {
		Random random = new Random();
		
		int x = random.nextInt(1000);
		int y = random.nextInt(1000);
		int width = random.nextInt(ANCHO_MAXIMO - ANCHO_MINIMO) + ANCHO_MINIMO;
		int height = random.nextInt(ALTURA_MAXIMA - ALTURA_MINIMA) + ALTURA_MINIMA;
		int red = random.nextInt(255);
		int green = random.nextInt(255);
		int blue = random.nextInt(255);
		
		Color color = new Color(red, green, blue);
		graphics.setColor(color);
		graphics.fillRect(x, y, width, height);
		
	}

}
