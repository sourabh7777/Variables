package variables;

public class LocalVariable {
	
	public void calculate() {
		int height = 0 ; 
		height +=170;
		System.out.println("Height is " + height +" cm");
	}

	public static void main(String[] args) {
		LocalVariable a = new LocalVariable();
		a.calculate();
		
	}

}
