package basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calc implements ActionListener {
	JTextField t1,t2,t3;
	JButton Add,Mul,Sub,Div;
	public Calc() {
		JFrame frame=new JFrame("calculator");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLayout(null);
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		Add=new JButton("ADD");
		Sub=new JButton("SUB");
		Mul=new JButton("MUL");
		Div=new JButton("DIV");
		
		t1.setBounds(150,100,200,30);
		t2.setBounds(150,150,200,30);
		t3.setBounds(150,200,200,30);
		Add.setBounds(150,250,90,30);
		Sub.setBounds(250,250,90,30);
		Mul.setBounds(150,300,90,30);
		Div.setBounds(250,300,90,30);
		
		Add.addActionListener(this);
		Sub.addActionListener(this);
		Mul.addActionListener(this);
		Div.addActionListener(this);
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(Add);
		frame.add(Sub);
		frame.add(Mul);
		frame.add(Div);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i=Integer.parseInt(t1.getText());
		int i1=Integer.parseInt(t2.getText());
		if(e.getSource()==Add) {
			int r=i+i1;
			t3.setText(r+"");
		}else if(e.getSource()==Sub)
		{
			int r = i-i1;
			t3.setText(r+"");
		}else if(e.getSource()==Mul)
		{
			int r = i*i1;
			t3.setText(r+"");
		}else if(e.getSource()==Div)
		{
			int r = i/i1;
			t3.setText(r+"");
		}
	}
	public static void main(String[] args) {
		Calc c=new Calc();
	}
}
