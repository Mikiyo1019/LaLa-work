package ex16;

import java.util.ArrayList;
import java.util.List;

public class Main16_2 {

		List<Hero> hero = new ArrayList<>();
		
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		
		hero.add(h1);
		hero.add(h2);
		
		



	public class Hero {
		private String name;
		public Hero(String name) {
			this.name = name;
		}
		public	String getName() {
			return this.name;
		}
	}
}
