package v3;

public class Main {

	public static void main(String[] args) {
		//System.out.println("NINZU" + Const.NINZU);
//		Com com1 = new Com(0hand);
		//Com com1 = new Com(new RandomNextHand());
		Com com1 = new Com(new CleverNextHand());
		com1.setName("コム1");
		com1.setHand();
		com1.setResult("draw");
		//com1.setNextHand();
		
		User user = new User(new InputNextHand());
		user.setName("サスケ");
		
		//isNext booleam型でtrueの時とfalseの時でcontinueを決める
		
		Game game = new Game();
		do {
			com1.setHand();
			user.setHand();
			game.judge(com1, user);
	
	//		System.out.println(com1);//toStringから来てるJavaのobj.で決められてる
	//		System.out.println(user);//user.toString()が省略される、Javaのobj.が働いている
			
			game.dispResult(com1, user);
			//game.convToJp(com1);
		} while (game.isNext());
			System.out.println("bye!");
		
		
	}

}
