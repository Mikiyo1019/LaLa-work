package chap11;

import world.Dancer;
import world.Hero;
import world.Matango;

public class Main {

	public static void main(String[] args) {
		Matango m = new Matango('A');
		Dancer dancer = new Dancer();
		dancer.attack(m);
		dancer.run();
		dancer.sleep();
		
		Hero h = new Hero("マシリト");
		h.attack(m);
		h.run();
		
	}

}
