package Ex4;

public abstract class Ex4_4 {

	public static void main(String[] args) {
		int[] numbers = new int[2];
		numbers[0] = new java.util.Random().nextInt(9) + 1;
		numbers[1] = new java.util.Random().nextInt(9) + 1;
		//同じだった場合
		while (numbers[0] == numbers[1]) {
			numbers[1] = new java.util.Random().nextInt(9) + 1;
		}
		System.out.println("com:" + numbers[0]);
		System.out.println("com:" + numbers[1]);
		/*
		 int[] numbers = new int[2];
		 numbers[0] = new java.util.Random().nextInt(9) + 1;
			do {
			numbers[1] = new java.util.Random().nextInt(9) + 1;
			} while (numbers[0] == numbers[1]);
		 * */
			
		System.out.println("一桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int value : numbers) {
			if (value == input) {
			System.out.println("アタリ!");
			break;
			} else {
				System.out.println("ハズレ!");
			}
		}
	}

}
