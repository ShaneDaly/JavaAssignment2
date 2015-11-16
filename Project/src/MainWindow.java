import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame implements ActionListener
{
	private JButton theCreateWindowButton = new JButton("Create");
	private JButton theReadWindowButton = new JButton("Read");
	private JButton theUpdateWindowButton = new JButton("Update");
	private JButton theDeleteWindowButton = new JButton("Delete");
	
	public MainWindow()
	{
		super("CRUD");
		getContentPane().setLayout(new GridLayout(3,1));
		getContentPane().add(theCreateWindowButton);
		getContentPane().add(theReadWindowButton);
		getContentPane().add(theUpdateWindowButton);
		getContentPane().add(theDeleteWindowButton);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		theCreateWindowButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(theCreateWindowButton))
		{
			new CreateWindow();
		}
		
		else if(e.getSource().equals(theReadWindowButton)){
				
			
		}
		
		else if(e.getSource().equals(theUpdateWindowButton)){
				
			
		}
		
		else if(e.getSource().equals(theDeleteWindowButton)){
			
			
		}
	}
}
