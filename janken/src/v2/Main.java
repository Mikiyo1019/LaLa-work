package v2;

public class Main {

	public static void main(String[] args) {
		// 戦略クラスを選ぶ;
		Player com = new Player(new CleverNextHand());
		System.out.println("comの次の手は " + com.getHand() + "です。");

		NextHand nextHand2 = new RandomNextHand();
		Player com2 = new Player(nextHand2);
		System.out.println("comの次の手は " + com2.getHand() + "です。");

	}

}
