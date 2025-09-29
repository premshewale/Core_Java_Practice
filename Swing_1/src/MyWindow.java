

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//Here MyWindow is child class and JFrame is parent class
public class MyWindow extends JFrame
{
	private JLabel heading; 			//variable
	Font font=new Font("", Font.BOLD, 30); 
	
	private JPanel mainpPanel;  			//It is panel which we are going to display on the form
	private JLabel namelLabel,passwordLabel;  //variable for name,pass
	private JTextField nameTextField;		
	private JPasswordField passwordField;
	private JButton button1,button2;
	
	//Default Constructor
	public MyWindow()
	{
		super.setTitle("My First Form...");
		super.setSize(500, 500);
		super.setLocation(100, 100);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.createGUI();
		super.setVisible(true);
		System.out.println("This is Constructor...");
	}
	
	public void createGUI() //for designing
	{
		this.setLayout(new BorderLayout());
		heading=new JLabel("My First Form..");
		heading.setFont(font);
		heading.setHorizontalAlignment(JLabel.CENTER);
		this.add(heading,BorderLayout.NORTH);
		
		//working with JPanel
		mainpPanel=new JPanel();
		//setting layout of main pannel
		mainpPanel.setLayout(new GridLayout(3, 2));
		
		namelLabel=new JLabel("Enter Name:");
		namelLabel.setFont(font);
		nameTextField=new JTextField();
		nameTextField.setFont(font);
		
		passwordLabel=new JLabel("Enter Password:");
		passwordLabel.setFont(font);
		passwordField=new JPasswordField();
		passwordField.setFont(font);
		
		button1=new JButton("Submit");
		button1.setFont(font);
		button2=new JButton("Reset");
		button2.setFont(font);
		
		mainpPanel.add(namelLabel);
		mainpPanel.add(nameTextField);
		mainpPanel.add(passwordLabel);
		mainpPanel.add(passwordField);
		mainpPanel.add(button1);
		mainpPanel.add(button2);
		
		this.add(mainpPanel,BorderLayout.CENTER);
	}
}
