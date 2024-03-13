import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class AdjustPanel extends JPanel{

	public AdjustPanel(String centerText) {
		//create three buttons: Less, center text, and more
		JButton Less=new JButton("<<");
		JButton CenterText=new JButton(centerText);
		JButton More=new JButton(">>");
		//Add to this AdjustPanel panel
		setLayout(new FlowLayout());
		add(Less);
		add(CenterText);
		add(More);

	}
}