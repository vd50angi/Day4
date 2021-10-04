
public class Main {
	
	public static void main(String[]args) {
		//AbstractDemo abstrctDemo = new AbstractDemo(); - cant create an instance in abstract tne new keyword
		
		AbstractDemo abstractDemo =  new Demo();//Demo is behaving as a parent
		
		abstractDemo.test();
		
		
	}
	

}


//abstractDemo.sample(); // calling sample method- sample is part of child class