package com.codelanes.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Meter {
    //Input the value in meter and click convert to show its equivalent in inches, cm and more  

    public void showFrame(){
        JFrame myFrame = new JFrame("Meter Converter");
		myFrame.setSize(400,400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setResizable(false);
		
		JLabel label1,label2,label3,label4,label5,label6,label7;
		JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
		JButton b1, b2;
		
		label1 = new JLabel("Meter");
			label1.setBounds(50,20,120,30);
		label2 = new JLabel("Inches");
			label2.setBounds(50,60,120,30);
		label3 = new JLabel("Centimeters");
			label3.setBounds(50,100,120,30);
		label4 = new JLabel("Feet");
			label4.setBounds(50,140,120,30);
		label5 = new JLabel("Yards");
			label5.setBounds(50,180,120,30);
		label6 = new JLabel("Kilometer");
			label6.setBounds(50,220,120,30);
		label7 = new JLabel("Mile");
			label7.setBounds(50,260,120,30);
		
		tf1 = new JTextField();
			tf1.setBounds (120,20,200,30);
		tf2 = new JTextField();
			tf2.setBounds (120,60,200,30);
			tf2.setEditable(false);
		tf3 = new JTextField();
			tf3.setBounds (120,100,200,30);
			tf3.setEditable(false);
		tf4 = new JTextField();
			tf4.setBounds (120,140,200,30);
			tf4.setEditable(false);
		tf5 = new JTextField();
			tf5.setBounds (120,180,200,30);
			tf5.setEditable(false);
		tf6 = new JTextField();
			tf6.setBounds (120,220,200,30);
			tf6.setEditable(false);
		tf7 = new JTextField();
			tf7.setBounds (120,260,200,30);
			tf7.setEditable(false);
		
		b1 = new JButton("Convert");
			b1.setBounds (135,300,80,30);
			b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent ef){
		
		try{
		double meter,inches,centimeters,feet, yards, kilometer, mile ;
		meter = Double.parseDouble(tf1.getText());
		inches= (meter*39.37);
		centimeters = (meter*100);
		feet = (meter*3.28);
		yards= (meter*1.094);
		kilometer = meter*1000;
		DecimalFormat formatter = new DecimalFormat("#0.000000");
		
		mile = meter*0.000621;

		tf2.setText(String.valueOf(inches));
		tf3.setText(String.valueOf(centimeters));
		tf4.setText(String.valueOf(feet));
		tf5.setText(String.valueOf(yards));
		tf6.setText(String.valueOf(kilometer));
		tf7.setText(formatter.format(mile));












}
		catch(Exception e){
		tf2.setText("Invalid");

		}

			
		}});
		

		b2 = new JButton("Clear");
			b2.setBounds (225,300,80,30);
			b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
		tf7.setText("");
		
		}});
		


		
		myFrame.add(label1);myFrame.add(label2);myFrame.add(label3);myFrame.add(label4);
		myFrame.add(label5);myFrame.add(label6);myFrame.add(label7);
		myFrame.add(tf1);myFrame.add(tf2);myFrame.add(tf3);myFrame.add(tf4);
		myFrame.add(tf5);myFrame.add(tf6);myFrame.add(tf7);
		myFrame.add(b1);myFrame.add(b2);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);




    }
    
}
