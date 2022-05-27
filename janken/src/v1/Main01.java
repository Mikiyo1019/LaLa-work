package v1;

public class Main01 {

	public static void main(String[] args) {
		System.out.println("+, -, *, / のいずれかを入力してください");
		String user = new java.util.Scanner(System.in).nextLine();
		System.out.println("初めの数字を入力してください");
		double user1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("二つ目の数字を入力してください");
		double user2 = new java.util.Scanner(System.in).nextInt();
		switch (user) {
			case "+":
				double plus = plus(user1, user2);
				System.out.println("計算結果:" + plus);
				break;
			case "-":
				double minus = minus(user1, user2);
				System.out.println("計算結果:" + minus);
				break;
			case "*":
				double multi = multi(user1, user2);
				System.out.println("計算結果:" + multi);
				break;
			case "/":
				double div = div(user1, user2);
				System.out.println("計算結果:" + div);
				break;
		}
	}
	
	public static double plus(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}


	public static double minus(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}
	
	public static double multi(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
	
	public static double div(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}


}
