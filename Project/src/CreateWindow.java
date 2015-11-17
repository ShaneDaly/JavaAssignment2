import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CreateWindow extends JFrame implements ActionListener
{
	private JTextField u = new JTextField();
	private JLabel username = new JLabel("Username:");
	private JTextField p = new JTextField();
	private JLabel password = new JLabel("Password:");
	private JButton theOKButton = new JButton("Ok");
	private JButton theCancelButton = new JButton("Cancel");
    static String un;
    static String pw;
	
	public CreateWindow()
	{
		super("SignUp");
		getContentPane().setLayout(new GridLayout(3,1));
		getContentPane().add(username);
		getContentPane().add(password);
		getContentPane().add(u);
		getContentPane().add(p);
		getContentPane().add(theOKButton);
		getContentPane().add(theCancelButton);
		
		setSize(300,300);
		setVisible(true);
		
		theOKButton.addActionListener(this);
		theCancelButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource().equals(theOKButton)) 
		{
			un = u.getText();
    		pw = p.getText();
		}
		
		if (e.getSource().equals(theCancelButton)) 
		{
			dispose();
		}

	}
	
}
