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
import javax.swing.JTextPane;
import java.awt.Font;

public class general_image extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					general_image frame = new general_image();
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
	public general_image() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yoga for thyroid.jpg"));
		lblNewLabel.setBounds(28, -17, 496, 327);
		contentPane.add(lblNewLabel);
		
		JButton btnBookNow = new JButton("book now !");
		btnBookNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				services ss=new services();
				ss.setVisible(true);
			}
		});
		btnBookNow.setBounds(212, 421, 151, 23);
		contentPane.add(btnBookNow);
		
		JTextPane txtpnInThisSituation = new JTextPane();
		txtpnInThisSituation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnInThisSituation.setText(" In this situation, yoga can bring peace to our body, mind, and soul and add more value to our life");
		txtpnInThisSituation.setBounds(28, 374, 511, 36);
		contentPane.add(txtpnInThisSituation);
		
		JLabel lblNewLabel_1 = new JLabel("AWAKEN TO YOUR DIVINE SELF JOIN  YTC");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(115, 332, 310, 23);
		contentPane.add(lblNewLabel_1);
	}
}
