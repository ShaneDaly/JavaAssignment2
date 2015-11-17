
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SignupWindow extends JFrame implements ActionListener
{
	private JTextField u = new JTextField();
	private JLabel username = new JLabel("Username:");
	private JPasswordField p = new JPasswordField();
	private JLabel password = new JLabel("Password:");
	private JButton theOKButton = new JButton("Ok");
	private JButton theCancelButton = new JButton("Cancel");
    static String un;
    static String pw;
	
	public SignupWindow()
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
