package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;

public class displaystaff extends JFrame {

	private JPanel contentPane;
	private JTable table;
	public Object[][] data=new Object[30][30];
	private JTextField sid;
	private JTextField nn;
	private JTextField ee;
	private JTextField pp;
	private JTextField aa;
	private JTextField ss;
	private JTextField dd;
	private JTextField bb;
	private JTextField ii;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					displaystaff frame = new displaystaff();
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
	public displaystaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDetails = new JButton("DETAILS");
		btnDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					
						Class.forName("com.mysql.jdbc.Driver");
						
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
					
					
					Statement stmt=con.createStatement();
					
					ResultSet rs1=stmt.executeQuery(" select * from trainers");
					
					
					
					int row=0;
						while(rs1.next()){
							
							
								table.setValueAt(rs1.getString("name"), row, 0);
								
								table.setValueAt(rs1.getString("email"), row, 1);
								table.setValueAt(rs1.getString("phone"),row,2);
								table.setValueAt(rs1.getString("age"), row, 3);
								table.setValueAt(rs1.getString("sid"), row, 4);
								
								table.setValueAt(rs1.getInt("batch"), row, 5);
								table.setValueAt(rs1.getInt("salary"), row, 6);
								table.setValueAt(rs1.getString("address"), row, 7);
								
						row++;
				

					
					
						// TODO Auto-generated method stub
						}
					}
					catch(Exception e1)
					{
						System.out.println(e1.getMessage());
					}
			}
		});
		btnDetails.setBounds(17, 146, 142, 42);
		contentPane.add(btnDetails);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(270, 0, 1100, 549);
		contentPane.add(scrollPane);
		
		String [] colheads={"name","email","phone","age","sid","batch","salary","address"};
		table = new JTable(data,colheads);
		
		scrollPane.setViewportView(table);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
					java.sql.Statement stmt=con.createStatement();
					
					String query="delete from trainers where sid=?";
					
					PreparedStatement ps=con.prepareStatement(query);
					
					ps.setString(1,sid.getText() );
					
					ps.execute();
					
					
					
						JOptionPane.showMessageDialog(null, "successful");
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		});
		btnDelete.setBounds(17, 18, 121, 42);
		contentPane.add(btnDelete);
		
		sid = new JTextField();
		sid.setBounds(73, 83, 86, 20);
		contentPane.add(sid);
		sid.setColumns(10);
		
		JLabel lblSid = new JLabel("ssid");
		lblSid.setForeground(Color.WHITE);
		lblSid.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSid.setBounds(17, 89, 46, 14);
		contentPane.add(lblSid);
		
		JLabel lblName = new JLabel("name");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblName.setBounds(26, 224, 46, 14);
		contentPane.add(lblName);
		
		nn = new JTextField();
		nn.setBounds(119, 206, 86, 20);
		contentPane.add(nn);
		nn.setColumns(10);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(26, 275, 46, 14);
		contentPane.add(lblEmail);
		
		ee = new JTextField();
		ee.setBounds(119, 269, 124, 20);
		contentPane.add(ee);
		ee.setColumns(10);
		
		JLabel lblPhone = new JLabel("phone");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setBounds(26, 420, 46, 20);
		contentPane.add(lblPhone);
		
		pp = new JTextField();
		pp.setBounds(123, 420, 86, 20);
		contentPane.add(pp);
		pp.setColumns(10);
		
		JLabel lblAge = new JLabel("age");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAge.setForeground(Color.WHITE);
		lblAge.setBounds(26, 370, 46, 14);
		contentPane.add(lblAge);
		
		aa = new JTextField();
		aa.setBounds(123, 370, 86, 20);
		contentPane.add(aa);
		aa.setColumns(10);
		
		JLabel lblSalary = new JLabel("salary");
		lblSalary.setForeground(Color.WHITE);
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSalary.setBounds(26, 470, 46, 14);
		contentPane.add(lblSalary);
		
		ss = new JTextField();
		ss.setBounds(123, 470, 86, 20);
		contentPane.add(ss);
		ss.setColumns(10);
		
		JLabel lblAddress = new JLabel("address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAddress.setBounds(26, 560, 72, 14);
		contentPane.add(lblAddress);
		
		dd = new JTextField();
		dd.setBounds(123, 563, 151, 54);
		contentPane.add(dd);
		dd.setColumns(10);
		
		JLabel lblBatch = new JLabel("batch");
		lblBatch.setForeground(Color.WHITE);
		lblBatch.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBatch.setBounds(26, 495, 46, 54);
		contentPane.add(lblBatch);
		
		bb = new JTextField();
		bb.setBounds(123, 515, 86, 20);
		contentPane.add(bb);
		bb.setColumns(10);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String newname=nn.getText();
					String salary=ss.getText();
					String phone=pp.getText();
					String age=aa.getText();
					String batch=bb.getText();
					String email=ee.getText();
					String address=dd.getText();
					String sid=ii.getText();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
					String query1="update trainers set name = ?, email=?,phone=?,age=?,batch=?,salary=?,address=? where sid=?";
					
					
					PreparedStatement pst=conn.prepareStatement(query1);
				
					pst.setString(1, newname);
					pst.setString(2, email);
					pst.setString(3, phone);
					pst.setString(4, age);
					pst.setString(5,batch);
					pst.setString(6, salary);
					pst.setString(7, address);
					pst.setString(8, sid);
					
					pst.executeUpdate();
			
					
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		});
		btnUpdate.setBounds(26, 628, 112, 42);
		contentPane.add(btnUpdate);
		
		JLabel lblSid_1 = new JLabel("sid");
		lblSid_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSid_1.setForeground(Color.WHITE);
		lblSid_1.setBounds(26, 328, 46, 14);
		contentPane.add(lblSid_1);
		
		ii = new JTextField();
		ii.setBounds(123, 316, 86, 20);
		contentPane.add(ii);
		ii.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yogamat.jpg"));
		lblNewLabel.setBounds(0, 0, 1400, 800);
		contentPane.add(lblNewLabel);
	}
}
