package world;

public class PoisonMatango extends Matango {
	int poisoncount = 5;
	
	public PoisonMatango (char suffix) {
		super(suffix);
		this.poisoncount = 10;
	}
	
	public void attack (Hero h) {//オーバーライドしてる(親のメソッドを上書き)
		System.out.println("PisonMatnagoの攻撃");
		super.attack(h);
		if (this.poisoncount > 0) {//ここで宣言したpcountを呼び出す
			System.out.println(this.suffix + "は更に毒の胞子をばらまいた!");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(h.name + "に" + dmg + "ポイントのダメージ");
			this.poisoncount--;
			System.out.println("毒攻撃の残り回数:" + poisoncount);
			System.out.println(h.name + "のhp:" + h.hp);
		}
	}
	
}