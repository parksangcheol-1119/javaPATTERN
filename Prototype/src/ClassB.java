
public class ClassB {
   Test test;

	public Test getTest() {
		return test;
	}
	
	public void setTest(Test test) {
		this.test = test;
		
		this.test.methodA();
	}
	
	public static void main() {
		
		Test test = new ClassA();
		
		ClassB classB = new ClassB();
		
		classB.setTest(test);
		
	}
   
}
