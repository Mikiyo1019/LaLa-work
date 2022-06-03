package world;

public class DeathBat extends FlyingMonster{
	
	public DeathBat () {//コンストラクタでhpの初期値を決める
		//super(hp);
		//this.hp = hpnum;
	}
	
	public void attack() {
		System.out.println("突っつく");
	}
}
