
public abstract class AbstractDemo {
	int a= 10;
	
	public abstract void demo(); //declare abstract method
	
	public abstract void test();
	
	public void test2() { //test 2 is concrete method , a method of definition
		System.out.println("Test is called.");
		
	}
	public AbstractDemo() {
		   System.out.println("hello from abstract constructor");
	
	}
	
	public static void display() {
		System.out.println("hello from display method");
	}
}

