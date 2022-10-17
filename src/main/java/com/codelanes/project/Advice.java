package com.codelanes.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Advice {
    //Input a number from 1-100 then click search button to show life advice

    public void showFrame(){
        JFrame myFrame = new JFrame("Life Advice");
		myFrame.setSize(500,300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setResizable(false);
		
		JLabel label1,label2,label3;
		JTextField tF;
		JTextArea tA;
		JButton b1, b2;
		
		label1 = new JLabel("Choose a Number From 1-100");
			label1.setBounds(50,10,200,30);
		label2 = new JLabel("Number");
			label2.setBounds(50,50,100,30);
		label3 = new JLabel("Result");
			label3.setBounds(50,90,100,30);
		
		tF = new JTextField();
			tF.setBounds (100,50,300,30);
		tA = new JTextArea(5,5);
			tA.setBounds (100,90,300,60);
			tA.setEditable(false);
			tA.setLineWrap(true);
			tA.setWrapStyleWord(true);
			
		
		b1 = new JButton("Search");
			b1.setBounds (100,160,100,30);
			b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		int num = Integer.parseInt(tF.getText());		
		HashMap<Integer,String> capital = new HashMap<Integer,String>();
		
            capital.put(1, "Believe in yourself.");
            capital.put(2, "Choose your friends wisely.");
            capital.put(3, "Luck comes from hardwork.");
            capital.put(4, "Money and success don't change people, they merely amplify what they are.");
            capital.put(5, "Whether you think you can or think you can't, you're right.");
            capital.put(6, "Begin your day with gratitude.");
            capital.put(7, "Life takes new meaning when we invest ourselves in others.");
            capital.put(8, "Be patient and persistent.");
            capital.put(9, "Do the small things right.");
            capital.put(10, "Do not fear failure but please be terrified of regret.");
            capital.put(11, "Don't try to impress everyone.");
            capital.put(12, "Irritability is a symptom of an out-of-balance life");
            capital.put(13, "You can't wait until life isn't hard anymore before you decide to be happy.");
            capital.put(14, "Great achievement requires great perseverance.");
            capital.put(15, "If the opportunity doesn't knock, build a door.");
            capital.put(16, "You can't always get what you want.");
            capital.put(17, "You can fail at what you don't want, so you might as well take a chance on doing what you love.");
            capital.put(18, "The manner of giving shows the character of the giver more than the gift itself.");
            capital.put(19, "Don't make decisions when you are angry.");
            capital.put(20, "Do not allow your past to define you.");
            capital.put(21, "A wise person sets his earthly goals on heavenlt gains.");
            capital.put(22, "Lack of direction, not lack of time is the problem. We all have twenty-four hours a day.");
            capital.put(23, "Love yourself.");
            capital.put(24, "If people are doubting how far you can go, go so far you can't hear them anymore.");
            capital.put(25, "Inspect your own ife before you look for specks in others.");
            capital.put(26, "Do what is right, not what is easy.");
            capital.put(27, "To return good for good is human; to return good for evil is divine.");
            capital.put(28, "Be optimistic.");
            capital.put(29, "We may successfully fool others, but God knows our hearts.");
            capital.put(30, "Prayer should be our first response rather than our last resort.");
            capital.put(31, "Don't worry about what other people think.");
            capital.put(32, "A heart that is focused on others will not be consumed with self.");
            capital.put(33, "To become successful, you need to develop self-confidence and self-trust.");
            capital.put(34, "Treat others the way you want to be treated.");
            capital.put(35, "The moment you give up, you start looking for excuses. The moment you think you can do it, you find a way.");
            capital.put(36, "Teamwork divides the effort and multiplies the effect.");
            capital.put(37, "Dreams remain dreams until you take action.");
            capital.put(38, "Success often rises out of the ashes of failure.");
            capital.put(39, "Your little acts of kindness may change someone's life.");
            capital.put(40, "Learn something new everyday.");
            capital.put(41, "If we take care of our character, our reputation will take care of itself.");
            capital.put(42, "If you want to live a happy life, tie it to a goal, not to people or things.");
            capital.put(43, "The power of habit can transform your life.");
            capital.put(44, "Trust your instincts.");
            capital.put(45, "Never underestimate the value of one soul.");
            capital.put(46, "Take care of yourself.");
            capital.put(47, "Never stop learning and growing as a person.");
            capital.put(48, "Our words have the power to build up or tear down.");
            capital.put(49, "Humility is the recipe for success.");
            capital.put(50, "When you quit, you fail.");
            capital.put(51, "Life takes on new meaning when we invest ourselves in others.");
            capital.put(52, "Be around people who want the best for you.");
            capital.put(53, "Change your thinking, change your life.");
            capital.put(54, "When you've found your purpose, boredom doesn't exist anymore.");
            capital.put(55, "You have the opportunity to make a difference in the world and in yourself.");
            capital.put(56, "Be grateful.");
            capital.put(57, "Focus on today.");
            capital.put(58, "Most things are not as bad as you think they are.");
            capital.put(59, "Be kind.");
            capital.put(60, "Be considerate of others.");
            capital.put(61, "Stop overthinking.");
            capital.put(62, "Respect other people's opinion even if they differ from your own.");
            capital.put(63, "Think about how you can help others.");
            capital.put(64, "Positivity can change your outlook in life.");
            capital.put(65, "Don't fear change.");
            capital.put(66, "Have the courage to live a life true to yourself, noth the life others expect of you.");
            capital.put(67, "If you don't like the road you're walking, start paving another one.");
            capital.put(68, "Success is getting what you want, happiness is wanting what you get.");
            capital.put(69, "Travel whenever you can.");
            capital.put(70, "Remember you'll always regret what you didn't do rather than what you did.");
            capital.put(71, "Learn something new everyday.");
            capital.put(72, "Never fear failure.");
            capital.put(73, "Time is the most valuable thing you can spend in this world.");
            capital.put(74, "View challenges as opportunities.");
            capital.put(75, "Happiness is a choice and everything else is a matter of perspective.");
            capital.put(76, "Share your wisdom.");
            capital.put(77, "No matter what you feel, get up, dress up, show up and never give up.");
            capital.put(78, "Set goals.");
            capital.put(79, "Don't ignore your own potential.");
            capital.put(80, "Be happy with what you have while working for what you want.");
            capital.put(81, "Visualize your success.");
            capital.put(82, "The key to success is to start before you are 100% ready.");
            capital.put(83, "You will never always be motivated, so you must learn to be disciplined.");
            capital.put(84, "Your mindset is the most important factor in achieving your goals and dreams.");
            capital.put(85, "If you change nothing, nothing will change.");
            capital.put(86, "Take the risk or lose the chance.");
            capital.put(87, "You get what you work for, not what you wish for.");
            capital.put(88, "Don't be afraid to fail. Be afraid not to try.");
            capital.put(89, "Educate yourself on personal finance.");
            capital.put(90, "See rejection as redirection.");
            capital.put(91, "Choose a job you love, and you will never have to work a day in your life.");
            capital.put(92, "Don't stress over what you cannot control.");
            capital.put(93, "If it's both terrifying and exciting then you should definitely pursue it.");
            capital.put(94, "Remember when you wanted what you currently have.");
            capital.put(95, "Be brave enough to be bad at something new.");
            capital.put(96, "Look for the good in others.");
            capital.put(97, "Do something today that your future self will thank you for.");
            capital.put(98, "Look for inspiration everywhere and be curious.");
            capital.put(99, "It's a very short life. There is no reason not to go after what sets your soul on fire.");
            capital.put(100, "Work hard in silence. Let your success be your noise.");

		tA.setText(capital.get(num));
		}});

		b2 = new JButton("Clear");
			b2.setBounds (210,160,100,30);
			b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		tF.setText("");
		tA.setText("");
		}});

        myFrame.add(label1);myFrame.add(label2);myFrame.add(label3);
		myFrame.add(tF);myFrame.add(tA);
		myFrame.add(b1);myFrame.add(b2);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);

    }
    
}
