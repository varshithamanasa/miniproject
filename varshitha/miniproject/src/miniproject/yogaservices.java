package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class yogaservices extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yogaservices frame = new yogaservices();
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
	public yogaservices() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(225, 201, 46, 14);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("BOOK YOUR SERVICES NOW !");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				services ss=new services();
				ss.setVisible(true);
			}
		});
		btnNewButton.setBounds(629, 355, 255, 68);
		contentPane.add(btnNewButton);
		
		JButton btnTheraphyYoga = new JButton("THERAPHY YOGA");
		btnTheraphyYoga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selfimage ss=new selfimage();
				ss.setVisible(true);
			
			}
		});
		btnTheraphyYoga.setBounds(88, 168, 202, 23);
		contentPane.add(btnTheraphyYoga);
		
		JButton btnGeneralYoga = new JButton("GENERAL YOGA");
		btnGeneralYoga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				general_image gg=new general_image();
				gg.setVisible(true);
			}
		});
		btnGeneralYoga.setBounds(88, 230, 202, 23);
		contentPane.add(btnGeneralYoga);
		
		JButton btnSelfDefence = new JButton("SELF DEFENCE");
		btnSelfDefence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				therapy_image ti=new therapy_image();
				ti.setVisible(true);
			}
		});
		btnSelfDefence.setBounds(88, 293, 202, 23);
		contentPane.add(btnSelfDefence);
		
		JButton btnRekhi = new JButton("REKHI");
		btnRekhi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				rekhi_image rm=new rekhi_image();
				rm.setVisible(true);
			}
		});
		btnRekhi.setBounds(88, 352, 202, 23);
		contentPane.add(btnRekhi);
		
		JLabel lblServices = new JLabel("SERVICES");
		lblServices.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblServices.setBounds(303, 44, 238, 68);
		contentPane.add(lblServices);
		
		JLabel LL = new JLabel("New label");
		LL.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yoga4.jpg"));
		LL.setBounds(-41, -18, 931, 479);
		contentPane.add(LL);
		
	
	}
}
