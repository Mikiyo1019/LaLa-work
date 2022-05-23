package chap04;

public class Main06 {

	public static void main(String[] args) {
		int[] arrayA = {1, 2, 3};
		int[] arrayB = {4, 5, 6};
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
		System.out.println(arrayA[1]);
	}

}
