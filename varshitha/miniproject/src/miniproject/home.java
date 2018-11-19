package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Window.Type;

public class home extends JFrame {

	private JPanel contentPane;
	private JTextField un;
	private JPasswordField pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

					//frame.setUndecorated(true);
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public home() {
		setType(Type.POPUP);
		setTitle("YOGA THERAPY CENTER DATABASE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 897, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("USERNAME");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblLogin.setBounds(132, 224, 187, 34);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPassword.setBounds(132, 296, 166, 19);
		contentPane.add(lblPassword);
		
		un = new JTextField();
		un.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
				if(key==10)
				{
					pw.requestFocus();
				}
			}
		});
		un.setBounds(329, 238, 208, 20);
		contentPane.add(un);
		un.setColumns(10);
		
		
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String username=un.getText();
				String password=pw.getText();
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
					java.sql.Statement stmt=con.createStatement();
					
					String query="select * from login where username=? and password=?";
					
					PreparedStatement ps=con.prepareStatement(query);
					
					ps.setString(1,username);
					ps.setString(2, password);
					
					ResultSet rs=ps.executeQuery();
					
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "successful");
						
						loginpage lg=new loginpage();
					//lg.setExtendedState(JFrame.MAXIMIZED_BOTH);
						lg.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "invalid");
					}
					
					
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		});
		btnLogin.setBounds(277, 365, 134, 50);
		contentPane.add(btnLogin);
		
		JLabel label = new JLabel("");
		label.setBounds(132, 33, 46, 14);
		contentPane.add(label);
		
		pw = new JPasswordField();

		pw.setBounds(329, 302, 210, 20);
		contentPane.add(pw);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_1.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yogamat.jpg"));
		label_1.setBounds(0, 0, 1400, 800);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(308, 126, 153, 87);
		contentPane.add(label_2);
	}
}
