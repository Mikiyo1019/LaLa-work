package ex_11;

public class Computer extends TangibleAsset {
	String makerName;
	//double weight;
	
	public Computer (String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	
	public String getMakerName() {return this.makerName;}
	/*
	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}
	 */
}
