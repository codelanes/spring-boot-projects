package com.codelanes.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.swing.JFrame;

@SpringBootApplication
public class ProjectApplication extends JFrame {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		
		//Create an object of the class you want to run
		//The method use for all the classes is showFrame()
		//You can just replace the class name
		//The classes that you can choose from are
		//Advice, Calc, Calculator, Celsius, City, Dice, Meter and Number
		//Calc project = new Calc();
		//Calculator project = new Calculator();
		//Celsius project = new Celsius();
		
		Advice project = new Advice();
		project.showFrame();
	
	
	
	
	
	}

}
