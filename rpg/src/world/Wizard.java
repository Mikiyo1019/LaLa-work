package world;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public Wizard(Wand wand) {
		this.setWand(wand);
//		if (wand == null) {
//			throw new IllegalArgumentException("杖は必ず必要です。");
//		}
		this.wand = wand;
	}
	
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した!");
	}

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
	
	//フィールドのgetter, setter
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if(hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
			}
	}

	public int getMp() {
		if (mp < 0) {
			throw new IllegalArgumentException("mpは0以上を入力。処理を中断。");
		}
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前は3文字以上を入力。処理を中断。");
		}
		this.name = name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("魔法使いは杖が必ず必要です");
		}
		this.wand = wand;
	}
}
