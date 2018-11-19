package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class stored_proc extends JFrame {

	private JPanel contentPane;
	 public Object[][] data=new Object[20][20];
	 private JTable table;
	 String s1[]={"theraphy yoga","general yoga","self defence","rekhi"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stored_proc frame = new stored_proc();
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
	public stored_proc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 853, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 64, 729, 375);
		contentPane.add(scrollPane);
		String [] colheads={"name","email","phone","services","age","mid","batch"};
		table = new JTable(data,colheads);
		scrollPane.setViewportView(table);
		
		JButton btnDetails = new JButton("details");
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
			
			
			Statement stmt=con.createStatement();
			
			ResultSet rs1=stmt.executeQuery(" CALL first() ");
			
			
			
			
			int row=0;
				while(rs1.next()){
					
					
						table.setValueAt(rs1.getString("name"), row, 0);
						
						table.setValueAt(rs1.getString("email"), row, 1);
						table.setValueAt(rs1.getString("phone"),row,2);
						table.setValueAt(rs1.getString("services"), row, 3);
						table.setValueAt(rs1.getInt("age"), row, 4);
						table.setValueAt(rs1.getString("mid"), row, 5);
						table.setValueAt(rs1.getInt("batch"), row, 6);
						
					
						
				row++;
		
				System.out.println("name :"+ rs1.getString(1));
				System.out.println("email :"+rs1.getString(2));
				System.out.println("phone :"+rs1.getString(3));
				System.out.println("services :"+rs1.getString(4));
				System.out.println("age :"+rs1.getString(5));
				System.out.println("mid :"+rs1.getString(6));
				//System.out.println("batch :" +rs.getString(7));
				System.out.println();
				
				
				
				
				
			
				// TODO Auto-generated method stub
				}
			}
			catch(Exception e1)
			{
				System.out.println(e1.getMessage());
			}
			}
		});
		btnDetails.setBounds(45, 30, 89, 23);
		contentPane.add(btnDetails);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yoga3.png"));
		lblNewLabel.setBounds(10, 11, 804, 428);
		contentPane.add(lblNewLabel);
		
		//CALL `first`();
	}
}
