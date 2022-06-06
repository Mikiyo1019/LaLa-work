package v3;

public class Main {

	public static void main(String[] args) {
//		RrandomNextHand hand = new RandomNextHand();
//		Com com1 = new Com(hand);
		Com com1 = new Com(new RandomNextHand());
		com1.setName("コム1");
		
		User user = new User(new InputNextHand());
		user.setName("サスケ");
		
		com1.setHand();
		user.setHand();
		
		Game game = new Game();
		game.judge(com1, user);

//		System.out.println(com1);//toStringから来てるJavaのobj.で決められてる
//		System.out.println(user);//user.toString()が省略される、Javaのobj.が働いている
		
		game.dispResult(com1, user);
		game.convToJp(com1);
	}

}
