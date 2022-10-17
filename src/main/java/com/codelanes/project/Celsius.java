package com.codelanes.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Celsius {
    // Input the temperature in degree celsius and click convert to show the equivalent value in Fahrenheit
    
    public void showFrame(){
        JFrame myFrame = new JFrame("Celsius Converter");
		myFrame.setSize(400,250);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setResizable(false);
		
		JLabel label1,label2;
		JTextField tf1,tf2;
		JButton b1, b2;
		
		label1 = new JLabel("Celsius");
			label1.setBounds(50,50,120,30);
		label2 = new JLabel("Fahrenheit");
			label2.setBounds(50,90,120,30);
		
		tf1 = new JTextField();
			tf1.setBounds (120,50,200,30);
		tf2 = new JTextField();
			tf2.setBounds (120,90,200,30);
			tf2.setEditable(false);
		b1 = new JButton("Convert");
			b1.setBounds (135,130,80,30);
			b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent ef){
		
		try{
		double num, result;
		num = Double.parseDouble(tf1.getText());
		result = (((num)*(9/5))+32);
		tf2.setText(String.valueOf(result));
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
		


		
		myFrame.add(label1);myFrame.add(label2);
		myFrame.add(tf1);myFrame.add(tf2);
		myFrame.add(b1);myFrame.add(b2);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);

		



    }
    
}
