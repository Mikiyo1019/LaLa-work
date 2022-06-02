package chap11;

import world.DeathBat;
import world.Goblin;
import world.Hero;
import world.SuperHero;
import world.WereWolf;

public class Main433 {

	public static void main(String[] args) {
		Goblin goblin = new Goblin();
		
		goblin.attack();
		goblin.run();
		System.out.println("HP:" + goblin.hp);
		System.out.println("MP:" + goblin.mp);
		
		WereWolf w = new WereWolf();
		w.attack();
		w.run();
		System.out.println("HP:" + w.hp);
		System.out.println("MP:" + w.mp);

		DeathBat d = new DeathBat(70);
		
		//d.hp = 60;
		//d.mp = 5;
		
		d.attack();
		d.run();
		System.out.println("HP:" + d.hp);
		System.out.println("MP:" + d.mp);

	}
	
	Hero h = new Hero("田中");
	//h.run();
	
	SuperHero sh = new SuperHero("前田");
	//sh.run();

}
