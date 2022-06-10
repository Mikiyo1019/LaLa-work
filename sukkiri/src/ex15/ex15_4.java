package ex15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ex15_4 {

	public static void main(String[] args) {
		
		//①現在の日時をDate型で取得
		 Date now = new Date();
		 System.out.println("now: " + now);
		 Calendar c = Calendar.getInstance();
		 
		 //②取得した日時情報をCalenderにセット
		 c.setTime(now);
		 System.out.println("now: " + now);
		 
		 //③Calenderから日を取得
		 int day = c.get(Calendar.DAY_OF_MONTH);
		 System.out.println("day: " + day);
		 
		 //④日に100を足した値をセット
		 day += 100;
		 c.set(Calendar.DAY_OF_MONTH, day);
		 
		 //⑤
		 Date future = c.getTime();
		 
		 //⑥
		 SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		 System.out.println(f.format(future));
		
	}

}
