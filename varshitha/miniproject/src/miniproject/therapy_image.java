package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class therapy_image extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					therapy_image frame = new therapy_image();
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
	public therapy_image() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\self_defence.jpg"));
		lblNewLabel.setBounds(57, 11, 513, 301);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(155, 358, 46, 14);
		contentPane.add(label);
		
		JLabel lblSelfDefence = new JLabel("LIVE LIKE A WARRIOR");
		lblSelfDefence.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelfDefence.setBounds(224, 323, 224, 40);
		contentPane.add(lblSelfDefence);
		
		JButton btnNewButton = new JButton("BOOK NOW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				services ss=new services();
				ss.setVisible(true);
			}
		});
		btnNewButton.setBounds(455, 363, 157, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Click on book now and get inspired to unleash your greatness.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(57, 367, 438, 32);
		contentPane.add(lblNewLabel_1);
	}

}
