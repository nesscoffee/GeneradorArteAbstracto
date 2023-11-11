package main;

import java.awt.Graphics;

import interfaz.Interfaz;
import pintores.*;

public class GeneradorArteAbstracto {

	public static void main(String[] args) {
		
		Interfaz interfaz = new Interfaz();
		interfaz.desplegarInterfaz();
		
		Graphics g = interfaz.getInterfazGraphics();
		PintorLunares lunares = new PintorLunares();
		PintorRayas rayas = new PintorRayas();
		rayas.pintar(g);
		
		interfaz.actualizarInterfaz();

	}

}
