package com.codelanes.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.Random;

public class Dice {
    //Choose a number from 1-6 then click check button to know if your guess is correct.

    public void showFrame(){
        JFrame myFrame = new JFrame("Roll A Dice");
		myFrame.setSize(400,250);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setResizable(false);
		
		JLabel label1,label2,label3;
		JTextField tf1,tf2;
		JButton b1, b2;
		
		label1 = new JLabel("Number");
			label1.setBounds(50,50,120,30);
		label2 = new JLabel("Result");
			label2.setBounds(50,90,120,30);
		label3 = new JLabel("Choose a number from 1-6");
			label3.setBounds(50,20,200,30);
		tf1 = new JTextField();
			tf1.setBounds (120,50,200,30);
		tf2 = new JTextField();
			tf2.setBounds (120,90,200,30);
			tf2.setEditable(false);
		b1 = new JButton("Check");
			b1.setBounds (135,130,80,30);
			b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent ef){
		
		try{
		Random rand = new Random();
		int num= 1 + rand.nextInt(6);
		int guess = Integer.parseInt(tf1.getText());
		if(num==guess){
			tf2.setText("You win");}
		else{
			tf2.setText("You lose. The correct number is " + num);
		}

		}
		catch(Exception e){
		tf2.setText("Invalid");

		}

			
		}});
		

		b2 = new JButton("Clear");
			b2.setBounds (225,130,80,30);
			b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		tf1.setText("");
		tf2.setText("");
		}});
		


		
		myFrame.add(label1);myFrame.add(label2);myFrame.add(label3);
		myFrame.add(tf1);myFrame.add(tf2);
		myFrame.add(b1);myFrame.add(b2);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);

    }
    
}
