package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;

public class yogastaff extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t8;
	private JTextField t7;
	private JTextField t9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yogastaff frame = new yogastaff();
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
	public yogastaff() {
		setForeground(Color.BLACK);
		setFont(new Font("Times New Roman", Font.BOLD, 15));
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\acer\\Downloads\\deniz-altindas-38128-unsplash.jpg"));
		setTitle("   \t\t\t\t\t\t\t\tTRAINERS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1400,800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 55, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EMAIL ADDRESS");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 111, 137, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PHONE NUMBER");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 177, 137, 14);
		contentPane.add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
				if(key==10)
				{
					t2.requestFocus();
				}
			
			}
		});
		t1.setBounds(157, 55, 213, 33);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				if(key==10)
				{
					t3.requestFocus();
				}
				
			}
		});
		t2.setBounds(157, 111, 236, 33);
		contentPane.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				if(key==10)
				{
					t4.requestFocus();
				}
			}
		});
		t3.setBounds(157, 171, 114, 33);
		contentPane.add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("AGE");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(10, 238, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(306, 177, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		t4 = new JTextField();
		t4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				if(key==10)
				{
					t5.requestFocus();
				}
			}
		});
		t4.setBounds(157, 232, 114, 33);
		contentPane.add(t4);
		t4.setColumns(10);
		
		JLabel SID = new JLabel("SID");
		SID.setFont(new Font("Tahoma", Font.PLAIN, 17));
		SID.setForeground(Color.WHITE);
		SID.setBounds(10, 307, 46, 14);
		contentPane.add(SID);
		
		t5 = new JTextField();
		t5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				if(key==10)
				{
					t7.requestFocus();
				}
			}
		});
		t5.setBounds(157, 301, 114, 33);
		contentPane.add(t5);
		t5.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
					
					String query="insert into trainers(name,email,phone,age,sid,batch,salary,address)" + "values(?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1, t1.getText());
					ps.setString(2, t2.getText());
					ps.setString(3, t3.getText());
					ps.setString(4, t4.getText());
					ps.setString(5, t5.getText());
					ps.setString(6, t7.getText());
					
					ps.setString(7, t8.getText());
					ps.setString(8, t9.getText());
					
					ps.execute();
					JOptionPane.showMessageDialog(null, "successful");
					
					loginpage lg=new loginpage();
					lg.setVisible(true);
				
				}
				catch(Exception e1)
				{
					System.out.println(e1.getMessage());
				}
			}
		});
		btnSubmit.setBounds(10, 627, 136, 46);
		contentPane.add(btnSubmit);
		
		JLabel lblSalary = new JLabel("SALARY");
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSalary.setForeground(Color.WHITE);
		lblSalary.setBounds(10, 437, 64, 33);
		contentPane.add(lblSalary);
		
		t8 = new JTextField();
		t8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				if(key==10)
				{
					t9.requestFocus();
				}
			}
		});
		t8.setBounds(157, 440, 114, 33);
		contentPane.add(t8);
		t8.setColumns(10);
		
		JLabel lblBatch = new JLabel("BATCH");
		lblBatch.setForeground(Color.WHITE);
		lblBatch.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBatch.setBounds(10, 386, 64, 14);
		contentPane.add(lblBatch);
		
		t7 = new JTextField();
		t7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				if(key==10)
				{
					t8.requestFocus();
				}
			}
		});
		t7.setBounds(157, 367, 114, 33);
		contentPane.add(t7);
		t7.setColumns(10);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setBounds(10, 521, 114, 14);
		contentPane.add(lblAddress);
		
		t9 = new JTextField();
		t9.setBounds(158, 521, 347, 58);
		contentPane.add(t9);
		t9.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yogamat.jpg"));
		lblNewLabel_5.setBounds(0, 0, 1400, 800);
		contentPane.add(lblNewLabel_5);
	}
}
