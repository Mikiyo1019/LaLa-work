package ex10;

import world.Hero;
import world.PoisonMatango;//後でSuperHeroも足しておく

public class Main {

	public static void main(String[] args) {
		
		Hero h = new Hero("ミナト");
		h.attack();
		
		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h);
		
		
		
		//SuperHero sh = new SuperHero("アサカ");
		//pm.attack(sh);
		
		//h.attack(pm);s
		//sh.attack(pm);
	}

}
