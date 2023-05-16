package variables;

public class StaticVariale {
	
	private static int radious;
	private static final double pi = 3.14;

	public static void main(String[] args) {
		radious = 3;
		System.out.println("Circumference of a circle is :" + 2*pi*radious);
		

	}

}
