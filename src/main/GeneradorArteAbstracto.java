package main;

import java.awt.Graphics;
import java.util.Random;

import interfaz.Interfaz;
import pintores.*;

public class GeneradorArteAbstracto {

	public static void main(String[] args) {
		
		Interfaz interfaz = new Interfaz();
		interfaz.desplegarInterfaz();
		
		Pintor pintor = new PintorLunares();
		
		PintorLunares lunares = new PintorLunares();
		PintorRayas rayas = new PintorRayas();
		PintorPoligonos poligonos = new PintorPoligonos();
		
		while (true) {
			Random random = new Random();
			int rand = random.nextInt(3);
			
			switch (rand) {
			case 0:
				pintor = lunares;
				break;
			case 1:
				pintor = rayas;
				break;
			case 2:
				pintor = poligonos;
				break;
			}
			
			Graphics g = interfaz.getInterfazGraphics();
			pintor.pintar(g);
			
			interfaz.actualizarInterfaz();
			
			try { 
				Thread.sleep(300);
	        } catch (InterruptedException ex) {
	        	System.out.println(ex);
	        }
		}

	}

}
