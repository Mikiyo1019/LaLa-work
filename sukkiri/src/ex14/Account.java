package ex14;

public class Account {
	String accountNumber;//講座番号
	int balance;//残高
		
	public String toString() {
		return "￥"  + this.balance + "(口座番号:" + this.accountNumber + ")";
	}
	

	//Objectクラスのequalsメソッドのオーバーライド
	@Override
	//↑＝JavaのObjectクラスのオーバーライドだよという意味を、Javaに知らせている
	public boolean equals(Object o) {
		if (this == o) {//アドレスが等しい 本来のObjectクラスの equals()（new Accountのインスタンスを指している）
			return true;
		}
		if (o instanceof Account) {
			Account a = (Account)o;//Object型をAccountに戻している
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if(an1.equals(an2)) {//文字列として比較
				return true;
			}
		}
		return false;
	}
	
	// equals()を作ったら、hashCode()もオーバーライドする。
	@Override
	public int hashCode() {
		int result = accountNumber.hashCode();//accountNumberは文字列。をresultに入れてる
		result = result * 31 + Integer.hashCode(balance);//文字列とint型の数をくっつけてハッシュコードを作る
		return result;
	}//zccountNumberとbakanceのハッシュコードを同じにするメソッド
	//equalsとハッシュコードどっちでも比較できる状態にしとく
	
//	//オーバーロードはダメ
//	public boolean equals(Account a) {
//			String an1 = this.accountNumber.trim();
//			String an2 = a.accountNumber.trim();
//			if(an1.equals(a.accountNumber)) {
//				return true;
//			}
//		return false;
//	}
	
	

}
