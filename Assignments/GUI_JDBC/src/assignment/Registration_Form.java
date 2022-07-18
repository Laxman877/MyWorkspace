package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Table;

import net.proteanit.sql.DbUtils;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Registration_Form {

	private JFrame frame;
	private JTextField sid;
	private JTextField sname;
	private JTextField saddress;
	private JTextField scontact;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_Form window = new Registration_Form();
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
	public Registration_Form() {
		initialize();
		connect();
		loaddata();
	}
	Connection cn;
	private JTable table;
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void loaddata() {
		PreparedStatement ps;
		try {
			ps=cn.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.setTitle("Registration Form");
		frame.setBounds(100, 100, 812, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(63, 27, 161, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(263, 24, 494, 328);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BorderLayout(0,0));
		
		table = new JTable();
		table.setBounds(494, 324, -493, -323);
		panel.add(table,BorderLayout.NORTH);
		JLabel tid = new JLabel("ID");
		tid.setFont(new Font("Tahoma", Font.BOLD, 12));
		tid.setBounds(24, 87, 46, 14);
		frame.getContentPane().add(tid);
		
		JLabel tname = new JLabel("Name");
		tname.setFont(new Font("Tahoma", Font.BOLD, 12));
		tname.setBounds(24, 126, 46, 14);
		frame.getContentPane().add(tname);
		
		JLabel tgender = new JLabel("Gender");
		tgender.setFont(new Font("Tahoma", Font.BOLD, 12));
		tgender.setBounds(24, 161, 46, 14);
		frame.getContentPane().add(tgender);
		
		JLabel taddress = new JLabel("Address");
		taddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		taddress.setBounds(24, 200, 69, 14);
		frame.getContentPane().add(taddress);
		
		JLabel tcontact = new JLabel("Contact");
		tcontact.setFont(new Font("Tahoma", Font.BOLD, 12));
		tcontact.setBounds(24, 245, 69, 14);
		frame.getContentPane().add(tcontact);
		
		sid = new JTextField();
		sid.setBounds(114, 85, 110, 20);
		frame.getContentPane().add(sid);
		sid.setColumns(10);
		
		sname = new JTextField();
		sname.setBounds(114, 124, 110, 20);
		frame.getContentPane().add(sname);
		sname.setColumns(10);
		
		saddress = new JTextField();
		saddress.setBounds(114, 198, 110, 36);
		frame.getContentPane().add(saddress);
		saddress.setColumns(10);
		
		scontact = new JTextField();
		scontact.setBounds(114, 243, 110, 23);
		frame.getContentPane().add(scontact);
		scontact.setColumns(10);
		
		JRadioButton btnmale = new JRadioButton("Male");
		buttonGroup.add(btnmale);
		btnmale.setSelected(true);
		btnmale.setBounds(100, 158, 53, 23);
		frame.getContentPane().add(btnmale);
		
		JRadioButton btnfemale = new JRadioButton("Female");
		buttonGroup.add(btnfemale);
		btnfemale.setBounds(155, 158, 69, 23);
		frame.getContentPane().add(btnfemale);
		
		JButton btnexit = new JButton("Exit");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnexit.setBounds(24, 299, 89, 23);
		frame.getContentPane().add(btnexit);
		
		JButton btnregister = new JButton("Register");
		btnregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String myid=sid.getText();
				String myname=sname.getText();
				String mygender="";
				String myaddress=saddress.getText();
				String mycontact=scontact.getText();
				if(btnmale.isSelected()) {
					mygender="Male";
				}
				else if(btnfemale.isSelected()) {
					mygender="Female";
				}
				try {
					PreparedStatement ps=cn.prepareStatement("insert into student values(?,?,?,?,?)");
					ps.setInt(1, 0);
					ps.setString(2, myname);
					ps.setString(3, mygender);
					ps.setString(4, myaddress);
					ps.setString(5, mycontact);
					int i=ps.executeUpdate();
					if(i>0) {
						JOptionPane.showMessageDialog(frame, "Registerd Successfully!!");
						sid.setText(" ");
						sname.setText(" ");
						saddress.setText(" ");
						scontact.setText(" ");
						loaddata();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnregister.setBounds(135, 299, 89, 23);
		frame.getContentPane().add(btnregister);
		
		JButton btndelete = new JButton("Delete");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int did=Integer.parseInt(sid.getText());
				try {
					PreparedStatement ps=cn.prepareStatement("delete from student where id=?");
					ps.setInt(1, did);
					int i=ps.executeUpdate();
					if(i>0) {
						JOptionPane.showMessageDialog(frame, "Data Deleted Successfully!!");
						loaddata();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btndelete.setBounds(24, 333, 89, 23);
		frame.getContentPane().add(btndelete);
		
		JButton btnupdate = new JButton("Update");
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int did=Integer.parseInt(sid.getText());
				String myname=sname.getText();
				String mygender="";
				String myaddress=saddress.getText();
				String mycontact=scontact.getText();
				if(btnmale.isSelected()) {
					mygender="Male";
				}
				else if(btnfemale.isSelected()) {
					mygender="Female";
				}
				try {
					PreparedStatement ps=cn.prepareStatement("update student set name=?,gender=?,Adr=?,contact=? where id=?");
					ps.setString(1, myname);
					ps.setString(2, mygender);
					ps.setString(3, myaddress);
					ps.setString(4, mycontact);
					ps.setInt(5, did);
					int i=ps.executeUpdate();
					if(i>0) {
						JOptionPane.showMessageDialog(frame, "Data Updated!!");
						sid.setText(" ");
						sname.setText(" ");
						saddress.setText(" ");
						scontact.setText(" ");
						loaddata();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnupdate.setBounds(135, 333, 89, 23);
		frame.getContentPane().add(btnupdate);
		
		JButton btnreset = new JButton("Reset");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sid.setText("");
				sname.setText("");
				saddress.setText("");
				scontact.setText("");
			}
		});
		btnreset.setBounds(79, 367, 89, 23);
		frame.getContentPane().add(btnreset);
		
		JButton refresh = new JButton("Refresh table");
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sid.setText("");
				sname.setText("");
				saddress.setText("");
				scontact.setText("");
				loaddata();
			}
		});
		refresh.setBounds(369, 363, 250, 23);
		frame.getContentPane().add(refresh);
	}
}
