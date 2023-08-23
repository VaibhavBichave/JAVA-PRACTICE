import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class New_Soldier_entry extends JInternalFrame {
	private JTextField txt_id;
	private JTextField txt_name;
	private JTextField txt_username;
	private JPasswordField passwordField;
	private JTextField txt_contact;

	Random rand = new Random();
	Connection con;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Soldier_entry frame = new New_Soldier_entry();
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
	public New_Soldier_entry() {
		con = DBConnect.getConnection();
		setTitle("New Soldier");
		setClosable(true);
		setBounds(100, 100, 807, 478);

		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
				Image img = new ImageIcon("D:\\Image\\Military_Network\\new_soldier.jpg").getImage();
				getContentPane().setLayout(null);
				g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			}
		};

		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(115, 31, 46, 26);
		panel.add(lblNewLabel);

		txt_id = new JTextField();
		txt_id.setEditable(false);
		txt_id.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt_id.setBounds(178, 31, 166, 29);
		panel.add(txt_id);
		txt_id.setColumns(10);

		txt_name = new JTextField();
		txt_name.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt_name.setColumns(10);
		txt_name.setBounds(178, 91, 166, 29);
		panel.add(txt_name);

		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.ORANGE);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(115, 91, 46, 26);
		panel.add(lblName);

		txt_username = new JTextField();
		txt_username.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt_username.setColumns(10);
		txt_username.setBounds(178, 151, 166, 29);
		panel.add(txt_username);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.ORANGE);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(86, 151, 75, 26);
		panel.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.ORANGE);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(86, 215, 75, 26);
		panel.add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 14));
		passwordField.setBounds(178, 216, 166, 29);
		panel.add(passwordField);

		JLabel lblContact = new JLabel("Contact");
		lblContact.setForeground(Color.ORANGE);
		lblContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContact.setBounds(86, 281, 75, 26);
		panel.add(lblContact);

		txt_contact = new JTextField();
		txt_contact.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt_contact.setColumns(10);
		txt_contact.setBounds(178, 281, 166, 29);
		panel.add(txt_contact);

		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					PreparedStatement pst = con.prepareStatement("insert into register values(?,?,?,?,?)");
					pst.setString(1, txt_id.getText().toString());
					pst.setString(2, txt_name.getText().toString());
					pst.setString(3, txt_username.getText().toString());
					pst.setString(4, passwordField.getText().toString());
					pst.setString(5, txt_contact.getText().toString());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Account Created Successfully");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(189, 351, 118, 29);
		panel.add(btnNewButton);

		txt_id.setText("" + rand.nextInt(5000));

	}
}
