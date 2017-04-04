import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
	public static void main(String[] args) {
		int number = 5;
		
		//JFrame is the object - window is the name we are giving it like we name a variable - = new means it is a new instance of...JF
		//create our window
		JFrame window = new JFrame(); //object type JFrame that is named window
		window.setSize(800, 600); // calling methods on our JFrame object to configure it
		window.setTitle("My Window");//naming the frame
		window.setVisible(true);
		
		JLabel label = new JLabel(); //label variable holds JLabel objects  and we are create new JLabel to assigne new properties
		label.setText("My Label"); //we're calling the setText method on our JLabel object
		
		window.add(label); //adding the label to the other object
	}
}
