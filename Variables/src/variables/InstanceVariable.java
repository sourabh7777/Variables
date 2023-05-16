package variables;

public class InstanceVariable {
	public int rollNum;
	public String name;
	public int totalMarks;
	public int numbers;

	public static void main(String[] args) {
		InstanceVariable obj = new InstanceVariable();
		obj.rollNum = 100001;
		obj.name = "Test Engineers";
		obj.totalMarks = 510;
		obj.numbers = 1234567890;
		
		System.out.println(obj.rollNum);
		System.out.println(obj.name);
		System.out.println(obj.totalMarks);
		System.out.println(obj.numbers);
		

	}

}
