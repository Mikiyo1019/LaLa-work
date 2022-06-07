package v3;

import java.util.Scanner;

public class Game {
	private String msg = null;//フィールド変数（クラス変数）nullは必要なし
	//メソッド内（ローカル変数）で使う変数は初期値nullか""が必須。コンパイルが通らない。
	//フィールドは、JVMが勝手に設定してくれる
	public void judge(Com com, User user) {//参照で受け取る,下記で値を書き換えてるから、returnがいらない
		int comHand = com.getHand();
		int userHand = user.getHand();
		
		if (userHand == comHand) {
			com.setResult("draw");
			user.setResult("draw");
			msg = "引き分けです";
			} else if ((userHand + 1) % 3 == comHand) {
			com.setResult("lose");
			user.setResult("win");
			msg = user.getName() + "の勝ちです";
		} else {
			com.setResult("win");
			user.setResult("lose");
			msg = com.getName() + "の勝ちです";
		}
	}
	//Playerふやしたかったら、オーバーロードしたらok!
	public void dispResult(Com com, User user) {
		System.out.println("ゲーム結果");
		System.out.println(com.getName() + ":" + Const.hands[com.getHand()]);
		System.out.println(user.getName() + ":" + Const.hands[user.getHand()]);
		System.out.println(msg);//msgをローカルに入れると、エラー。フィールド変数にしておく
	}
	
	public boolean isNext() {
		System.out.print("もう一度やりますか? (y/n) > ");
		String yesno = new Scanner(System.in).nextLine().toLowerCase();
		if (yesno .equals("y")) {
			return true;	
		} else {
			return false;
		}
	}
	
//	public String convToJp(Com com) {
//		if (com.getResult().equals("lose")) {
//			return "あなたの勝ちです";
//		} else if(com.getResult().equals("win")) {
//			return "私の勝ちです";
//		} else {
//			return "引き分けです";
//		}
//	}
}
