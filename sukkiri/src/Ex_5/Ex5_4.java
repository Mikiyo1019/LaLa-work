package Ex_5;

public class Ex5_4 {

	public static void main(String[] args) {
		double triArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積:" + triArea);
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積:" + circleArea);
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}
	
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}

}
