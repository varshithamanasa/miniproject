package miniproject;



import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;



public class triggers extends JFrame {

	private JPanel contentPane;
	private JTable table;
	Object[][] data=new Object[20][10];
	
	public Object[][] data1=new Object[20][20];
	// private JTable table_1;
	String [] colheads={"name","email","phone","services","age","mid","batch"};
	 String s1[]={"theraphy yoga","general yoga","self defence","rekhi"};
	 private JTable table_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					triggers frame = new triggers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public triggers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("display");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
			
			
			Statement stmt=con.createStatement();
			
			ResultSet rs1=stmt.executeQuery(" select * from trigger_time  ");
			
			
			
			
			int row=0;
				while(rs1.next()){
					
					
						table.setValueAt(rs1.getString("exec_time"), row, 0);
						
						table.setValueAt(rs1.getString("mid"), row, 1);
					
						
					
						
				row++;
		
			
				
				
				
				
				
				
			
				// TODO Auto-generated method stub
				}
			}
			catch(Exception ee)
			{
				System.out.println(ee.getMessage());
			}
				
			}		
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(31, 11, 121, 36);
		contentPane.add(btnNewButton);
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 58, 398, 211);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(31, 426, 634, 312);
		contentPane.add(scrollPane_2);
		
		
		table_1 = new JTable(data1,colheads);
		scrollPane_2.setViewportView(table_1);
		
		String col[]={"exec_time","mid"};
		table = new JTable(data,col);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("REKHI");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{	
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
				
				
				Statement stmt=con.createStatement();
				
				ResultSet rs1=stmt.executeQuery(" CALL first() ");
				
				
				
				
				int row=0;
					while(rs1.next()){
						
						
							table_1.setValueAt(rs1.getString("name"), row, 0);
							
							table_1.setValueAt(rs1.getString("email"), row, 1);
							table_1.setValueAt(rs1.getString("phone"),row,2);
							table_1.setValueAt(rs1.getString("services"), row, 3);
							table_1.setValueAt(rs1.getInt("age"), row, 4);
							table_1.setValueAt(rs1.getString("mid"), row, 5);
							table_1.setValueAt(rs1.getInt("batch"), row, 6);
							
						
							
					row++;
			
					System.out.println("name :"+ rs1.getString(1));
					System.out.println("email :"+rs1.getString(2));
					System.out.println("phone :"+rs1.getString(3));
					System.out.println("services :"+rs1.getString(4));
					System.out.println("age :"+rs1.getString(5));
					System.out.println("mid :"+rs1.getString(6));
					//System.out.println("batch :" +rs.getString(7));
					System.out.println();
					
					
					
					
					
				
					}// TODO Auto-generated method stub
					}
				
				catch(Exception e2)
				{
					System.out.println(e2.getMessage());
				}
			}
		});
		btnNewButton_1.setBounds(31, 316, 128, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("THERAPY YOGA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{	
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
				
				
				Statement stmt=con.createStatement();
				
				ResultSet rs1=stmt.executeQuery(" CALL second() ");
				
				
				
				
				int row=0;
					while(rs1.next()){
						
						
							table_1.setValueAt(rs1.getString("name"), row, 0);
							
							table_1.setValueAt(rs1.getString("email"), row, 1);
							table_1.setValueAt(rs1.getString("phone"),row,2);
							table_1.setValueAt(rs1.getString("services"), row, 3);
							table_1.setValueAt(rs1.getInt("age"), row, 4);
							table_1.setValueAt(rs1.getString("mid"), row, 5);
							table_1.setValueAt(rs1.getInt("batch"), row, 6);
							
						
							
					row++;
			
					System.out.println("name :"+ rs1.getString(1));
					System.out.println("email :"+rs1.getString(2));
					System.out.println("phone :"+rs1.getString(3));
					System.out.println("services :"+rs1.getString(4));
					System.out.println("age :"+rs1.getString(5));
					System.out.println("mid :"+rs1.getString(6));
					//System.out.println("batch :" +rs.getString(7));
					System.out.println();
					
					
					
					
					
				
					}// TODO Auto-generated method stub
					}
				
				catch(Exception e2)
				{
					System.out.println(e2.getMessage());
				}
			}
		});
		btnNewButton_2.setBounds(182, 316, 144, 36);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("GENERAL YOGA");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{	
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
				
				
				Statement stmt=con.createStatement();
				
				ResultSet rs1=stmt.executeQuery(" CALL third() ");
				
				
				
				
				int row=0;
					while(rs1.next()){
						
						
							table_1.setValueAt(rs1.getString("name"), row, 0);
							
							table_1.setValueAt(rs1.getString("email"), row, 1);
							table_1.setValueAt(rs1.getString("phone"),row,2);
							table_1.setValueAt(rs1.getString("services"), row, 3);
							table_1.setValueAt(rs1.getInt("age"), row, 4);
							table_1.setValueAt(rs1.getString("mid"), row, 5);
							table_1.setValueAt(rs1.getInt("batch"), row, 6);
							
						
							
					row++;
			
					System.out.println("name :"+ rs1.getString(1));
					System.out.println("email :"+rs1.getString(2));
					System.out.println("phone :"+rs1.getString(3));
					System.out.println("services :"+rs1.getString(4));
					System.out.println("age :"+rs1.getString(5));
					System.out.println("mid :"+rs1.getString(6));
					//System.out.println("batch :" +rs.getString(7));
					System.out.println();
					
					
					
					
					
				
					}// TODO Auto-generated method stub
					}
				
				catch(Exception e2)
				{
					System.out.println(e2.getMessage());
				}
			}
		});
		btnNewButton_3.setBounds(31, 371, 128, 36);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("SELF DEFENCE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{	
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
				
				
				Statement stmt=con.createStatement();
				
				ResultSet rs1=stmt.executeQuery(" CALL four() ");
				
				
				
				
				int row=0;
					while(rs1.next()){
						
						
							table_1.setValueAt(rs1.getString("name"), row, 0);
							
							table_1.setValueAt(rs1.getString("email"), row, 1);
							table_1.setValueAt(rs1.getString("phone"),row,2);
							table_1.setValueAt(rs1.getString("services"), row, 3);
							table_1.setValueAt(rs1.getInt("age"), row, 4);
							table_1.setValueAt(rs1.getString("mid"), row, 5);
							table_1.setValueAt(rs1.getInt("batch"), row, 6);
							
						
							
					row++;
			
					System.out.println("name :"+ rs1.getString(1));
					System.out.println("email :"+rs1.getString(2));
					System.out.println("phone :"+rs1.getString(3));
					System.out.println("services :"+rs1.getString(4));
					System.out.println("age :"+rs1.getString(5));
					System.out.println("mid :"+rs1.getString(6));
					//System.out.println("batch :" +rs.getString(7));
					System.out.println();
					
					
					
					
					
				
					}// TODO Auto-generated method stub
					}
				
				catch(Exception e2)
				{
					System.out.println(e2.getMessage());
				}
			}
		});
		btnNewButton_4.setBounds(182, 371, 144, 36);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yogamat.jpg"));
		lblNewLabel.setBounds(0, 0, 1400, 800);
		contentPane.add(lblNewLabel);
	

		
	}
}
