package pintores;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class PintorPoligonos implements Pintor {
	private static final int MINIMO_LADOS = 3;
	private static final int MAXIMO_LADOS = 10;
	private static final int TAMANO_MINIMO = 10;
	private static final int TAMANO_MAXIMO = 100;
	private int[] puntosX;
	private int[] puntosY;

	@Override
	public void pintar(Graphics graphics) {
		Random random = new Random();
		
		int x = random.nextInt(1000);
		int y = random.nextInt(1000);
		int lados = random.nextInt(MAXIMO_LADOS - MINIMO_LADOS) + MINIMO_LADOS;
		int size = random.nextInt(TAMANO_MAXIMO - TAMANO_MINIMO) + TAMANO_MINIMO;
		int red = random.nextInt(255);
		int green = random.nextInt(255);
		int blue = random.nextInt(255);
		puntosX = new int[lados];
		puntosY = new int[lados];
		
		Color color = new Color(red, green, blue);
		graphics.setColor(color);
		
		for(int i = 0; i < lados; i++) {
			double ang = 2 * Math.PI * i / lados;
			puntosX[i] = (int) (x + size * Math.cos(ang));
			puntosY[i] = (int) (y + size * Math.sin(ang));
		}
		graphics.fillPolygon(puntosX, puntosY, lados);
		
	}

}
