package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class rekhi_image extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rekhi_image frame = new rekhi_image();
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
	public rekhi_image() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\Screenshots\\Screenshot (12).png"));
		lblNewLabel.setBounds(10, 11, 577, 324);
		contentPane.add(lblNewLabel);
		
		JButton btnBookNow = new JButton("BOOK NOW");
		btnBookNow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBookNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				services ss=new services();
				ss.setVisible(true);
				
			}
		});
		btnBookNow.setBounds(271, 431, 177, 40);
		contentPane.add(btnBookNow);
		
		JTextPane txtpnReikiMeditationCan = new JTextPane();
		txtpnReikiMeditationCan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnReikiMeditationCan.setText("Reiki meditation can transform, reveal and also contribute to finding out your real self. It involves symbols and mantras to ease up your meditation experience. Your mental, physical, even spiritual healing can be done by Reiki meditation.");
		txtpnReikiMeditationCan.setBounds(10, 346, 730, 74);
		contentPane.add(txtpnReikiMeditationCan);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnBookNow, lblNewLabel, txtpnReikiMeditationCan}));
	}
}
