import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Recevie_message extends JInternalFrame {
	private JTextField key;
	private JPanel panel;
	private JComboBox comboBox;

	Connection con;
	private JTextField txt_name;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recevie_message frame = new Recevie_message();
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
	public Recevie_message() {
		con = DBConnect.getConnection();
		setTitle("Retreive Message");
		setClosable(true);
		setBounds(100, 100, 530, 411);
		getContentPane().setLayout(new BorderLayout(0, 0));

		panel = new JPanel() {
			public void paintComponent(Graphics g) {
				Image img = new ImageIcon("D:\\Image\\Military_Network\\receive.jpg").getImage();
				getContentPane().setLayout(null);
				g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			}
		};
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel label = new JLabel("ID");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(88, 28, 73, 23);
		panel.add(label);

		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				try {
					PreparedStatement pst = con.prepareStatement("select name from register where id=?");
					pst.setString(1, comboBox.getSelectedItem().toString());
					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						txt_name.setText(rs.getString("Name"));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				// ==================message============================

				try {
					PreparedStatement pst = con.prepareStatement("select * from android_to_admin where id=?");
					pst.setString(1, comboBox.getSelectedItem().toString());
					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						key.setText(rs.getString("secret_key"));
						textArea.setText(rs.getString("Message"));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		comboBox.setBounds(194, 28, 108, 26);
		panel.add(comboBox);

		key = new JTextField();
		key.setColumns(10);
		key.setBounds(202, 137, 193, 39);
		panel.add(key);

		JLabel label_1 = new JLabel("KEY");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(88, 138, 104, 38);
		panel.add(label_1);

		JLabel label_2 = new JLabel("MESSAGE");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(65, 214, 127, 38);
		panel.add(label_2);

		textArea = new JTextArea();
		textArea.setBounds(202, 223, 198, 102);
		panel.add(textArea);

		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(88, 73, 104, 38);
		panel.add(lblName);

		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(202, 72, 193, 39);
		panel.add(txt_name);

		try {
			PreparedStatement pst = con.prepareStatement("SELECT  * from  register");
			ResultSet rs = pst.executeQuery();
			String arg[] = new String[50];
			int i = 0;
			while (rs.next()) {
				arg[i] = rs.getString("ID");
				comboBox.addItem(arg[i]);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}
}
