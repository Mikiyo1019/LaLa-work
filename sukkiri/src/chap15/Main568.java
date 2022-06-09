package chap15;

public class Main568 {

	public static void main(String[] args) {
		String name = "EEEEEEEE";
		if (isValidPlayerName(name)) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}
	
	public static boolean isValidPlayerName(String name) {//mainメソッドから呼び出す為のstatic
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
	
	public static boolean phoneNumber(String name) {//mainメソッドから呼び出す為のstatic
		return name.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}");
		//return name.matches("[0-9][0-9][0-9]-{3}");
	}
}
