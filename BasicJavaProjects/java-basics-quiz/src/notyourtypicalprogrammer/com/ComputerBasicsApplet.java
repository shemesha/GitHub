package notyourtypicalprogrammer.com;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JLabel;


public class ComputerBasicsApplet extends Applet implements ActionListener, ItemListener{
	
	//Font objects
	Font font1; //Font for sub heading
	Font font2; //Font for heading
	Font font3; //Font for Question
	Font font4; //font for answer choices
	Font font5; //font for score
	Font font6; //font for score
	
	private int quizScore; //variable to keep track of your score
	private boolean showScore=false;  //used to display the score when ready

	
	//Add Components
	private Button button1;
	private Label question1;
	private Label question2;
	private Label question3;
	private Label question4;
	private Label question5;
	private Label question6;
	
	CheckboxGroup q1Group;
	
	Checkbox q1a1;
	Checkbox q1a2;
	Checkbox q1a3;
	Checkbox q1a4;
	
CheckboxGroup q2Group;
	
	Checkbox q2a1;
	Checkbox q2a2;
	Checkbox q2a3;
	Checkbox q2a4;
	
CheckboxGroup q3Group;
	
	Checkbox q3a1;
	Checkbox q3a2;
	Checkbox q3a3;
	Checkbox q3a4;
	
CheckboxGroup q4Group;
	
	Checkbox q4a1;
	Checkbox q4a2;
	Checkbox q4a3;
	Checkbox q4a4;
	
CheckboxGroup q5Group;
	
	Checkbox q5a1;
	Checkbox q5a2;
	Checkbox q5a3;
	Checkbox q5a4;
	
CheckboxGroup q6Group;
	
	Checkbox q6a1;
	Checkbox q6a2;
	Checkbox q6a3;
	Checkbox q6a4;
	
