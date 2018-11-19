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

public class selfimage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selfimage frame = new selfimage();
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
	public selfimage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yoga_diabetes.jpg"));
		lblNewLabel.setBounds(10, 24, 406, 325);
		contentPane.add(lblNewLabel);
		
		JButton btnBookNow = new JButton("BOOK NOW");
		btnBookNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				services ss=new services();
				ss.setVisible(true);
			}
		});
		btnBookNow.setBounds(214, 391, 139, 23);
		contentPane.add(btnBookNow);
		
		JLabel lblNewLabel_1 = new JLabel("YOGA FOR DIABETES");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(463, 71, 149, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PCOD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(463, 112, 139, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ACIDITY");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(463, 154, 98, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblFrozenShoulder = new JLabel("FROZEN SHOULDER");
		lblFrozenShoulder.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFrozenShoulder.setBounds(463, 199, 139, 14);
		contentPane.add(lblFrozenShoulder);
		
		JLabel lblManyOthers = new JLabel("MANY OTHERS.......");
		lblManyOthers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblManyOthers.setBounds(463, 242, 139, 14);
		contentPane.add(lblManyOthers);
	}
}
