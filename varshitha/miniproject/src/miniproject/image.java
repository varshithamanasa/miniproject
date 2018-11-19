package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.beans.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;

public class image extends JFrame {

	private JPanel contentPane;
	private static JTextField t1;
	private static JTextField t2;
	static JLabel t3 ;
	//String s1={"ATMA","MANASA","TEJANANTHA","NANDINI"};
	String s1[]={"therapy_yoga","general_yoga","rekhi","meditation"};
	private JTextField t4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					image frame = new image();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
				
			      
		
			}});
	}

	/**
	 * Create the frame.
	 */
	public image() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel t3 = new JLabel("");
		t3.setBounds(34, 11, 815, 505);
		contentPane.add(t3);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblId.setForeground(Color.WHITE);
		lblId.setBounds(34, 37, 71, 14);
		contentPane.add(lblId);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(34, 84, 71, 14);
		contentPane.add(lblName);
		
		t1 = new JTextField();
		t1.setBounds(132, 34, 86, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(132, 81, 86, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
	
		
		
		
		JButton btnDetails = new JButton("DETAILS");
		btnDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				  try {
			           
			        	

			        	Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
						java.sql.Statement stmt=con.createStatement();
						
						String query="select * from image";
						
						PreparedStatement ps=con.prepareStatement(query);
						
					//	ps.setString(1,"id");
						ResultSet rs=ps.executeQuery();
						
						
						
						
						
						
					while(rs.next()){
						
						
						//table_1.setValueAt(rs1.getString("name"), row, 0);
					
						InputStream binaryStream = rs.getBinaryStream(3);
						//System.out.println(binaryStream);
						
						String s1=rs.getString(1);
								t1.setText(s1);
						String s2=rs.getString(2);
						t2.setText(s2);
						String s3=rs.getString(4);
						t4.setText(s3);
						
						byte[] imgData = rs.getBytes("photo");
						// System.out.println(imgData);
						 ImageIcon icon=new ImageIcon(imgData);
						 t3.setIcon(icon);
					
						 
						
					}
					      	
			        }
			        catch(Exception e)
			        {
			        	System.out.println(e.getMessage());
			        }
			}
		});
		btnDetails.setBounds(341, 33, 143, 23);
		contentPane.add(btnDetails);
		
		JLabel lblNewLabel_1 = new JLabel("SERVICES");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(34, 142, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		t4 = new JTextField();
		t4.setBounds(132, 139, 86, 20);
		contentPane.add(t4);
		t4.setColumns(10);
	
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yogamat.jpg"));
		lblNewLabel.setBounds(0, 0, 1400,800 );
		contentPane.add(lblNewLabel);
		
	
		

	}
}
