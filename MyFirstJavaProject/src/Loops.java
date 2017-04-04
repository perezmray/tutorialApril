
public class Loops {
	public static void main(String[] args) {
		//three main types of loops: 
			//while (looks the most like an if statement);
			//doWhileLoop (least common);
			//forLoop: looks like the least complex - variable initialized, condition applied, and changes to variable in one line
		
			
			//whileLoop();
			//doWhileLoop();
			forLoop();
	
	}
	
	static void whileLoop() {
		int counter = 0;
		while(counter < 10) {
			counter = counter + 1;
			System.out.println("10");
		}
	}
	
	static void doWhileLoop() {
		int counter = 10;
		do {
			counter = counter + 1;
			System.out.println(counter);
		} while(counter < 10);
	}
	
	static void forLoop() {
		// for(initialize counter; condition to see if we should run the loop; change counter variable)
		for(int counter=0; counter < 10; counter = counter +1){
			System.out.println(counter);
		}
	}
}
