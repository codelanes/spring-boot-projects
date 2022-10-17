package com.codelanes.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class City {
    //Input the name of the country then click search button to show the capital city

    public void showFrame(){
        JFrame myFrame = new JFrame("Capital City");
        myFrame.setSize(500,300);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(false);

        JLabel label1,label2;
		JTextField tf1,tf2;
		JButton b1, b2;

        label1 = new JLabel("Country");
			label1.setBounds(50,50,150,30);
		label2 = new JLabel("Capital");
			label2.setBounds(50,90,150,30);
		
		tf1 = new JTextField();
			tf1.setBounds (150,50,200,30);
		tf2 = new JTextField();
			tf2.setBounds (150,90,200,30);
			tf2.setEditable(false);
			
		b1 = new JButton("Search");
			b1.setBounds (100,130,100,30);
			b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    String name = tf1.getText();
                    name = name.toUpperCase();		
                    HashMap<String,String> capital = new HashMap<String,String>();
                    capital.put("AFGHANISTAN", "Kabul");
                    capital.put("ALBANIA", "Tirana");
                    capital.put("ALGERIA", "Algiers");
                    capital.put("ANDORRA", "Andorra la Vella");
                    capital.put("ANGOLA", "Luanda");
                    capital.put("ANTIGUA AND BARBUDA", "Saint John's");
                    capital.put("ARGENTINA", "Buenos Aires");
                    capital.put("ARMENIA", "Yerevan");
                    capital.put("AUSTRALIA", "Canberra");
                    capital.put("AUSTRIA", "Vienna");
                    capital.put("AZERBAIJAN", "Baku");
                    capital.put("BAHAMAS", "Nassau");
                    capital.put("BAHRAIN", "Manama");
                    capital.put("BANGLADESH", "Dhaka");
                    capital.put("BARBADOS", "Bridgetown");
                    capital.put("BELARUS", "Minsk");
                    capital.put("BELGIUM", "Brussels");
                    capital.put("BELIZE", "Belmopan");
                    capital.put("BENIN", "Porto Novo");
                    capital.put("BHUTAN", "Thimphu");
                    capital.put("BOLIVIA", "Sucre and Lapaz");
                    capital.put("BOSNIA AND HERZEGOVINA", "Sarajevo");
                    capital.put("BOTSWANA", "Gaborone");
                    capital.put("BRAZIL", "Brasilia");
                    capital.put("BRUNEI", "Bandar Seri Begawan");
                    capital.put("BULGARIA", "Sofia");
                    capital.put("BURKINA FASO", "Ouagadougou");
                    capital.put("BURUNDI", "Gitega");
                    capital.put("CAMBODIA", "Phnom Penh");
                    capital.put("CAMEROON", "Yaounde");
                    capital.put("CANADA", "Ottawa");
                    capital.put("CAPE VERDE", "Praia");
                    capital.put("CENTRAL AFRICAN REPUBLIC", "Bangui");
                    capital.put("CHAD", "N'Djamena");
                    capital.put("CHILE", "Santiago");
                    capital.put("CHINA", "Beijing");
                    capital.put("COLOMBIA", "Bogota");
                    capital.put("COMOROS", "Moroni");
                    capital.put("COSTA RICA", "San Jose");
                    capital.put("CROATIA", "Zagreb");
                    capital.put("CUBA", "Havana");
                    capital.put("CYPRUS", "Nicosia");
                    capital.put("CZECH REPUBLIC", "Prague");
                    capital.put("DENMARK", "Copenhagen");
                    capital.put("DJIBOUTI", "Djibouti");
                    capital.put("DOMINICA", "Roseau");
                    capital.put("DOMINICAN REPUBLIC", "Santo Domingo");
                    capital.put("EAST TIMOR", "Dili");
                    capital.put("ECUADOR", "Quito");
                    capital.put("EGYPT", "Cairo");
                    capital.put("EL SALVADOR", "San Salvador");
                    capital.put("ENGLAND", "London");
                    capital.put("EQUATORIAL GUINEA", "Malabo");
                    capital.put("ERITREA", "Asmara");
                    capital.put("ESTONIA", "Tallinn");
                    capital.put("ESWATINI", "Mbabana");
                    capital.put("ETHIOPIA", "Addis Ababa");
                    capital.put("FEDERATED STATES OF MICRONESIA", "Palikir");
                    capital.put("FIJI", "Suva");
                    capital.put("FINLAND", "Helsinki");
                    capital.put("FRANCE", "Paris");
                    capital.put("GABON", "Libreville");
                    capital.put("GAMBIA", "Banjul");
                    capital.put("GEORGIA", "Tbilisi");
                    capital.put("GERMANY", "Berlin");
                    capital.put("GHANA", "Accra");
                    capital.put("GREECE", "Athens");
                    capital.put("GRENADA", "Saint George's");
                    capital.put("GUATEMALA", "Guatemala City");
                    capital.put("GUINEA", "Conakry");
                    capital.put("GUINEA-BISSAU", "Bissau");
                    capital.put("GUYANA", "Georgetown");
                    capital.put("HAITI", "Port au Prince");
                    capital.put("HONDURAS", "Tegucigalpa");
                    capital.put("HUNGARY", "Budapest");
                    capital.put("ICELAND", "Reykjavik");
                    capital.put("INDIA", "New Delhi");
                    capital.put("INDONESIA", "Jakarta");
                    capital.put("IRAN", "Tehran");
                    capital.put("IRAQ", "Baghdad");
                    capital.put("IRELAND", "Dublin");
                    capital.put("ISRAEL", "Jerusalem");
                    capital.put("ITALY", "Rome");
                    capital.put("JAMAICA", "Kingston");
                    capital.put("JAPAN", "Tokyo");
                    capital.put("JORDAN", "Amman");
                    capital.put("KAZAKHSTAN", "Nur-Sultan");
                    capital.put("KENYA", "Nairobi");
                    capital.put("KIRIBATI", "Tarawa Atoll");
                    capital.put("KOSOVO", "Pristina");
                    capital.put("KUWAIT", "Kuwait City");
                    capital.put("KYRGYZSTAN", "Bishkek");
                    capital.put("LAOS", "Vientiane");
                    capital.put("LATVIA", "Riga");
                    capital.put("LEBANON", "Beirut");
                    capital.put("LESOTHO", "Maseru");
                    capital.put("LIBERIA", "Monrovia");
                    capital.put("LIBYA", "Tripoli");
                    capital.put("LIECHTENSTEIN", "Vaduz");
                    capital.put("LITHUANIA", "Vilnius");
                    capital.put("LUXEMBOURG", "Luxembourg");
                    capital.put("MADAGASCAR", "Antananarivo");
                    capital.put("MALAWI", "Lilongwe");
                    capital.put("MALAYSIA", "Kuala Lumpur");
                    capital.put("MALDIVES", "Male");
                    capital.put("MALI", "Bamako");
                    capital.put("MALTA", "Valletta");
                    capital.put("MARSHALL ISLANDS", "Majuro");
                    capital.put("MAURITANIA", "Nouakchott");
                    capital.put("MAURITIUS", "Port Louis");
                    capital.put("MEXICO", "Mexico City");
                    capital.put("MOLDOVA", "Chisinau");
                    capital.put("MONACO", "Monaco");
                    capital.put("MONGOLIA", "Ulaanbatar");
                    capital.put("MONTENEGRO", "Podgorica");
                    capital.put("MOROCCO", "Rabat");
                    capital.put("MOZAMBIQUE", "Maputo");
                    capital.put("MYANMAR", "Nay Pyi Taw");
                    capital.put("NAMIBIA", "Windhoek");
                    capital.put("NEPAL", "Kathmandu");
                    capital.put("NETHERLANDS", "Amsterdam");
                    capital.put("NEW ZEALAND", "Wellington");
                    capital.put("NICARAGUA", "Managua");
                    capital.put("NIGER", "Niamey");
                    capital.put("NIGERIA", "Abuja");
                    capital.put("NORTH KOREA", "Pyongyang");
                    capital.put("NORTH MACEDONIA", "Skopje");
                    capital.put("NORTHERN IRELAND", "Belfast");
                    capital.put("NORWAY", "Oslo");
                    capital.put("OMAN", "Muscat");
                    capital.put("PAKISTAN", "Islamabad");
                    capital.put("PALAU", "Melekeok");
                    capital.put("PANAMA", "Panama City");
                    capital.put("PAPUA NEW GUINEA", "Port Moresby");
                    capital.put("PARAGUAY", "Asuncion");
                    capital.put("PERU", "Lima");
                    capital.put("PHILIPPINES", "Manila");
                    capital.put("POLAND", "Warsaw");
                    capital.put("PORTUGAL", "Lisbon");
                    capital.put("QATAR", "Doha");
                    capital.put("ROMANIA", "Bucharest");
                    capital.put("RUSSIA", "Moscow");
                    capital.put("RWANDA", "Kigali");
                    capital.put("SAINT KITTS AND NEVIS", "Basseterre");
                    capital.put("SAINT LUCIA", "Castries");
                    capital.put("SAMOA", "Apia");
                    capital.put("SAN MARINO", "San Marino");
                    capital.put("SAUDI ARABIA", "Riyadh");
                    capital.put("SCOTLAND", "Edinburgh");
                    capital.put("SENEGAL", "Dakar");
                    capital.put("SERBIA", "Belgrade");
                    capital.put("SEYCHELLES", "Victoria");
                    capital.put("SIERRA LEONE", "Freetown");
                    capital.put("SINGAPORE", "Singapore");
                    capital.put("SLOVAKIA", "Bratislava");
                    capital.put("SLOVENIA", "Ljubljana");
                    capital.put("SOLOMON ISLANDS", "Honiara");
                    capital.put("SOMALIA", "Mogadishu");
                    capital.put("SOUTH AFRICA", "Pretoria, Bloemfontein, Cape Town");
                    capital.put("SOUTH KOREA", "Seoul");
                    capital.put("SOUTH SUDAN", "Juba");
                    capital.put("SPAIN", "Madrid");
                    capital.put("SRI LANKA", "Sri Jayawardenapura Kotte");
                    capital.put("SUDAN", "Khartoum");
                    capital.put("SURINAME", "Paramaribo");
                    capital.put("SWEDEN", "Stockholm");
                    capital.put("SWITZERLAND", "Bern");
                    capital.put("SYRIA", "Damascus");
                    capital.put("TAIWAN", "Taipei");
                    capital.put("TAJIKISTAN", "Dushanbe");
                    capital.put("TANZANIA", "Dodoma");
                    capital.put("THAILAND", "Bangkok");
                    capital.put("TOGO", "Lome");
                    capital.put("TONGA", "Nuku'alofa");
                    capital.put("TRINIDAD AND TOBAGO", "Port of Spain");
                    capital.put("TUNISIA", "Tunis");
                    capital.put("TURKEY", "Ankara");
                    capital.put("TURKMENISTAN", "Ashgabat");
                    capital.put("TUVALU", "Funafuti");
                    capital.put("UGANDA", "Kampala");
                    capital.put("UKRAINE", "Kyiv");
                    capital.put("UNITED ARAB EMIRATES", "Abu Dhabi");
                    capital.put("UNITED KINGDOM", "London");
                    capital.put("UNITED STATES", "Washington D.C.");
                    capital.put("URUGUAY", "Montevideo");
                    capital.put("UZBEKISTAN", "Tashkent");
                    capital.put("VANUATU", "Port Vila");
                    capital.put("VATICAN CITY", "Vatican City");
                    capital.put("VENEZUELA", "Caracas");
                    capital.put("VIETNAM", "Hanoi");
                    capital.put("WALES", "Cardiff");
                    capital.put("YEMEN", "Sana'a");
                    capital.put("ZAMBIA", "Lusaka");
                    capital.put("ZIMBABWE", "Harare");
                    
                    tf2.setText(capital.get(name));
            
                }

            });
		
		b2 = new JButton("Clear");
			b2.setBounds (210,130,100,30);
			b2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    tf1.setText("");
		            tf2.setText("");
                }
            });

		myFrame.add(label1);myFrame.add(label2);
		myFrame.add(tf1);myFrame.add(tf2);
		myFrame.add(b1);myFrame.add(b2);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);

}

    
}
