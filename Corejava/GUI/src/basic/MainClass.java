package basic;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainClass {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("demo");
		frame.setVisible(true);
		frame.setSize(700,700);
		frame.setLayout(null);
		
		JLabel name= new JLabel("username");
		name.setBounds(80,100,100,30);
		JTextField name1=new JTextField();
		name1.setBounds(200, 100, 150, 30);
		
		JLabel email=new JLabel("Email");
		email.setBounds(80,150,100,30);
		JTextField email1=new JTextField();
		email1.setBounds(200,150,150,30);
		
		JLabel password=new JLabel("password");
		password.setBounds(80,200,100,30);
		JTextField password1=new JTextField();
		password1.setBounds(200,200,150,30);
		
		JLabel gender=new JLabel("Gender");
		gender.setBounds(80,250,100,30);
		JRadioButton male=new JRadioButton("Male");
		JRadioButton female=new JRadioButton("Female");
		male.setBounds(200,250,70,30);
		female.setBounds(280,250,70,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		JLabel lang = new JLabel("languages");
		lang.setBounds(80,300,100,30);
		JCheckBox ch1=new JCheckBox("Gujarati");
		JCheckBox ch2=new JCheckBox("Hindi");
		JCheckBox ch3=new JCheckBox("English");
		JCheckBox ch4=new JCheckBox("Marathi");
		ch1.setBounds(200,300,70,30);
		ch2.setBounds(280,300,70,30);
		ch3.setBounds(200,330,70,30);
		ch4.setBounds(280,330,70,30);
		
		String ctr[]= {"Select*","India","USA","UK","Canada"};
		JLabel country=new JLabel("Country");
		country.setBounds(80,370,100,30);
		JComboBox<String> country1=new JComboBox<String>(ctr);
		country1.setBounds(200,370,150,30);
		
		JButton btn=new JButton("Sing up");
		btn.setBounds(200,420,150,30);
		
		JMenuBar menubar=new JMenuBar();
		menubar.setBounds(0,0,1400,30);
		
		JMenu menu1=new JMenu("File");
		JMenu menu2=new JMenu("Edit");
		JMenu menu3=new JMenu("Window");
		JMenu menu4=new JMenu("Help");
		
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
		menubar.add(menu4);
		
		JMenuItem i1=new JMenuItem("Open");
		JMenuItem i2=new JMenuItem("Save");
		JMenuItem i3=new JMenuItem("Save As");
		
		menu1.add(i1);
		menu1.add(i2);
		menu1.add(i3);
		
		JMenuItem i4=new JMenuItem("Copy");
		JMenuItem i5=new JMenuItem("Cut");
		
		menu2.add(i4);
		menu2.add(i5);
		
		JMenuItem i6=new JMenuItem("Version");
		menu3.add(i6);
		
		JMenuItem i7=new JMenuItem("About");
		menu4.add(i7);

		frame.add(name);
		frame.add(name1);
		frame.add(email);
		frame.add(email1);
		frame.add(password);
		frame.add(password1);
		frame.add(gender);
		frame.add(male);
		frame.add(female);
		frame.add(lang);
		frame.add(ch1);
		frame.add(ch2);
		frame.add(ch3);
		frame.add(ch4);
		frame.add(country);
		frame.add(country1);
		frame.add(btn);
		frame.add(menubar);
	}
}
