package Crud;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyAppDemo {

	private JFrame frame;
	private JTextField bname;
	private JTextField price;
	private JTextField qty;
	public JTable table;
	private JTextField uid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyAppDemo window = new MyAppDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyAppDemo() {
		initialize();
		connect();
		loaddata();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	Connection cn;
	PreparedStatement ps;
	ResultSet rs;
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void loaddata() {
		try {
			ps=cn.prepareStatement("select * from library");
			rs=ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 858, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Book Detail", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(20, 58, 378, 273);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 57, 107, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Price");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 91, 107, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 137, 107, 14);
		panel.add(lblNewLabel_2);
		
		bname = new JTextField();
		bname.setBounds(150, 55, 140, 20);
		panel.add(bname);
		bname.setColumns(10);
		
		price = new JTextField();
		price.setBounds(150, 89, 140, 20);
		panel.add(price);
		price.setColumns(10);
		
		qty = new JTextField();
		qty.setText("");
		qty.setBounds(150, 135, 140, 20);
		panel.add(qty);
		qty.setColumns(10);
		
		JButton btnreset = new JButton("Reset");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bname.setText("");
				price.setText("");
				qty.setText("");
			}
		});
		btnreset.setBounds(10, 197, 89, 23);
		panel.add(btnreset);
		
		JButton btnsubmit = new JButton("Submit");
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mybname=bname.getText();
				String myprice=price.getText();
				String myqty=qty.getText();
				try {
					ps=cn.prepareStatement("insert into library values(?,?,?,?)");
					ps.setInt(1, 0);
					ps.setString(2, mybname);
					ps.setString(3, myprice);
					ps.setString(4, myqty);
					
					int i=ps.executeUpdate();
					if(i>0) {
						JOptionPane.showMessageDialog(frame, "Data Submitted Successfully!!!");
						bname.setText("");
						price.setText("");
						qty.setText("");
						loaddata();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnsubmit.setBounds(130, 197, 89, 23);
		panel.add(btnsubmit);
		
		JButton btnedit = new JButton("Edit");
		btnedit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int did=Integer.parseInt(uid.getText());
				String mybname=bname.getText();
				String myprice=price.getText();
				String myqty=qty.getText();
				try {
					ps=cn.prepareStatement("update library set bname=?,price=?,qty=? where bid=?");
					ps.setString(1, mybname);
					ps.setString(2, myprice);
					ps.setString(3, myqty);
					ps.setInt(4, did);
					
					int i=ps.executeUpdate();
					if(i>0) {
						JOptionPane.showMessageDialog(frame, "Data Updated!!!");
						loaddata();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnedit.setBounds(249, 197, 89, 23);
		panel.add(btnedit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(408, 59, 424, 272);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new BorderLayout(0,0));
		
		table = new JTable();
//		table.setBounds(0, 0, 422, 0);
//		table.setBounds(421, 271, -418, -269);
		panel_1.add(table,BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 368, 812, 65);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Book id");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(51, 23, 94, 14);
		panel_2.add(lblNewLabel_3);
		
		uid = new JTextField();
		uid.setBounds(156, 21, 117, 20);
		panel_2.add(uid);
		uid.setColumns(10);
		
		JButton btnupdate = new JButton("Update");
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int did=Integer.parseInt(uid.getText());
				try {
					ps=cn.prepareStatement("select * from library where bid=?");
					ps.setInt(1, did);
					rs=ps.executeQuery();
					if(rs.next()) {
						bname.setText(rs.getString(2));
						price.setText(rs.getString(3));
						qty.setText(rs.getString(4));
					}
					else {
						JOptionPane.showMessageDialog(frame, "Data Not Found!!!");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnupdate.setBounds(327, 20, 89, 23);
		panel_2.add(btnupdate);
		
		JButton btndelete = new JButton("Delete");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int did=Integer.parseInt(uid.getText());
				try {
					System.out.println(did);
					ps=cn.prepareStatement("delete from library where bid=?");
					ps.setInt(1, did);
					int i=ps.executeUpdate();
					if(i>0) {
						JOptionPane.showMessageDialog(frame, "Data deleted!!!");
						loaddata();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btndelete.setBounds(466, 20, 89, 23);
		panel_2.add(btndelete);
		
		JLabel lblNewLabel_4 = new JLabel("Library");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(348, 11, 122, 36);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
