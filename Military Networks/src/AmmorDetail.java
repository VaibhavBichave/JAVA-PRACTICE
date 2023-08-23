/*import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Font;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;*/
//import sun.security.util.Length;

import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.lang.*;

public class AmmorDetail extends JInternalFrame {
	JPanel panel;
	private JTable table;
	private JComboBox cb_name;
	private JComboBox cb_catg;
	private JComboBox cb_item;
	private JButton btn;
	PreparedStatement pst;
	Connection con;
	String ID;
	String data = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AmmorDetail frame = new AmmorDetail();
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
	public AmmorDetail() {

		con = DBConnect.getConnection();
		setTitle("Armor Detail");
		setClosable(true);
		setBounds(100, 100, 812, 484);

		panel = new JPanel() {
			public void paintComponent(Graphics g) {
				Image img = new ImageIcon("D:\\Image\\Military_Network\\itema.jpg").getImage();
				getContentPane().setLayout(null);
				g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			}
		};
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(44, 68, 60, 23);
		panel.add(lblName);

		cb_name = new JComboBox();
		cb_name.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				try {
					PreparedStatement pst = con.prepareStatement("select * from register where Name=?");
					pst.setString(1, cb_name.getSelectedItem().toString());
					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						ID = rs.getString("ID");
					}

				} catch (Exception e) {
					// TODO: handle exception
				}

				try {
					PreparedStatement pst = con.prepareStatement("select * from ammor where ID=?");
					pst.setString(1, ID);
					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						data = rs.getString("ammor");
					}

				} catch (Exception e) {
					// TODO: handle exception
				}

				update();
			}
		});
		cb_name.setBounds(152, 68, 204, 26);
		panel.add(cb_name);

		JLabel lblCatogories = new JLabel("Catogories");
		lblCatogories.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCatogories.setBounds(44, 132, 98, 23);
		panel.add(lblCatogories);

		cb_catg = new JComboBox();
		cb_catg.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				try {
					PreparedStatement pst = con.prepareStatement("select * from equipment where Item_type=?");
					pst.setString(1, cb_catg.getSelectedItem().toString());
					ResultSet rs = pst.executeQuery();
					cb_item.removeAll();

					while (rs.next()) {
						cb_item.addItem(rs.getString("Item_name"));
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		cb_catg.setBounds(152, 129, 204, 26);
		panel.add(cb_catg);

		JLabel lblItem = new JLabel("Item");
		lblItem.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblItem.setBounds(44, 193, 98, 23);
		panel.add(lblItem);

		cb_item = new JComboBox();
		cb_item.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {

			}
		});
		cb_item.setBounds(152, 190, 204, 26);
		panel.add(cb_item);

		btn = new JButton("ADD");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String temp = data + "," + cb_catg.getSelectedItem().toString() + ":"
							+ cb_item.getSelectedItem().toString();

					PreparedStatement pst = con.prepareStatement("UPDATE ammor SET ammor=? WHERE ID=?");
					pst.setString(1, temp);
					pst.setString(2, ID);

					// pst.setString(3, temp);
					pst.execute();

					JOptionPane.showMessageDialog(null, "Data Saved");
					update();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btn.setBounds(165, 259, 98, 38);
		panel.add(btn);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(406, 68, 319, 229);
		panel.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Catogories", "Item"
				}));
		scrollPane.setViewportView(table);

		try {
			PreparedStatement pst = con.prepareStatement("select * from register");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				cb_name.addItem(rs.getString("name"));
			}

			PreparedStatement pst1 = con.prepareStatement("select * from equipment");
			ResultSet rs1 = pst1.executeQuery();
			while (rs1.next()) {
				cb_catg.addItem(rs1.getString("Item_type"));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
		}
	}

	void update() {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		dtm.getDataVector().removeAllElements();
		revalidate();

		try {
			PreparedStatement pst = con.prepareStatement("select * from ammor where ID=?");
			pst.setString(1, ID);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String animals = rs.getString("ammor");
				String[] animalsArray = animals.split(",");
				for (int i = 0; i < animalsArray.length; i++) {
					System.out.println(i + " Values" + animalsArray[i]);
					String[] temp = animalsArray[i].split(":");
					dtm.addRow(temp);
					/*
					 * System.out.println("Sub 1"+temp[0]);
					 * System.out.println("Sub 2"+temp[1]);
					 */
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
