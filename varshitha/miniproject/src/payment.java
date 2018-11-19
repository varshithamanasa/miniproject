import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JTextArea;

import miniproject.loginpage;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;


public class payment extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t6;
	private JTextPane tt;
	int diet,consult,therapy,gene,rekhi,self;
	private JTextArea ta;
	private JTextField n;
	private JTextField i;
	private JTextField da;
	private JTextField ti;
	/*int diet=250;
	int consult=250;
	int therapy=1500;
	int gene=2500;
	int rekhi=1250;
	int self=2000;*/
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment frame = new payment();
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
	public payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 921, 636);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, null));
		panel.setBounds(60, 11, 745, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPayment = new JLabel("ONLINE BILLING SYSTEM");
		lblPayment.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblPayment.setBounds(95, 11, 492, 38);
		panel.add(lblPayment);
		
		
		JCheckBox c1 = new JCheckBox("DIET CHART");
		c1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c1.setBounds(44, 117, 143, 23);
		contentPane.add(c1);
		
		JCheckBox c2 = new JCheckBox("CONSULTATION");
		c2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c2.setBounds(44, 154, 143, 23);
		contentPane.add(c2);
		
		JCheckBox c3 = new JCheckBox("SELF DEFENCE");
		c3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c3.setBounds(44, 193, 143, 23);
		contentPane.add(c3);
		
		JCheckBox c4 = new JCheckBox("THERAPY YOGA");
		c4.setBounds(44, 228, 143, 23);
		contentPane.add(c4);
		c4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JCheckBox c5 = new JCheckBox("GENERAL YOGA");
		c5.setBounds(44, 262, 143, 23);
		contentPane.add(c5);
		c5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JCheckBox c6 = new JCheckBox("REKHI");
		c6.setBounds(44, 302, 97, 23);
		contentPane.add(c6);
		c6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				t5.setText(null);
				t6.setText(null);
				t7.setText(null);
				t8.setText(null);
				t9.setText(null);
				
				
				c1.setSelected(false);
				c2.setSelected(false);
				c3.setSelected(false);
				c4.setSelected(false);
				c5.setSelected(false);
				c6.setSelected(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setToolTipText("RESET");
		btnNewButton.setBounds(20, 404, 275, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("TOTAL COST");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				ti.setText(tTime.format(timer.getTime()));
				SimpleDateFormat tDate=new SimpleDateFormat("dd-MMM-yyyy");
				da.setText(tDate.format(timer.getTime()));
				
			if(c1.isSelected())
			{
					 t1.setText(Integer.toString(diet=250));
					//t7.setText(Integer.toString(diet));
					t8.setText(Integer.toString(5));
					//t9.setText(Integer.toString(diet+5));
				
			}
			if(c2.isSelected())
			{
				t2.setText(Integer.toString(consult=300));
				//t7.setText(Integer.toString(consult));
				t8.setText(Integer.toString(5));
				//t9.setText(Integer.toString(consult+5));
			}
			 if(c3.isSelected())
			{
				t3.setText(Integer.toString(therapy=2020));
				//t7.setText(Integer.toString(therapy));
				t8.setText(Integer.toString(5));
				//t9.setText(Integer.toString(therapy+5));
			}
			 if(c4.isSelected())
			{
				t4.setText(Integer.toString(gene=1500));
				//t7.setText(Integer.toString(gene));
				t8.setText(Integer.toString(5));
				//t9.setText(Integer.toString(gene+5)+5);
			}
			 if(c5.isSelected())
			{

				t5.setText(Integer.toString(rekhi=1570));
				//t7.setText(Integer.toString(rekhi));
				t8.setText(Integer.toString(5));
				//t9.setText(Integer.toString(rekhi)+5);
				
			}
			if(c6.isSelected())
			{

				t6.setText(Integer.toString(self=1550));	
				
				t8.setText(Integer.toString(5));
				
			}
			
			t9.setText(Integer.toString(self+consult+rekhi+5+gene+therapy+diet));	
			t7.setText(Integer.toString(self+consult+rekhi+gene+therapy+diet));
			
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setToolTipText("TOTAL COST");
		btnNewButton_1.setBounds(20, 459, 275, 32);
		contentPane.add(btnNewButton_1);
		
		t1 = new JTextField();
		t1.setBounds(193, 120, 86, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(193, 157, 86, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(193, 196, 86, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(370, 459, 67, 32);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(338, 178, 260, 201);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL");
		lblNewLabel_2.setBounds(10, 148, 67, 14);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		t9 = new JTextField();
		t9.setBounds(146, 147, 86, 20);
		panel_2.add(t9);
		t9.setColumns(10);
		
		t8 = new JTextField();
		t8.setBounds(146, 94, 86, 20);
		panel_2.add(t8);
		t8.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("SUB TOTAL");
		lblNewLabel.setBounds(10, 36, 129, 23);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		t7 = new JTextField();
		t7.setBounds(146, 39, 86, 20);
		panel_2.add(t7);
		t7.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("TAX");
		lblNewLabel_1.setBounds(10, 86, 46, 32);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		n = new JTextField();
		n.setBounds(429, 467, 86, 20);
		contentPane.add(n);
		n.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("ID");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(381, 413, 53, 14);
		contentPane.add(lblNewLabel_4);
		
		i = new JTextField();
		i.setBounds(429, 412, 86, 20);
		contentPane.add(i);
		i.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("SAVE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
				
				String query="insert into payment(name,id,cost)" + "values(?,?,?)";
				PreparedStatement ps=con.prepareStatement(query);
				
				ps.setString(1, t9.getText());
				ps.setString(2,t9.getText());
				ps.setString(3, t9.getText());
				
				ps.execute();
				JOptionPane.showMessageDialog(null, "successful");
				loginpage lg1=new loginpage();
				lg1.setVisible(true);
				System.out.println("successful");
				//nm.setText(null);
				//ea.setText(null);
				
				
			}
			catch(Exception ee)
			{
				System.out.println(ee.getMessage());
			}
			}
		});
		btnNewButton_2.setBounds(20, 506, 274, 40);
		contentPane.add(btnNewButton_2);
		
		da = new JTextField();
		da.setBounds(484, 129, 86, 20);
		contentPane.add(da);
		da.setColumns(10);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate.setBounds(370, 130, 46, 14);
		contentPane.add(lblDate);
		
		ti = new JTextField();
		ti.setBounds(484, 99, 86, 20);
		contentPane.add(ti);
		ti.setColumns(10);
		
		JLabel lblTime = new JLabel("TIME");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTime.setBounds(370, 98, 46, 21);
		contentPane.add(lblTime);
		

		
		
	
		
		
		
		
		t4 = new JTextField();
		t4.setBounds(193, 231, 86, 20);
		contentPane.add(t4);
		t4.setColumns(10);
		

	
		
		
		t5 = new JTextField();
		t5.setBounds(193, 265, 86, 20);
		contentPane.add(t5);
		t5.setColumns(10);
		
	
		
		
		
		t6 = new JTextField();
		t6.setBounds(193, 305, 86, 20);
		contentPane.add(t6);
		t6.setColumns(10);
		
		JTextArea at = new JTextArea();
		at.setBounds(612, 127, 275, 419);
		contentPane.add(at);
		int refs=1325+(int)(Math.random()*4238);
		JButton btnReceipt = new JButton("RECEIPT");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				at.setText("\tONLINE BILLING SYSTEM\n\n******************************************************************\n"
						+ "\tconsultation:        "+consult+"\n"
						+ "\tdiet chart:              "+diet+"\n"
						+ "\ttherapy yoga:        "+therapy+"\n"
						+ "\tgeneral yoga:        "+gene+"\n"
						+"\trekhi :                     "+rekhi+"\n"
						+"\tself defence:         "+self+"\n"
						+"\ttax         :                 "+5+"\n"
						+"***********************************************************************************\n"
						+"\t total :                    "+t9.getText()+"\n" 
						+"***********************************************************************************\n"
						+"  name :              "+n.getText()+"\n"
						+"  id   :                 "+i.getText()+"\n"
						+"  date :              "+da.getText()+"\n"
						+"  time :              "+ti.getText()+"\n"
						+"  receipt number:     "+refs+"\n\n"
						+"*****************************************************************************************\n"
						+"************************  THANK YOU  ********************************************"
						);
				
				
				
				
				
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReceipt.setBounds(763, 82, 124, 23);
		contentPane.add(btnReceipt);
	
		
	
		
	
	}
}
