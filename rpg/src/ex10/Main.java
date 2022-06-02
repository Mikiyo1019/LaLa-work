package ex10;

import world.Hero;
import world.PoisonMatango;

public class Main {

	public static void main(String[] args) {
		
		
		PoisonMatango pm = new PoisonMatango('X');
		
		Hero h = new Hero("ミナト");
		pm.attack(h);
		
		//SuperHero sh = new SuperHero("アサカ");
		//pm.attack(sh);
		
		//h.attack(pm);
		//sh.attack(pm);
	}

}

//SuperHero用のattackと、Hero用のメソッドがある（2種類ある）勝手に切り替わる
// attack(SuperHero):PoisonMatango
// attack(Hero): Matango
