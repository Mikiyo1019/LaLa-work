package chap15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main585 {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		
		//文字列からDateインスタンスを生成
		Date d = f.parse("2025/09/22 01:23");
		System.out.println(d);
		
		//Dateインスタンスから文字列を生成
		Date now = new Date();
		int day = (int)(d.getTime() - now.getTime()) / (24*60*60*1000) ;
		
		//String s = f.format(now);
		//System.out.println("現在は" + s + "です");
		System.out.println(day);
	}

}
