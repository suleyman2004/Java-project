import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class Television extends JFrame {
	
	public Television(String title) {
		//Call a method TelevisionComponents
		TelevisionComponents();

		//set JFrame
		setVisible(true);
		setSize(600, 400);

	}
	
	public void TelevisionComponents() {
		//create abutton_TelevisionScreen and panal_TelevisionButtonBar
		JButton button_TelevisionScreen = new JButton("");
		BarPanel panel_TelevisionButtonBar =  new BarPanel();
		
		//Add to this Television
		setLayout(new BorderLayout());
		add(button_TelevisionScreen, BorderLayout.CENTER);
		add(panel_TelevisionButtonBar, BorderLayout.SOUTH);

	}
}