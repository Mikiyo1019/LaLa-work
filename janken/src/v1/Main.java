package v1;

public class Main {

	public static void main(String[] args) {
		String userName = "";
		if (args.length == 1) {
			userName = args[0];
		} else {
			userName = "aaa";
		}
		
		String[] hand = {"グー", "チョキ", "パー"};
		int com = new java.util.Random().nextInt(3);
		
		int user = userInput();
		
		System.out.println("私の手は" + hand[com] + "です");
		System.out.println(userName + "は" + hand[user] + "です");
		
		hantei(com, user, userName);
	}
	
	public static int userInput() {
		System.out.println("0:グー1:チョキ2:パー、数字を入力してください");
		int num = new java.util.Scanner(System.in).nextInt();
		return num;
	}
	
	public static void hantei(int com, int user, String name) {//結果を表示するだけだからvoid
		if (com == user) {
			System.out.println("引き分けです");
		} else if ((user + 1)  % 3  == com) {//(user + 1 == com) || (user == 2 && com == 0 )
			System.out.println(name + "の勝ちです");
		} else {
			System.out.println("私の勝ちです");
		}
	}
	
}
