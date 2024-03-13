import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

//Inherit appropriate superclass 
public class ControlPanel extends JPanel{
	public ControlPanel() {		
		
		//create a On/Of button and add to the power panel 
		JButton button=new JButton("On/Off");
		AdjustPanel Ch=new AdjustPanel("Ch");
		AdjustPanel Vol=new AdjustPanel("Vol");
		
		//create two adjust panels and add to the layout of this control Panel
		add(Ch);
		add(Vol);
		add(button);

	}
}