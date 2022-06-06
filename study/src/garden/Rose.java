package garden;

public class Rose extends Flower {
	// このフィールドを有効にすると、smell()は、このフィールドを参照する。
	// したがって、null となる。
	// しかし、このままだと、親クラスのフィールドを参照する。
	// したがって、花 となる。
	//public String name;//name入れたらオーバーライドされる。基本しない
	
	//public Rose() {}//名前設定しなかったら、null
	
	public Rose(String name) {
		//this.name = name;
		super(name);//親のコンストラクタを呼び出して、親のフィールドに名前を設定している
	}
	
	public void smell () {
		System.out.println(this.getName() + "はいい香りがする。");//this = Roseのインスタンス。getNameで親のメソッドが呼び出される
	}
}
