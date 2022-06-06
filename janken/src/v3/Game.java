package v3;

public class Game {
	public void judge(Com com, User user) {//参照で受け取る,下記で値を書き換えてるから、returnがいらない
		int comHand = com.getHand();
		int userHand = user.getHand();
		if (userHand == comHand) {
			com.setResult("draw");
			user.setResult("draw");
			System.out.println("引き分けです");
		} else if ((userHand + 1) % 3 == comHand) {
			com.setResult("lose");
			user.setResult("win");
			System.out.println("あなたの勝ちです");
		} else {
			com.setResult("win");
			user.setResult("lose");
			System.out.println("私の勝ちです");
		}
	}
	
	public void dispResult(Com com, User user) {
		System.out.println("ゲーム結果");
		System.out.println(com);
		System.out.println(user);
		System.out.println(convToJp(com));
	}
	
	public String convToJp(Com com) {
		if (com.getResult().equals("lose")) {
			return "あなたの勝ちです";
		} else if(com.getResult().equals("win")) {
			return "私の勝ちです";
		} else {
			return "引き分けです";
		}
	}
}
