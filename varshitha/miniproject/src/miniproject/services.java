package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.Color;

public class services extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private static JTextField t3;
	
	
	
	/**
	 * Launch the application.
	 */
	    
	   
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					services frame = new services();
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
	
	 private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) {
	        Properties props = System.getProperties();
	        String host = "smtp.gmail.com";
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.user", from);
	        props.put("mail.smtp.password", pass);
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.auth", "true");

	        Session session = Session.getDefaultInstance(props);
	        MimeMessage message = new MimeMessage(session);

	        try {
	            message.setFrom(new InternetAddress(from));
	            InternetAddress[] toAddress = new InternetAddress[to.length];

	            // To get the array of addresses
	            for( int i = 0; i < to.length; i++ ) {
	                toAddress[i] = new InternetAddress(to[i]);
	            }

	            for( int i = 0; i < toAddress.length; i++) {
	                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
	            }

	            message.setSubject(subject);
	            message.setText(body);
	            Transport transport = session.getTransport("smtp");
	            transport.connect(host, from, pass);
	            transport.sendMessage(message, message.getAllRecipients());
	            transport.close();
	            System.out.println("successful");
	        }
	        catch (AddressException ae) {
	            ae.printStackTrace();
	        }
	        catch (MessagingException me) {
	            me.printStackTrace();
	        }
	    }
	public services() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHi = new JLabel("hi");
		lblHi.setForeground(Color.WHITE);
		lblHi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHi.setBounds(53, 36, 46, 30);
		contentPane.add(lblHi);
		
		JLabel lblWelcomeToYtc = new JLabel("welcome to YTC");
		lblWelcomeToYtc.setForeground(Color.WHITE);
		lblWelcomeToYtc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWelcomeToYtc.setBounds(53, 61, 141, 44);
		contentPane.add(lblWelcomeToYtc);
		
		JLabel lblName = new JLabel("name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(22, 116, 46, 14);
		contentPane.add(lblName);
		
		t1 = new JTextField();
		t1.setBounds(128, 110, 86, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblPhoneNo = new JLabel("phone no.");
		lblPhoneNo.setBackground(Color.BLACK);
		lblPhoneNo.setForeground(Color.WHITE);
		lblPhoneNo.setBounds(22, 163, 77, 14);
		contentPane.add(lblPhoneNo);
		
		t2 = new JTextField();
		t2.setBounds(128, 160, 86, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(22, 207, 46, 14);
		contentPane.add(lblEmail);
		
		t3 = new JTextField();
		t3.setBounds(128, 204, 192, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		JLabel lblChooseYourTrials = new JLabel("choose your trials");
		lblChooseYourTrials.setBounds(395, 95, 141, 14);
		contentPane.add(lblChooseYourTrials);
		
		JCheckBox c1 = new JCheckBox("theraphy yoga");
		c1.setBounds(393, 116, 143, 23);
		contentPane.add(c1);
		
		JCheckBox c2 = new JCheckBox("general yoga");
		c2.setBounds(395, 142, 141, 23);
		contentPane.add(c2);
		
		JCheckBox c3 = new JCheckBox("self defence");
		c3.setBounds(395, 168, 141, 23);
		contentPane.add(c3);
		
		JCheckBox c4 = new JCheckBox("rekhi");
		c4.setBounds(393, 194, 132, 23);
		contentPane.add(c4);
		
		
		JButton btnSubmit = new JButton("book my first  trial class for free");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String ser;
					 String recipients=t3.getText();
					 String body;
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","");
					
					String query="insert into services(name,phone,email,service)" + "values(?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					
					ps.setString(1, t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3, recipients);
					if(c1.isSelected())
					{
						ser= "THERAPHY YOGA";
						  body = "your trail class  for theraphy yoga is scheduled on 10th november at 7 am ";
					}
					else if(c2.isSelected())
					{
						ser="GENERAL YOGA";
						  body = "your trail class for general yoga is scheduled on 10th november at 7 am";
					}
					else if(c3.isSelected())
					{
						ser="SELF DEFENCE";
					 body = "your trail class for self defence scheduled on 10th november at 7 pm";
						
					}
					else
					{
						ser="REKHI";
						  body = "your trail class for rekhi scheduled on 10th november at 7 pm";
					}
					ps.setString(4, ser);
					
					ps.execute();
					
					
					JOptionPane.showMessageDialog(null, "successful");
					
					String from = "varshitham.16cs@saividya.ac.in";
			        String pass = "Varshitha123";
			        String[] to = { t3.getText() }; // list of recipient email addresses
			        String subject = " welcome to ytc";
			        
			       

			        sendFromGMail(from, pass, to, subject, body);
					
					
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
				
				
				
			}
		});
		btnSubmit.setBounds(128, 307, 263, 23);
		contentPane.add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\yogamat.jpg"));
		lblNewLabel.setBounds(0, 0, 1400, 800);
		contentPane.add(lblNewLabel);

		
		
	}
}
