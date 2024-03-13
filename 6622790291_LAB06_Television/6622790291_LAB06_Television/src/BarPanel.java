import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class BarPanel extends JPanel {
	public BarPanel() {
		//Create control_panel and textfield_ChVolDisplay
		JTextField text_ch = new JTextField("Ch 35 Vol 45");
		ControlPanel control_panel = new ControlPanel();
		
		//Add to this BarPanel panel
		setLayout(new BorderLayout());
		add(text_ch, BorderLayout.WEST);
		add(control_panel, BorderLayout.CENTER);
		
	}
}