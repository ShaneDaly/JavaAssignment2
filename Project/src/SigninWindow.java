import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SigninWindow extends JFrame implements ActionListener
{
	private JTextField u = new JTextField();
	private JLabel username = new JLabel("Username:");
	private JPasswordField p = new JPasswordField();
	private JLabel password = new JLabel("Password:");
	private JButton theOKButton = new JButton("Ok");
	private JButton theCancelButton = new JButton("Cancel");
	
	public SigninWindow()
	{
		super("Sign in");
		getContentPane().setLayout(new GridLayout(3,1));
		getContentPane().add(username);
		getContentPane().add(password);
		getContentPane().add(u);
		getContentPane().add(p);
		getContentPane().add(theOKButton);
		getContentPane().add(theCancelButton);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		theOKButton.addActionListener(this);
		theCancelButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		
	}
}
