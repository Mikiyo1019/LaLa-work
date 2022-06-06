package world;

public class Dog extends Animal {
	//全部空だと、コンストラクタ以外は引き継がれる
	public void roar() {
		System.out.println(this.getName() + "は吠えた");
		System.out.println("hpが1減った");
		this.setHp(this.getHp() -1);
	}
}
