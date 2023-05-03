package consultorio;

import consultorio.ventanas.Menu;

public class Programa{
	public static void main(String[] args) {
		int SEL = 0;
		
		Menu menu = new Menu();
		menu.main(null);
		SEL = menu.getSel();
	}
}