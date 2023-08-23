import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Item_Entry extends JInternalFrame {
	private JPanel center_panel;
	private JTextField txt_qty;
	private JTextField txt_item_name;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item_Entry frame = new Item_Entry();
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
	public Item_Entry() {
		setClosable(true);
		setTitle("Item Entry");
		setBounds(100, 100, 621, 381);

		center_panel = new JPanel() {
			public void paintComponent(Graphics g) {
				Image img = new ImageIcon("D:\\Image\\Military_Network\\item.jpg").getImage();
				getContentPane().setLayout(null);
				g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			}
		};
		getContentPane().add(center_panel, BorderLayout.CENTER);
		center_panel.setLayout(null);

		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 255, 224));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(77, 57, 86, 22);
		center_panel.add(lblName);

		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setForeground(new Color(255, 255, 224));
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantity.setBounds(77, 182, 86, 22);
		center_panel.add(lblQuantity);

		comboBox = new JComboBox();
		comboBox.setForeground(new Color(128, 0, 0));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Guns", "Jackets", "Shoes", "Caps" }));
		comboBox.setBounds(190, 123, 166, 22);
		center_panel.add(comboBox);

		JLabel lblCatogories = new JLabel("Catogories");
		lblCatogories.setForeground(new Color(255, 255, 224));
		lblCatogories.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCatogories.setBounds(77, 121, 86, 22);
		center_panel.add(lblCatogories);

		txt_qty = new JTextField();
		txt_qty.setForeground(new Color(128, 0, 0));
		txt_qty.setFont(new Font("Tahoma", Font.BOLD, 15));
		txt_qty.setBounds(192, 185, 164, 22);
		center_panel.add(txt_qty);
		txt_qty.setColumns(10);

		txt_item_name = new JTextField();
		txt_item_name.setForeground(new Color(128, 0, 0));
		txt_item_name.setFont(new Font("Tahoma", Font.BOLD, 15));
		txt_item_name.setColumns(10);
		txt_item_name.setBounds(192, 60, 164, 22);
		center_panel.add(txt_item_name);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = DBConnect.getConnection();
					PreparedStatement pst = con.prepareStatement("insert into equipment values(?,?,?)");
					pst.setString(1, txt_item_name.getText().toString());
					pst.setString(2, comboBox.getSelectedItem().toString());
					pst.setInt(3, Integer.parseInt(txt_qty.getText().toString()));
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Saved Successfully");
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Already Exit Equiment");
				}
			}
		});
		btnSave.setBounds(229, 256, 89, 23);
		center_panel.add(btnSave);

	}
}
