package com.codelanes.project;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {

    //Input two numbers then click the button add,subtract,multiply or divide to show the answer

    public void showFrame(){
        JFrame myFrame = new JFrame("Calculator");
		myFrame.setSize(500,300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setResizable(false);
		
		JLabel label1,label2,label3;
		JTextField tf1,tf2,tf3;
		JButton b1, b2,b3,b4,b5;
		
		label1 = new JLabel("First Number");
			label1.setBounds(50,50,150,30);
		label2 = new JLabel("Second Number");
			label2.setBounds(50,90,150,30);
		label3 = new JLabel("Result");
			label3.setBounds(50,130,150,30);
		tf1 = new JTextField();
			tf1.setBounds (150,50,200,30);
		tf2 = new JTextField();
			tf2.setBounds (150,90,200,30);
		tf3 = new JTextField();
			tf3.setBounds (150,130,200,30);
			tf3.setEditable(false);
		b1 = new JButton("Add");
			b1.setBounds (50,170,80,30);
			b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent ef){
		
		try{
		double num1, num2, result;
		num1 = Double.parseDouble(tf1.getText());
		num2 = Double.parseDouble(tf2.getText());
		result = num1 + num2;
		tf3.setText(String.valueOf(result));
		}
		catch(Exception e){
		tf3.setText("Invalid");

		}

			
		}});
		
		b2 = new JButton("Subtract");
			b2.setBounds (130,170,80,30);
			b2.setMargin(new Insets(0,0,0,0));
			b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ef){
		try{
		Double num1, num2, result;
		num1 = Double.parseDouble(tf1.getText());
		num2 = Double.parseDouble(tf2.getText());
		result = num1 - num2;
		tf3.setText(String.valueOf(result));
		}
		catch(Exception e){
		tf3.setText("Invalid");

		}

		}});

		b3 = new JButton("Multiply");
			b3.setBounds (210,170,80,30);
			b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ef){
		try{
		Double num1, num2, result;
		num1 = Double.parseDouble(tf1.getText());
		num2 = Double.parseDouble(tf2.getText());
		result = num1 * num2;
		tf3.setText(String.valueOf(result));
		}
		catch(Exception e){
		tf3.setText("Invalid");

		}

		}});

		b4 = new JButton("Divide");
			b4.setBounds (290,170,80,30);
			b4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ef){
		try{
		Double num1, num2, result;
		num1 = Double.parseDouble(tf1.getText());
		num2 = Double.parseDouble(tf2.getText());
		result = num1 / num2;
		tf3.setText(String.valueOf(result));
		}
		catch(Exception e){
		tf3.setText("Invalid");

		}

		}});










		b5 = new JButton("Clear");
			b5.setBounds (370,170,80,30);
			b5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");}});
		


		
		myFrame.add(label1);myFrame.add(label2);myFrame.add(label3);
		myFrame.add(tf1);myFrame.add(tf2);myFrame.add(tf3);
		myFrame.add(b1);myFrame.add(b2);myFrame.add(b3);myFrame.add(b4);myFrame.add(b5);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);





    }
    
}
