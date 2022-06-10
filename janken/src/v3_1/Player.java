package v3_1;

public abstract class Player {
	private String name;
	private int hand;
	private String result;
	private String[] hands = {"グー", "チョキ", "パー"};
	
	//次の手を決める戦略の型（インタフェース）= 多態性
	private NextHand nextHand;//(インタフェースの型指定)今は抽象クラスだから決めない。次のクラスで決める
	//	private NextHand nextHand = new RandomNextHand();ざっくりNextHandという多態性
	
	public Player(NextHand nextHand) {
		this.nextHand = nextHand;
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHand() {
		return hand;
	}
	//外部から手を決められないように
	public void setHand() {
		this.hand = this.nextHand.decideHand();//フィールドのnextHand
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public NextHand getNextHand() {
		return nextHand;
	}

	public void setNextHand(NextHand nextHand) {
		this.nextHand = nextHand;
	}
	
	public String toString() {
//		return this.name + ";" + this.hand + ':' + this.result;//sysoで見れるようになるp.529,デバックみたいな
		return this.name + ";" + hands[this.hand] + ':' + this.result;
	}
}
