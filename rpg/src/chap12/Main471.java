package chap12;

import world.Matango;
import world.Wand;
import world.Wizard;

public class Main471 {

	public static void main(String[] args) {
		//Charactor c = new Wizard();拡張時
		Wand wand = new Wand("魔法の杖");
		Wizard c = new Wizard(wand);
		
		if(c instanceof Wizard) {
			System.out.println("いいよ");
		}
		
		Wizard w = (Wizard)c;
		Matango m = new Matango();
		w.setName("アサカ");
		w.attack(m);
		
//		if(c instanceof Hero) {
//			Hero h = (Hero) c;
//			h.attack(m);
//		} else {
//			System.out.println("cのインスタンスはHeroではない");
//		}
//		
		//c.fireball(m);
	}

}
