package pintores;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class PintorLunares implements Pintor {
	private static final int RADIO_MINIMO = 10;
	private static final int RADIO_MAXIMO = 100;

	@Override
	public void pintar(Graphics graphics) {
		Random random = new Random();
		
		int x = random.nextInt(1000);
		int y = random.nextInt(1000);
		int radio = random.nextInt(RADIO_MAXIMO - RADIO_MINIMO) + RADIO_MINIMO;
		int red = random.nextInt(255);
		int green = random.nextInt(255);
		int blue = random.nextInt(255);
		
		Color color = new Color(red, green, blue);
		graphics.setColor(color);
		graphics.fillOval(x - radio, y - radio, radio * 2, radio * 2);
	}

}
