
public class Conditionals {
	public static void main(String[] args) {
		
		//if (some expression that evaluates to true)
		//		do something
		
		boolean sayHello = false;
		boolean sayHey = false;
		
		// only the first statement to evaluate to true get executed
		if(sayHello) {
			System.out.println("Hello");
		} else if(sayHey) {
			System.out.println("Hey");
		} else {
			System.out.println("Goodbye");
		}
		
		//if(x = 5) is not testing equality it is assigning a value to a variable... if you want to evaluate  you use ==
		//if(x = 5) is assigning 5 to x
		//if(x == 5) test whether x has the value of 5 (it will either be true or false)
		
		//in java the and operator is && and the or operator is || 
		
		int playerX = 50;
		
		if(true && false) {
			System.out.println("AND executed");
		}
		
		//if our player is past the left or right side of the screen
		if(playerX < 0 || playerX > 800) {
			//some code that reverses the direction
			System.out.println("OR executed");
		}
		
	}
}
