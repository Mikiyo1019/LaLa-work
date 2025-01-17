package ex14;

import java.util.ArrayList;
import java.util.List;

public class ex14_1 {

	public static void main(String[] args) {
		Account a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;
		System.out.println(a);
		
		a.accountNumber = " 4649";
		Account a2 = new Account();
		a2.accountNumber = "4649 ";
		if (a.equals(a2)) {
			System.out.println("同じ");
		} else {
			System.out.println("違う");
		}
	
		//Accountで作ったequalsメソッドは、番地比較ではなく、内容(文字列)の比較
		//objectクラスのequalsメソッドは、番地比較 Listは受け取ったクラスをobjectの型に戻して比較している
		a.accountNumber = "4649";
		List<Account> aList = new ArrayList<>();
		aList.add(a);
		showList(aList);
		a = new Account();
		a.accountNumber =  "4649";
		a.balance = 1592;
		aList.remove(a);
		showList(aList);
	}
	
	//ArrayListを表示するためのメソッド(クラス内だけでの表示)
		private static void showList(List<Account> aList) {
			for (Account a: aList) {
				System.out.print("accountNumber;" + a.accountNumber);
				System.out.println("balance:" + a.balance);
		}
		System.out.println("要素数:" + aList.size());
	
//	Hero h = new Hero();
//		if (a.equals(h)) {
//			System.out.println("同じ");
//		} else {
//			System.out.println("違う");
//		}
		
	}

}
