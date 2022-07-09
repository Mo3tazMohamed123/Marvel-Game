package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MyFrame extends JFrame {
   MyFrame(){
	    //JPanel is a GUI component that functions as a container that holds other components
	 
	   ImageIcon icon0 = new ImageIcon("C:\\Users\\Moutaz\\Desktop\\image\\iron2.jpg");
	   JLabel label0 = new JLabel();  
	   label0.setIcon(icon0);
	  
	   
	   
	   ImageIcon icon1 = new ImageIcon("C:\\Users\\Moutaz\\Desktop\\image\\thor1.jpg");
	   JLabel label1 = new JLabel();
	   label1.setIcon(icon1);
	   
	   
	   ImageIcon icon2 = new ImageIcon("C:\\Users\\Moutaz\\Desktop\\image\\hulk1.jpg");
	   JLabel label2 = new JLabel();
	   label2.setIcon(icon2);
	   
	   
	   ImageIcon icon3 = new ImageIcon("C:\\Users\\Moutaz\\Desktop\\image\\captain1.png");
	   JLabel label3 = new JLabel();   
	   label3.setIcon(icon3);
	   
	   
	   ImageIcon icon4 = new ImageIcon("C:\\Users\\Moutaz\\Desktop\\image\\spiderman1.png");
	   JLabel label4 = new JLabel();    
	   label4.setIcon(icon4);
	   
	   
	   ImageIcon icon5 = new ImageIcon("C:\\Users\\Moutaz\\Desktop\\image\\loki1.jpg");
	   JLabel label5 = new JLabel();   
	   label5.setIcon(icon5);
	   
	   
	   
	   
	   
	   
	   JPanel redPanel = new JPanel();
	   //redPanel.setBackground(Color.red);
	   redPanel.setBounds(0,0,250,250);
	   redPanel.add(label0); //add content of label to panel
	   this.add(redPanel);
	  
	   
	   JPanel bluePanel = new JPanel();
	  // bluePanel.setBackground(Color.blue);
	   bluePanel.setBounds(250,0,250,250);
	   bluePanel.add(label1);   //add content of label to panel
	   this.add(bluePanel);
	   
	   JPanel greenPanel = new JPanel();
	  // greenPanel.setBackground(Color.green);
	   greenPanel.setBounds(0,500,250,250);
	   greenPanel.add(label2);  //add content of label to panel
	   this.add(greenPanel);
	   
	   JPanel magentaPanel = new JPanel();
	   //redPanel.setBackground(Color.magenta);
	   magentaPanel.setBounds(250,250,250,250);
	   magentaPanel.add(label3);  //add content of label to panel
	   this.add(magentaPanel);
	   
	   JPanel orangePanel = new JPanel();
	   //redPanel.setBackground(Color.red);
	   orangePanel.setBounds(0,250,250,250);
	   orangePanel.add(label4);  //add content of label to panel
	   this.add(orangePanel);
	   
	   
	   JPanel lemonPanel = new JPanel();
	   //redPanel.setBackground(Color.red);
	   lemonPanel.setBounds(250,500,250,250);
	   lemonPanel.add(label5);  //add content of label to panel
	   this.add(lemonPanel);  // activate panel
	   
	   
	   
	   
	   //JLabel a GUI display area for a string of text ,image or both
//	   ImageIcon image1 = new ImageIcon("C:\\Users\\Moutaz\\Desktop\\image\\war2.jpg");
//	   Border border = BorderFactory.createLineBorder(Color.green , 3);
  JLabel label = new JLabel();
//	   label.setText("main menu");
//	   label.setIcon(image1);
//	   label.setHorizontalTextPosition(JLabel.LEFT); // set text left,right,center of image icon
//	   label.setVerticalTextPosition(JLabel.NORTH);  //set text top center or bottom of image icon
//	   label.setForeground(Color.green);  //customize text color
//	   label.setFont(new Font("MV BOLI" ,Font.ITALIC , 40));  //customize text font,size
//	   label.setIconTextGap(100);  // sets text distance from icon
//	   label.setBackground(Color.black); // set background color
//	   label.setOpaque(true); // display background color
//	   label.setBorder(border);
//	   label.setVerticalAlignment(JLabel.CENTER); // set vertical position of text + icon within label
//	   label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of text + icon within label 
	   label.setBounds(0,0,450,300); // set x & y positions within frame as well as dimensions 
	   this.add(label);
	   
	   
	  
	 //Jframe a gui window to add components to
	// *this* means frame of JFrame
		this.setTitle("Marvel main window"); //sets title of frame
		this.setSize(2000,2000);   // sets x-dimension and y-dimension to this
		this.setLayout(null);     // set frame to default
		//this.pack(); // limits frame size to the components inside it
		this.setResizable(true);  // allows frame to be resized
		this.setVisible(true);   // set this to visible
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); // exit out of application
		ImageIcon image = new ImageIcon("C:\\Users\\Moutaz\\Desktop\\image\\logo.png");
		this.setIconImage(image.getImage());   //change icon of frame
	    this.getContentPane().setBackground(new Color(123,50,250)); //change color of background
	
  }
}
