package miniproject;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

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

public class yogamembers extends JFrame {

	private JPanel contentPane;
	private JTextField nm;
	private JTextField ea;
	private JTextField ae;
	private JTextField md;
	private JTextField bh;
	private JTextField np;
	String ser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yogamembers frame = new yogamembers();
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
	public yogamembers() {
		setTitle(" CLIENT FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-5, -5, 1400,800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMembers = new JLabel("NEW CLIENT FORM");
		lblMembers.setHorizontalAlignment(SwingConstants.CENTER);
		lblMembers.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMembers.setBounds(157, 21, 379, 14);
		contentPane.add(lblMembers);
		
		JLabel lblFirstName = new JLabel("NAME :");
		lblFirstName.setForeground(Color.CYAN);
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFirstName.setBounds(10, 59, 79, 14);
		contentPane.add(lblFirstName);
		
		nm = new JTextField();
		nm.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				int key=arg0.getKeyCode();
				if(key==10)
				{
					ea.requestFocus();
				}
			}
		});
		nm.setBounds(190, 58, 216, 37);
		contentPane.add(nm);
		nm.setColumns(10);
		
		JLabel lblEmailAddress = new JLabel("EMAIL ADDRESS :");
		lblEmailAddress.setForeground(Color.CYAN);
		lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEmailAddress.setBounds(10, 122, 138, 37);
		contentPane.add(lblEmailAddress);
		
		ea = new JTextField();
		ea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key1=e.getKeyCode();
				if(key1==10)
				{
					np.requestFocus();
				}
			}
		});
		ea.setBounds(190, 122, 366, 37);
		contentPane.add(ea);
		ea.setColumns(10);
		
		np = new JTextField();
		np.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int key=e.getKeyCode();
				if(key==10)
				{
					ae.requestFocus();
				}
			}
		});
		np.setBounds(190, 186, 216, 37);
		contentPane.add(np);
		np.setColumns(10);
		
		
		JLabel lblServicesIntended = new JLabel("SERVICES  :");
		lblServicesIntended.setForeground(Color.CYAN);
		lblServicesIntended.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblServicesIntended.setBounds(10, 250, 131, 14);
		contentPane.add(lblServicesIntended);
		
		JLabel lblAge = new JLabel("AGE :");
		lblAge.setForeground(Color.CYAN);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAge.setBounds(10, 350, 46, 48);
		contentPane.add(lblAge);
		
		ae = new JTextField();
		ae.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				if(key==10)
				{
					md.requestFocus();
				}
			}
		});
		ae.setBounds(190, 359, 216, 37);
		contentPane.add(ae);
		ae.setColumns(10);
		
		JCheckBox c1 = new JCheckBox("THERAPHY YOGA");
		c1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		c1.setBackground(Color.WHITE);
		c1.setBounds(190, 250, 157, 23);
		contentPane.add(c1);
		
		JCheckBox c2 = new JCheckBox("GENERAL YOGA");
		c2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		c2.setBackground(Color.WHITE);
		c2.setBounds(190, 295, 155, 23);
		contentPane.add(c2);
		
		JCheckBox c3 = new JCheckBox("SELF DEFENCE");
		c3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		c3.setBackground(Color.WHITE);
		c3.setBounds(388, 246, 168, 23);
		contentPane.add(c3);
		
		JCheckBox c4 = new JCheckBox("REKHI");
		c4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		c4.setBackground(Color.WHITE);
		c4.setBounds(388, 295, 79, 23);
		contentPane.add(c4);
		
		
		

		
		JLabel lblMid = new JLabel("MID :");
		lblMid.setForeground(Color.CYAN);
		lblMid.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMid.setBounds(10, 434, 79, 31);
		contentPane.add(lblMid);
		
		md = new JTextField();
		md.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				if(key==10)
				{
					bh.requestFocus();
				}
			}
		});
		md.setBounds(190, 423, 216, 37);
		contentPane.add(md);
		md.setColumns(10);
		
		JLabel lblPhone = new JLabel("PHONE :");
		lblPhone.setForeground(Color.CYAN);
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPhone.setBounds(10, 170, 79, 61);
		contentPane.add(lblPhone);
		
		JLabel lblBatch = new JLabel("BATCH :");
		lblBatch.setForeground(Color.CYAN);
		lblBatch.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBatch.setBounds(3, 499, 86, 31);
		contentPane.add(lblBatch);
		
		bh = new JTextField();
		bh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bh.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				if(key==10)
				{
					c1.requestFocus();
				}
			}
		});
		bh.setBounds(190, 496, 216, 37);
		contentPane.add(bh);
		bh.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					System.out.println("hi");
				
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
					
					String query="insert into yogamembers(name,email,phone,services,age,mid,batch)" + "values(?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					
					ps.setString(1, nm.getText());
					ps.setString(2,ea.getText());
					ps.setString(3, np.getText());
					if(c1.isSelected())
					{
						ser= "THERAPHY YOGA";
					}
					else if(c2.isSelected())
					{
						ser="GENERAL YOGA";
					}
					else if(c3.isSelected())
					{
						ser="SELF DEFENCE";
						
					}
					else
					{
						ser="REKHI";
					}
					ps.setString(4, ser);
					ps.setString(5, ae.getText());
					ps.setString(6, md.getText());
					ps.setString(7,bh.getText());
					ps.execute();
					JOptionPane.showMessageDialog(null, "successful");
					loginpage lg1=new loginpage();
					lg1.setVisible(true);
					System.out.println("successful");
					nm.setText(null);
					ea.setText(null);
					
					
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		});
		
		btnSubmit.setBounds(10, 583, 260, 62);
		contentPane.add(btnSubmit);	
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yogamat.jpg"));
		lblNewLabel.setBounds(-5, 0, 1400, 800);
		contentPane.add(lblNewLabel);
		
	
	
	}
}
