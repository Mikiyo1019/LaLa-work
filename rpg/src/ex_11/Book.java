package ex_11;

public class Book extends TangibleAsset {
	String isbn;
	//double weight;
	
	public Book (String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	public String getIsbn() {return this.isbn;}
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
