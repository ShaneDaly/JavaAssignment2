import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame implements ActionListener
{
	private JButton theSignupButton = new JButton("Sign Up");
	private JButton theSigninButton = new JButton("Sign In");
	private JButton theUpdateWindowButton = new JButton("Update Account");
	private JButton theDeleteWindowButton = new JButton("Delete Account");
	
	public MainWindow()
	{
		super("Moodle");
		getContentPane().setLayout(new GridLayout(3,1));
		getContentPane().add(theSignupButton);
		getContentPane().add(theSigninButton);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		theSignupButton.addActionListener(this);
		theSigninButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(theSignupButton))
		{
			new SignupWindow();
		}
		
		else if(e.getSource().equals(theSigninButton))
		{
			new SigninWindow();
		}
		
		else if(e.getSource().equals(theUpdateWindowButton))
		{
				
			
		}
		
		else if(e.getSource().equals(theDeleteWindowButton))
		{
			
			
		}
	}
}
