package Ex_5;

public class Ex5_3 {

	public static void main(String[] args) {
		String title = "こんにちは";
		String address = "abcdef@gmai";
		String text = "お元気ですか?";
		email(title, address, text);
		email(address, text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("本文:" + text);
	}


}
