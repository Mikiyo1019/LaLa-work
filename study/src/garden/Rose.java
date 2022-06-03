package garden;

public class Rose extends Flower {
	// このフィールドを有効にすると、smell()は、このフィールドを参照する。
	// したがって、null となる。
	// しかし、このままだと、親クラスのフィールドを参照する。
	// したがって、花 となる。
	//public String name;//name入れたらオーバーライドされる。基本しない
	
	public Rose() {}
	
	public Rose(String name) {
		super(name);//親のコンストラクタを呼び出して、親のフィールドに名前を設定している
	}
	
	public void smell () {
		System.out.println(this.name + "はいい香りがする。");
	}
}
