package chap08;

import old.Matango;
import world.Hero;

public class Main307 {

	public static void main(String[] args) {
		// 勇者よ！この仮想世界に生まれよ
		Hero h = new Hero();
		// hフィールドに初期値をセット
		h.setName("ミナト");
		h.setHp(100);
		System.out.println("勇者" + h.getName() + "を生み出しました");
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		// 冒険の始まり
		// h.slip();
		m1.run();
		m2.run();
		h.run();
		
	}

}
