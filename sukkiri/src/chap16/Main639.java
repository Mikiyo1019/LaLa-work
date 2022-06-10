package chap16;

import java.util.ArrayList;
import java.util.List;

import chap16.ex.User;

public class Main639 {

	
//	class User {
//		public String name;
//	}
	
	public static void main(String[] args) {
		User h = new User();
		h.setName("ミナト");
		
		List<User> list = new ArrayList<>();
		list.add(h);
		h.setName("菅原");
		System.out.println(list.get(0).getName());
	}

}
