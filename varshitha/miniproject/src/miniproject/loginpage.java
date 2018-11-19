package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.SystemColor;

public class loginpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage frame = new loginpage();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				//	frame.setUndecorated(true);
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
	public loginpage() {
		setTitle("WELCOME TO YTC");
		setBackground(Color.WHITE);
		
		//this.setUndecorated(true);//removes the title bar
		//this.setAlwaysOnTop(true);
		//this.setResizable(false);
		//this.setVisible(true);
		
		//Toolkit tk=Toolkit.getDefaultToolkit();
		//int xsize =(int) tk.getScreenSize().getWidth();
		//int ysixe= (int) tk.getScreenSize().getHeight();
		//this.setSize(692, 454);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToYtc = new JLabel("WELCOME   T0  YTC ");
		lblWelcomeToYtc.setForeground(Color.BLACK);
		lblWelcomeToYtc.setToolTipText("WELCOME TO YTC");
		lblWelcomeToYtc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWelcomeToYtc.setFont(new Font("Times New Roman", Font.BOLD, 88));
		lblWelcomeToYtc.setBounds(268, -14, 1000, 200);
		contentPane.add(lblWelcomeToYtc);
		
		JButton btnStaff = new JButton("INSERT STAFF");
		btnStaff.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				yogastaff ys=new yogastaff();
				ys.setVisible(true);
			}
		});
		btnStaff.setBounds(10, 85, 248, 50);
		contentPane.add(btnStaff);
		
		JButton btnFeedBack = new JButton("FEED BACK");
		btnFeedBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnFeedBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				feedback fb=new feedback();
				fb.setVisible(true);
			}
		});
		btnFeedBack.setBounds(10, 529, 248, 50);
		contentPane.add(btnFeedBack);
		
		JButton btnServices = new JButton("SERVICES");
		btnServices.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnServices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				services ys=new services();
				ys.setVisible(true);
			}
		});
		btnServices.setBounds(10, 455, 248, 50);
		contentPane.add(btnServices);
		
		JButton btnDeleteStaff = new JButton("DELETE STAFF");
		btnDeleteStaff.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				displaystaff ds=new displaystaff();
				ds.setVisible(true);
			}
		});
		btnDeleteStaff.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDeleteStaff.setBounds(10, 159, 248, 50);
		contentPane.add(btnDeleteStaff);
		
		JButton btnDeleteClient = new JButton("DELETE CLIENT");
		btnDeleteClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Display d=new Display();
				d.setVisible(true);
			}
		});
		btnDeleteClient.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDeleteClient.setBounds(7, 233, 248, 50);
		contentPane.add(btnDeleteClient);
		

	
		
		JButton btnInsertNewClient = new JButton("INSERT NEW CLIENT");
		btnInsertNewClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				yogamembers yg=new yogamembers();
				yg.setVisible(true);
			}
		});
		btnInsertNewClient.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInsertNewClient.setBounds(10, 11, 248, 50);
		contentPane.add(btnInsertNewClient);
		
		JButton btnDisplayDetails = new JButton("DISPLAY CLIENTS");
		btnDisplayDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Display di=new Display();
				di.setVisible(true);
		
				
				
			}
		});
		btnDisplayDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDisplayDetails.setBounds(10, 381, 248, 50);
		contentPane.add(btnDisplayDetails);
		
		JButton btnNewButton = new JButton("DISPLAY STAFF");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displaystaff df=new displaystaff();
				df.setVisible(true);
			}
		});
		
		JButton btnPayment = new JButton("PAYMENT");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				payment p=new payment();
				p.setVisible(true);
				
			}
		});
		btnPayment.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPayment.setBounds(10, 603, 248, 50);
		contentPane.add(btnPayment);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(10, 307, 248, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXEC TIME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			triggers tg=new triggers();
			tg.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(10, 675, 248, 50);
		contentPane.add(btnNewButton_1);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yogamat.jpg"));
		lblNewLabel.setBounds(0, 0, 1400, 800);
		contentPane.add(lblNewLabel);
		

		
	}
}
