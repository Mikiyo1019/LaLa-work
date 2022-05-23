package Ex4;

public class Ex4_2 {

	public static void main(String[] args) {
		int[] moneyList = {121902, 8302, 55100};
		
		/*
		 * int[] moneyList = new int[3];
		 * moneyLsit[0] = 121902;
		 * moneyLsit[1] = 8302;
		 * moneyLsit[2] = 55100;
		 * */
		
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		
		for (int value : moneyList) {
			System.out.println(value);
		}
	}

}
