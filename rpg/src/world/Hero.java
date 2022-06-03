package world;

public class Hero {
	private String name;
	private int hp = 100;
	private Sword sword;
	
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
	public Hero(String name) {
		//super(name);
		this.name = name;
	}
	
	//nameのgetter
	public String getName() {
		return this.name;
	}
	//nameのsetter
	public void setName(String name) {
		this.name = name;
	}
	//hpのgetter
	public int getHp() {
		return this.hp;
	}
	//hpのsetter privateにしてHeroだけいじれるようにするとgood
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}
	
	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVERです");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		m.hp = m.hp - 5;
		System.out.println("敵に5ポイントのダメージを与えた。");
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
		this.hp -= 2;
		if(this.hp <= 0) {
			this.die();
		}
	}

	public void run() {
		System.out.println(this.name + "は、逃げ出した");
	}
}
