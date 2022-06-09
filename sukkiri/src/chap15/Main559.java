package chap15;

public class Main559 {

	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		if(s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		
		if (s1.endsWith("Java")) {
			disp("文字列s1は、Javaが末尾にあります");
		}
		
		if (s1.startsWith("Java")) {
			disp("文字列s1は、Javaが先頭にあります");
		}
		
		disp("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		
		disp("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
		
		
	}
	
	public static void disp(String s) {
		System.out.println(s);
	}

}
