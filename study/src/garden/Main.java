package garden;

import garden.Flower.Leaf;

public class Main {

	public static void main(String[] args) {
		Flower f = new Flower("あじさい");
		f.bloom();
		Leaf l = f.makeLeaf();
		
		Rose r = new Rose("バラ");
		r.smell();
		r.bloom();
		
//		Leaf l  = new Leaf("葉");
//		System.out.println(l.getName());


	}

}