	public void init(){
		//setTitle

		quizScore=0;
		//sets the size of the window
		setSize(1500,800);
		//sets the layout of the window
		//setLayout(new FlowLayout());
		
		button1=new Button("Submit Answers");
		question1=new Label("Q1. What statement prints out Hello World");
		question2=new Label("Q2. All programming statements in Java end with a __");
		question3=new Label("Q3. Every Java application must have a _____ method");
		question4=new Label("Q4. Java methods are enclosed in ____");
		question5=new Label("Q5. In Java the class name must match the _____ name");
		question6=new Label("Q6. In Java the assigment operator is  _____");
		button1.addActionListener(this);
	
		//Question 1 Group
		q1Group=new CheckboxGroup();
		q1a1=new Checkbox("System.print(\"Hello World\");",q1Group,false);
		 q1a2=new Checkbox("System.out.print(\"Hello World\");",q1Group,false);
		 q1a3=new Checkbox("print(\"Hello World\");",q1Group,false);
		 q1a4=new Checkbox("System.out(\"Hello World\");",q1Group,false);
		 
		 q1a1.addItemListener(this);
		 q1a2.addItemListener(this);
		 q1a3.addItemListener(this);
		 q1a4.addItemListener(this);
		 	
		//Question 2 Group
		q2Group=new CheckboxGroup();
		q2a1=new Checkbox(".",q2Group,false);
		q2a2=new Checkbox("//",q2Group,false);
		q2a3=new Checkbox("!",q2Group,false);
		q2a4=new Checkbox(";",q2Group,false);
			 
		q2a1.addItemListener(this);
		q2a2.addItemListener(this);
		q2a3.addItemListener(this);
		q2a4.addItemListener(this);
		
		//Question3 Group
		q3Group=new CheckboxGroup();
				
		q3a1=new Checkbox("main",q3Group,false);
		q3a2=new Checkbox("output method",q3Group,false);
		q3a3=new Checkbox("constructor",q3Group,false);
		q3a4=new Checkbox("terminanting",q3Group,false);
				 
		q3a1.addItemListener(this);
		q3a2.addItemListener(this);
		q3a3.addItemListener(this);
		q3a4.addItemListener(this);
		
		//Question4 Group		 
		q4Group=new CheckboxGroup();
		q4a1=new Checkbox("[ ]",q4Group,false);
		q4a2=new Checkbox("( )",q4Group,false);
		q4a3=new Checkbox("< >",q4Group,false);
		q4a4=new Checkbox("{ }",q4Group,false);
					 
		q4a1.addItemListener(this);
		q4a2.addItemListener(this);
		q4a3.addItemListener(this);
		q4a4.addItemListener(this);
		
		//Question 5 Group					 
		q5Group=new CheckboxGroup();
		q5a1=new Checkbox("input",q5Group,false);
		q5a2=new Checkbox("package",q5Group,false);
		q5a3=new Checkbox("method",q5Group,false);
		q5a4=new Checkbox("file",q5Group,false);
						 
		q5a1.addItemListener(this);
		q5a2.addItemListener(this);
		q5a3.addItemListener(this);
		q5a4.addItemListener(this);
			
		//Question 6 Group	
		q6Group=new CheckboxGroup();
		q6a1=new Checkbox("=",q6Group,false);
		q6a2=new Checkbox("==",q6Group,false);
		q6a3=new Checkbox("equals",q6Group,false);
		q6a4=new Checkbox("!",q6Group,false);
							 
		q6a1.addItemListener(this);
		q6a2.addItemListener(this);
		q6a3.addItemListener(this);
		q6a4.addItemListener(this);
		 
		  
		 
		//initialize each Font object
		font1=new Font("Verdana",Font.BOLD, 25);
		font2=new Font("Verdana",Font.BOLD, 40);
		font3=new Font("Arial", Font.BOLD, 14);
		font4=new Font("Arial", Font.PLAIN, 12);
		font5=new Font("Verdana", Font.BOLD, 18);
		font6=new Font("Arial", Font.ITALIC, 14);
		
		//set Background color
		setBackground(Color.black);	
		
		//Add Components to the applet
		add(button1);
		add(question1);
		add(question2);
		add(question3);
		add(question4);
		add(question5);
		add(question6);
	    
		add(q1a1);
	   add(q1a2);
	   add(q1a3);
	    add(q1a4);
	    
	    add(q2a1);
		add(q2a2);
		add(q2a3);
		add(q2a4);
		    		    	    
		add(q3a1);
	    add(q3a2);
	    add(q3a3);
		add(q3a4);
		
		add(q4a1);
		add(q4a2);
	    add(q4a3);
		add(q4a4);	    
		
		add(q5a1);
		add(q5a2);
	    add(q5a3);
		add(q5a4);
		
		add(q6a1);
		add(q6a2);
	    add(q6a3);
		add(q6a4);
			   
	
	}
	public void stop(){
		
	}
	public void paint(Graphics g){
		paintComponent(g);
		g.setColor(Color.pink);
		g.setFont(font1);
		g.drawString("Intro to Programming Quiz", 475,75);
		g.setFont(font2);
		g.drawString("!Your_Typical_Programmer", 400,50);
		
		g.setColor(Color.white);
		g.setFont(font6);
		g.drawString("Each question is worth 10 points for a maximum score of 60 points", 45,175);
		
		
		g.setFont(font5);
		if(showScore)
		g.drawString("Your Score: "+quizScore,700 ,725);
		
				
		
	}
	public void paintComponent(Graphics g){
	  
		button1.setLocation(550,700);
		//sets the location of the labels
				question1.setFont(font3);
				question1.setForeground(Color.white);
				question1.setLocation(50,200);
				question1.setSize(300,50);
								
				question2.setFont(font3);
				question2.setForeground(Color.white);
				question2.setLocation(450,200);
				question2.setSize(400,50);
				
				question3.setFont(font3);
				question3.setForeground(Color.white);
				question3.setLocation(900,200);
				question3.setSize(400,50);
				
				question4.setFont(font3);
				question4.setForeground(Color.white);
				question4.setLocation(50,450);
				question4.setSize(400,50);
				
				question5.setFont(font3);
				question5.setForeground(Color.white);
				question5.setLocation(450,450);
				question5.setSize(400,50);
				
				question6.setFont(font3);
				question6.setForeground(Color.white);
				question6.setLocation(900,450);
				question6.setSize(450,50);
				
				//Question 1 Group
				q1a1.setFont(font4);
				q1a1.setForeground(Color.white);
				q1a1.setLocation(75,250);
				
				q1a2.setFont(font4);
				q1a2.setForeground(Color.white);
				q1a2.setLocation(75,300);
				
				q1a3.setFont(font4);
				q1a3.setForeground(Color.white);
				q1a3.setLocation(75,350);
				
				q1a4.setFont(font4);
				q1a4.setForeground(Color.white);
				q1a4.setLocation(75,400);
				
				//Question 2 Group
				q2a1.setFont(font4);
				q2a1.setForeground(Color.white);
				q2a1.setLocation(475,250);
				
				q2a2.setFont(font4);
				q2a2.setForeground(Color.white);
				q2a2.setLocation(475,300);
				
				q2a3.setFont(font4);
				q2a3.setForeground(Color.white);
				q2a3.setLocation(475,350);
				
				q2a4.setFont(font4);
				q2a4.setForeground(Color.white);
				q2a4.setLocation(475,400);
				
				
				//Question 3 Group
				q3a1.setFont(font4);
				q3a1.setForeground(Color.white);
				q3a1.setLocation(925,250);
				
				q3a2.setFont(font4);
				q3a2.setForeground(Color.white);
				q3a2.setLocation(925,300);
				
				q3a3.setFont(font4);
				q3a3.setForeground(Color.white);
				q3a3.setLocation(925,350);
				
				q3a4.setFont(font4);
				q3a4.setForeground(Color.white);
				q3a4.setLocation(925,400);
				
				//Question 4 Group
				q4a1.setFont(font4);
				q4a1.setForeground(Color.white);
				q4a1.setLocation(75,500);
				
				q4a2.setFont(font4);
				q4a2.setForeground(Color.white);
				q4a2.setLocation(75,550);
				
				q4a3.setFont(font4);
				q4a3.setForeground(Color.white);
				q4a3.setLocation(75,600);
				
				q4a4.setFont(font4);
				q4a4.setForeground(Color.white);
				q4a4.setLocation(75,650);
				
				//Question 5 Group
				q5a1.setFont(font4);
				q5a1.setForeground(Color.white);
				q5a1.setLocation(475,500);
				
				q5a2.setFont(font4);
				q5a2.setForeground(Color.white);
				q5a2.setLocation(475,550);
				
				q5a3.setFont(font4);
				q5a3.setForeground(Color.white);
				q5a3.setLocation(475,600);
				
				q5a4.setFont(font4);
				q5a4.setForeground(Color.white);
				q5a4.setLocation(475,650);
				
				//Question 6 Group
				q6a1.setFont(font4);
				q6a1.setForeground(Color.white);
				q6a1.setLocation(925,500);
				
				q6a2.setFont(font4);
				q6a2.setForeground(Color.white);
				q6a2.setLocation(925,550);
				
				q6a3.setFont(font4);
				q6a3.setForeground(Color.white);
				q6a3.setLocation(925,600);
				
				q6a4.setFont(font4);
				q6a4.setForeground(Color.white);
				q6a4.setLocation(925,650);
				
				
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		showScore=true;
		
		//Highlights the right answers
		q1a2.setBackground(Color.green);
		q2a4.setBackground(Color.green);
		q3a1.setBackground(Color.green);
		q4a4.setBackground(Color.green);
		q5a4.setBackground(Color.green);
		q6a1.setBackground(Color.green);
		
		repaint();
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		quizScore=0;
		
		if(q1a2.getState())
			quizScore+=10;
		
		if(q2a4.getState())
			quizScore+=10;
		
		if(q3a1.getState())
			quizScore+=10;
		
		if(q4a4.getState())
			quizScore+=10;
		
		if(q5a4.getState())
			quizScore+=10;
		
		if(q6a1.getState())
			quizScore+=10;
				
	}
	

}
