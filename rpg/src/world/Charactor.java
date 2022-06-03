package world;

public abstract  class Charactor {
	public String name;//本来はpublicにはしない、
	public int hp;

	public Charactor() {}
	//public Chatactor(String name) {
		//this.name = name;
	//}
//	public void fireball(Matango m) {
//		System.out.println("火を出した");
//	}
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	//戦う
	public abstract void attack(Matango m);
	
	public void sleep() {
		System.out.println(this.name + "は眠った");
		System.out.println("HPは10ポイント回復した");
		this.hp += 10;
	}
	

	/*ソース→getter
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	*/
	
	
	
}
