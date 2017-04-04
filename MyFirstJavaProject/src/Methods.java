
public class Methods {
	public static void main(String[] args) {
		sayHelloWorld();
		
		sayHelloTo("Charlie");
		sayHelloTo("John");
		
		int x = returnFive();
		
		System.out.println(x);
		
		//we declare and initialize a variable called result and on the right side of the = sign we call two methods defined below to get the value
		int result = square(returnFive());
		System.out.println(result);
	}
	//this method both returns a value and takes in data
	static int square(int x) {
		return x * x;
	}
	
	//this method returns an int type with a value of 5
	static int returnFive() {
		return 5;
	}
	
	//this method will say hello to whatever name is passed when called (parameter above)
	static void sayHelloTo(String name) {
		System.out.println("Hello, " + name);
	}
	
	//this method simply says "Hello, world!"
	static void sayHelloWorld() {
		System.out.println("Hello, world!");
	}
}
