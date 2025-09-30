

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MyWindow extends JFrame
{
	private JLabel heading;   //variable
	private JLabel clockLabel;	//variable
	private Font font=new Font("",Font.BOLD, 35); //"" is for name, 35=size of font
	
	MyWindow()
	{
		super.setTitle("Digital Clock...");
		super.setSize(500, 500);
		super.setLocation(300, 50);
		
		this.createGUI(); 
		this.startClock();
		super.setDefaultCloseOperation(EXIT_ON_CLOSE); //This method is used to close the running program when we exit the form screen
		
		super.setVisible(true); //Makes the page visible without this method form page will not be visible
	}
	
	public void createGUI() 
	{
		heading=new JLabel("Digital Clock"); //Label
		clockLabel=new JLabel("Clock"); //Label
		
		heading.setFont(font);   
		clockLabel.setFont(font);
		
		this.setLayout(new GridLayout(2, 1)); //2=rows & 1=column
		this.add(heading);    //It will add Or show heading label as "Digital Clock"
		this.add(clockLabel); //It will add clockLabel as "Clock"
	}
	
	
	public void startClock()
	{
		Timer timer=new Timer(1000,new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String dataTime=new Date().toString();
				clockLabel.setText(dataTime);				
			}
		} );
		timer.start();
	}
}
