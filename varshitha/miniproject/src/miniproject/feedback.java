package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.JSplitPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import java.awt.Color;

public class feedback extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField nm;
	private JTextField cm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					feedback frame = new feedback();
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
	public feedback() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFeedBack = new JLabel("FEED BACK FORM");
		lblFeedBack.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFeedBack.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFeedBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFeedBack.setBounds(271, 11, 144, 22);
		contentPane.add(lblFeedBack);
		
		JLabel lblTypeOfService = new JLabel("Type of service received");
		lblTypeOfService.setForeground(Color.WHITE);
		lblTypeOfService.setBackground(Color.BLACK);
		lblTypeOfService.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTypeOfService.setBounds(10, 66, 148, 17);
		contentPane.add(lblTypeOfService);
		
		JCheckBox t1 = new JCheckBox("THERAPHY YOGA");
		t1.setBounds(237, 65, 128, 23);
		contentPane.add(t1);
		
		JCheckBox t2 = new JCheckBox("GENERAL YOGA");
		t2.setBounds(367, 65, 128, 23);
		contentPane.add(t2);
		
		JCheckBox t3 = new JCheckBox("SELF DEFENCE");
		t3.setBounds(537, 65, 121, 23);
		contentPane.add(t3);
		
		JLabel lblQualityOfServices = new JLabel("Quality of services received");
		lblQualityOfServices.setForeground(Color.WHITE);
		lblQualityOfServices.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQualityOfServices.setBounds(10, 129, 165, 17);
		contentPane.add(lblQualityOfServices);
		
		JCheckBox t4 = new JCheckBox("REKHI");
		t4.setBounds(686, 65, 79, 23);
		contentPane.add(t4);
		
		JRadioButton p = new JRadioButton("POOR");
		p.setBounds(237, 128, 68, 23);
		contentPane.add(p);
		
		JRadioButton a = new JRadioButton("AVERAGE");
		a.setBounds(378, 128, 93, 23);
		contentPane.add(a);
		
		JRadioButton g = new JRadioButton("GOOD");
		g.setBounds(503, 128, 68, 23);
		contentPane.add(g);
		
		JRadioButton e = new JRadioButton("EXCELLENT");
		e.setBounds(623, 128, 100, 23);
		contentPane.add(e);
		
		ButtonGroup bg =new ButtonGroup();
		bg.add(p);
		bg.add(a);
		bg.add(g);
		bg.add(e);
		
		JLabel lblFriendlinessOfStaff = new JLabel("Friendliness of staff");
		lblFriendlinessOfStaff.setForeground(Color.WHITE);
		lblFriendlinessOfStaff.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFriendlinessOfStaff.setBounds(10, 177, 114, 17);
		contentPane.add(lblFriendlinessOfStaff);
		
		JRadioButton p1 = new JRadioButton("POOR");
		p1.setBounds(237, 176, 79, 23);
		contentPane.add(p1);
		
		JRadioButton a1 = new JRadioButton("AVERAGE");
		a1.setBounds(378, 176, 79, 23);
		contentPane.add(a1);
		
		JRadioButton g1 = new JRadioButton("GOOD");
		g1.setBounds(503, 176, 68, 23);
		contentPane.add(g1);
		
		JRadioButton e1 = new JRadioButton("EXCELLENT");
		e1.setBounds(630, 176, 93, 23);
		contentPane.add(e1);
		
		ButtonGroup bg1 =new ButtonGroup();
		bg1.add(p1);
		bg1.add(a1);
		bg1.add(g1);
		bg1.add(e1);
		
		JLabel lblCleanlinessAndHygiene = new JLabel("CLEANLINESS AND HYGIENE");
		lblCleanlinessAndHygiene.setForeground(Color.WHITE);
		lblCleanlinessAndHygiene.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCleanlinessAndHygiene.setBounds(10, 226, 175, 17);
		contentPane.add(lblCleanlinessAndHygiene);
		
		JRadioButton p2 = new JRadioButton("POOR");
		p2.setBackground(Color.WHITE);
		p2.setBounds(246, 225, 68, 23);
		contentPane.add(p2);
		
		JRadioButton a2 = new JRadioButton("AVERAGE");
		a2.setBackground(Color.WHITE);
		a2.setBounds(378, 220, 93, 23);
		contentPane.add(a2);
		
		JRadioButton g2 = new JRadioButton("GOOD");
		g2.setBackground(Color.WHITE);
		g2.setBounds(503, 220, 68, 23);
		contentPane.add(g2);
		
		JRadioButton e2 = new JRadioButton("EXCELLENT");
		e2.setBackground(Color.WHITE);
		e2.setBounds(634, 220, 100, 23);
		contentPane.add(e2);
		
		ButtonGroup bg3 =new ButtonGroup();
		bg3.add(p2);
		bg3.add(a2);
		bg3.add(g2);
		bg3.add(e2);
		JLabel lblYtcIdNo = new JLabel("YTC ID no:");
		lblYtcIdNo.setForeground(Color.WHITE);
		lblYtcIdNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYtcIdNo.setBounds(138, 291, 68, 17);
		contentPane.add(lblYtcIdNo);
		
		id = new JTextField();
		id.setBounds(253, 288, 305, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		JLabel lblName = new JLabel("NAME : ");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(170, 346, 48, 17);
		contentPane.add(lblName);
		
		nm = new JTextField();
		nm.setBounds(255, 346, 303, 20);
		contentPane.add(nm);
		nm.setColumns(10);
		
		JLabel lblAnyOtherComments = new JLabel("ANY OTHER COMMENTS : ");
		lblAnyOtherComments.setForeground(Color.WHITE);
		lblAnyOtherComments.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnyOtherComments.setBounds(61, 395, 162, 17);
		contentPane.add(lblAnyOtherComments);
		
		cm = new JTextField();
		cm.setBounds(257, 399, 401, 66);
		contentPane.add(cm);
		cm.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
				
				String query="insert into feedback(type_of_service,quality_of_service,friendliness_of_staff,hygine,ytc_id,name,comments)" + "values(?,?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(query);
				String ser;
				String rat,rat1,rat2;
				
				if(t1.isSelected())
				{
					ser= "THERAPHY YOGA";
				}
				else if(t2.isSelected())
				{
					ser="GENERAL YOGA";
				}
				else if(t3.isSelected())
				{
					ser="SELF DEFENCE";
					
				}
				else
				{
					ser="REKHI";
				}
				ps.setString(1, ser);
				if(p.isSelected())
				{
					rat="poor";
				}
				else if(a.isSelected())
				{
					rat="average";
				}
				else if(g.isSelected())
				{
					rat="good";
					
				}
				else
				{
					rat="excellent";
				}
				ps.setString(2,rat);
				
				if(p1.isSelected())
				{
					rat1="poor";
				}
				else if(a1.isSelected())
				{
					rat1="average";
				}
				else if(g1.isSelected())
				{
					rat1="good";
					
				}
				else
				{
					rat1="excellent";
				}
				ps.setString(3,rat1);
				
				
				if(p2.isSelected())
				{
					rat2="poor";
				}
				else if(a2.isSelected())
				{
					rat2="average";
				}
				else if(g2.isSelected())
				{
					rat2="good";
					
				}
				else
				{
					rat2="excellent";
				}
				ps.setString(4,rat2);
				ps.setString(5, id.getText());
				ps.setString(6,nm.getText());
				ps.setString(7,cm.getText());
				ps.execute();
				JOptionPane.showMessageDialog(null, "successful");
				loginpage lg1=new loginpage();
				lg1.setVisible(true);
				System.out.println("successful");
				nm.setText(null);
				
				
				
			}
			catch(Exception e1)
			{
				System.out.println(e1.getMessage());
			}
				
				
			}
		});
		btnSubmit.setBounds(48, 591, 123, 46);
		contentPane.add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yogamat.jpg"));
		lblNewLabel.setBounds(0, 0, 1400, 800);
		contentPane.add(lblNewLabel);
	}
}
