package world;

public class Wizard extends Charactor {
	public int mp;
	
	public void heal(Hero h) {
		//h.hp = h.hp + 10;
		System.out.println(h.getName() + "のHPを10回復した。");
	}

	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
	
	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った!");
		System.out.println("敵に20ポイントのダメージ!");
		m.hp -= 20;
		this.mp -= 5;
	}
}
