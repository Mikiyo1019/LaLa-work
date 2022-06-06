package garden;

public class Flower {
	public String fName;
	
	private Flower() {
		this.fName = "花";
	}
	public Flower(String name) {
		this.fName = name;
	}
	
	public void bloom() {
		System.out.println(this.fName + "が咲いた。");
	}
	//setNamt()を使って名前を入れてもらう
	//setName(String name) {
	//this.name = name;
	//}
	public String getName() {
		return fName;
	}
	public void setName(String name) {
		this.fName = name;
	}
	
	//別クラスを作ってみる(Flowerからしか呼び出せないLeafクラスを作る = 内部クラス)
		public Leaf makeLeaf() {
			Leaf l = new Leaf("葉");
			return l;
		}
		
		class Leaf {//public付けたら、別ファイルに分ける必要がある
			private String name;
			public Leaf(String name) {
				this.name = name;
				}
			
			public String getName() {
				return this.name;

			}
		}
	}




