package ex_11;

public abstract class TangibleAsset extends Asset implements Thing {
	String color;
	double weight;
	
	//コンストラクタ
	public TangibleAsset (String name, int price, String color) {
		super(name, price);
		this.color = color;
		this.weight = weight;//後からメソッドで入れてもok
	}
	
	//メソッド
	public String getColor() {return this.color;}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {//コンストラクタに入れてもok
		this.weight = weight;
	}
	
	
}
