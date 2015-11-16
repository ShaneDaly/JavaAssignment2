import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class CreateWindow extends JFrame implements ActionListener
{
	private JButton theOKButton = new JButton("Ok");
	private JButton theCancelButton = new JButton("Cancel");
	
	public CreateWindow()
	{
		super("Create Window");
		getContentPane().setLayout(new GridLayout(3,1));
		getContentPane().add(theOKButton);
		getContentPane().add(theCancelButton);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource().equals(theCancelButton)) 
		{
			dispose();
		}

	}
	
}
