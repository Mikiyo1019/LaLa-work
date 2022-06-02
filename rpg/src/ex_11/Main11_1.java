package ex_11;

public class Main11_1 {

	public static void main(String[] args) {
		Book book = new Book("ゲド戦記", 720, "緑", "978-4-00-71145885");
		
		System.out.println(book.getName());
		System.out.println(book.getPrice());
	}

}
