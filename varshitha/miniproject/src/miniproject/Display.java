package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import javax.swing.BoxLayout;

import java.awt.ScrollPane;

import javax.swing.JScrollPane;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Display extends JFrame {
	public String name,email;
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JTable table_1;
public String m1;
 public Object[][] data=new Object[40][40];
public ArrayList<String> users;
private JTextField nn;
private JTextField mm;
private JTextField ee;
private JTextField ss;
private JTextField aa;
private JTextField pp;
private JTextField mmm;
private JTextField b;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try 
				{
					Display frame = new Display();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
	}


	/**
	 * Create the frame.
	 */
	
	
	public Display() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String [] colheads={"name","email","phone","services","age","mid","batch"};

		
		JTable	table_1 = new JTable(data,colheads);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"name", "email", "phone", "services", "age", "mid", "batch"
			}
		));
		table_1.getColumnModel().getColumn(0).setMinWidth(25);
		table_1.getColumnModel().getColumn(1).setMinWidth(65);
		JScrollPane scrollPane_1 = new JScrollPane(table_1);
		scrollPane_1.setBounds(10, 110, 855, 348);
			//table_1.getColumn("phone");
			getContentPane().add(scrollPane_1);
			getContentPane().add(scrollPane_1);
		
		Button button = new Button("DETAILS");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			try
			{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
				
				
				Statement stmt=con.createStatement();
				
				ResultSet rs1=stmt.executeQuery(" select * from yogamembers  ");
				
				
				
				
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
					
					
					
					
					
				
					// TODO Auto-generated method stub
					}
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
	
		});
		contentPane.setLayout(null);
		button.setBounds(387, 11, 112, 35);
		contentPane.add(button);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String newname=nn.getText();
					String mmid=mm.getText();
					String phone=pp.getText();
					String age=aa.getText();
					String services=ss.getText();
					String email=ee.getText();
					String batch=b.getText();
					
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
					String query1="update yogamembers set name = ?, email=?,phone=?,services=?,age=?,batch=? where mid=?";
					
					
					PreparedStatement pst=conn.prepareStatement(query1);
				
					pst.setString(1, newname);
					pst.setString(2, email);
					pst.setString(3, phone);
					pst.setString(4, services);
					pst.setString(5,age);
					pst.setString(6, batch);
					pst.setString(7, mmid);
					pst.executeUpdate();
					System.out.println("hi");
					
				}
				
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		});
		btnUpdate.setBounds(25, 10, 117, 36);
		contentPane.add(btnUpdate);
		
		nn = new JTextField();
		nn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
				if(key==10)
				{
					ee.requestFocus();
				}
			}
		});
		nn.setBounds(1196, 114, 86, 20);
		contentPane.add(nn);
		nn.setColumns(10);
		
		mm = new JTextField();
		mm.setBounds(1196, 145, 86, 20);
		contentPane.add(mm);
		mm.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblName.setBounds(1104, 117, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblMid = new JLabel("MID");
		lblMid.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMid.setBounds(1104, 145, 46, 14);
		contentPane.add(lblMid);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(1104, 182, 46, 14);
		contentPane.add(lblEmail);
		
		ee = new JTextField();
		ee.setBounds(1196, 179, 142, 20);
		contentPane.add(ee);
		ee.setColumns(10);
		
		JLabel lblServices = new JLabel("SERVICES");
		lblServices.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblServices.setBounds(1104, 228, 82, 14);
		contentPane.add(lblServices);
		
		ss = new JTextField();
		ss.setBounds(1196, 226, 142, 20);
		contentPane.add(ss);
		ss.setColumns(10);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAge.setBounds(1104, 273, 46, 14);
		contentPane.add(lblAge);
		
		aa = new JTextField();
		aa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
				if(key==10)
				{
					mm.requestFocus();
				}
			}
		});
		aa.setBounds(1196, 271, 86, 20);
		contentPane.add(aa);
		aa.setColumns(10);
		
		JLabel lblPhone = new JLabel("PHONE");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPhone.setBounds(1104, 319, 65, 14);
		contentPane.add(lblPhone);
		
		b = new JTextField();
		b.setBounds(1196, 374, 86, 20);
		contentPane.add(b);
		b.setColumns(10);
		
		pp = new JTextField();
		pp.setBounds(1196, 317, 86, 20);
		contentPane.add(pp);
		pp.setColumns(10);
		
		JLabel lblBatch = new JLabel("BATCH");
		lblBatch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBatch.setBounds(1104, 375, 65, 14);
		contentPane.add(lblBatch);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					String mmid=mmm.getText();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
					java.sql.Statement stmt=con.createStatement();
					
					String query="delete from yogamembers where mid=?";
					
					PreparedStatement ps=con.prepareStatement(query);
					
					ps.setString(1, mmid);
					
					ps.execute();
					
					
					
						JOptionPane.showMessageDialog(null, "successful");
						//loginpage lg=new loginpage();
					//	lg.setVisible(true);
					
					
					
					
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		});
		btnDelete.setBounds(741, 11, 112, 35);
		contentPane.add(btnDelete);
		
		JLabel lblMmid = new JLabel("MMID");
		lblMmid.setBounds(923, 21, 46, 14);
		contentPane.add(lblMmid);
		
		mmm = new JTextField();
		mmm.setBounds(1008, 18, 86, 20);
		contentPane.add(mmm);
		mmm.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yogamat.jpg"));
		lblNewLabel.setBounds(0, 0, 1400, 800);
		contentPane.add(lblNewLabel);
		
	
		
	
		
		
		
		
	
	
		
		
		

		
		
	}	
}
