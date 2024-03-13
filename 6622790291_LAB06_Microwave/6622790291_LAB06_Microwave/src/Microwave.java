import java.awt.*;
import javax.swing.*;

public class Microwave extends JFrame {
	public Microwave(String title) {
		//Call the method: MicrowaveComponents
		this.MicrowaveComponents();
		
//		setLayout(new BorderLayout());
		this.setSize(300,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		
		//Set JFrame

	}
	
	public void MicrowaveComponents() {
		//Create the first panel of MicrowaveLayout to position its components
		JPanel panal01_MicrowaveLayout=new JPanel(new BorderLayout());
		this.add(panal01_MicrowaveLayout,BorderLayout.EAST);
		
		JButton button_Foods=new JButton("Food to be placed here");
		this.add(button_Foods,BorderLayout.CENTER);
		
	    JPanel panal02_NumberLayout=new JPanel();
	    panal02_NumberLayout.setLayout(new GridLayout(4,3));
	    
	    JTextField textfield_TimeDisplay=new JTextField("Microwave Time Display");
	    panal01_MicrowaveLayout.add(textfield_TimeDisplay,BorderLayout.NORTH);
	    
	    for(int i=1;i<10;i++) {
	    	panal02_NumberLayout.add(new JButton(""+i));
	    }
	    
	    
	    panal02_NumberLayout.add(new JButton("Start"));
	    panal02_NumberLayout.add(new JButton("0"));
	    panal02_NumberLayout.add(new JButton("Stop"));
	    panal01_MicrowaveLayout.add(panal02_NumberLayout,BorderLayout.CENTER);
//	    panal01_MicrowaveLayout.add(panal02_NumberLayout);
	    
	    
	    
		//Add the first panel into the EAST of MicrowaveLayout

		
		//Create a button to place foods at the CENTER of MicrowaveLayout

		
		//Create the second panel and set GridLayout for adding the button's numbers  

		

		//At the first panel, Create a textfield to display its time at the NORTH of MicrowaveLayout


		//Use a FOR loop to add the button's numbers into the NumberLayout

		
		//Create three button(Stop, 0, Start) and add them into the second JPanel


		//Add the second JPanel to the first panel at the CENTER of MicrowaveLayout

		
	}
}