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
import java.sql.ResultSet;

import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JSpinner;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class stock_entry extends JInternalFrame {
	private JPanel center_panel;
	private JTextField txt_qty;
	private JComboBox comboBox;
	private JTextField txt_total;
	private JComboBox item_name;
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stock_entry frame = new stock_entry();
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
	public stock_entry() {
		setClosable(true);
		setTitle("Item Entry");
		setBounds(100, 100, 621, 381);
		
		center_panel = new JPanel()
		{
		    public void paintComponent(Graphics g)
		    {
		        Image img = new ImageIcon("D:\\Image\\Military_Network\\stock.jpg").getImage();
		        getContentPane().setLayout(null);
		        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		    }
		};
		getContentPane().add(center_panel, BorderLayout.CENTER);
		center_panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 255, 224));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(77, 116, 86, 22);
		center_panel.add(lblName);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setForeground(new Color(255, 255, 224));
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantity.setBounds(77, 182, 86, 22);
		center_panel.add(lblQuantity);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) 
			{
				try 
				{
					Connection con=DBConnect.getConnection();
					PreparedStatement pst=con.prepareStatement("select * from equipment where Item_type=?");
					pst.setString(1, comboBox.getSelectedItem().toString());
					ResultSet rs=pst.executeQuery();
					//System.out.print(pst);
					item_name.removeAllItems();
					while(rs.next())
					{
						item_name.addItem(rs.getString("Item_name"));
					}
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			
			}
		});
		comboBox.setForeground(new Color(128, 0, 0));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Guns", "Jackets", "Shoes", "Caps"}));
		comboBox.setBounds(190, 51, 166, 22);
		center_panel.add(comboBox);
		
		JLabel lblCatogories = new JLabel("Catogories");
		lblCatogories.setForeground(new Color(255, 255, 224));
		lblCatogories.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCatogories.setBounds(77, 49, 86, 22);
		center_panel.add(lblCatogories);
		
		txt_qty = new JTextField();
		txt_qty.setForeground(new Color(128, 0, 0));
		txt_qty.setFont(new Font("Tahoma", Font.BOLD, 15));
		txt_qty.setBounds(192, 185, 164, 22);
		center_panel.add(txt_qty);
		txt_qty.setColumns(10);
		
		JButton btnSave = new JButton("Update");
		btnSave.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try 
				{
					Connection con=DBConnect.getConnection();
					PreparedStatement pst=con.prepareStatement("UPDATE equipment SET qty = ? WHERE Item_type=? and Item_name=?");
					pst.setInt(1, Integer.parseInt(txt_total.getText().toString()));
						pst.setString(2,comboBox.getSelectedItem().toString());
						pst.setString(3, item_name.getSelectedItem().toString());
						
					pst.execute();
					JOptionPane.showMessageDialog(null,"Record Updated Sucessfully");
					//JOptionPane.showMessageDialog(null, "Data Saved Successfully");
				}
				catch (Exception e) 
				{
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Already Exit Equiment");
				}
			}
		});
		btnSave.setBounds(229, 256, 89, 23);
		center_panel.add(btnSave);
		
		JLabel label = new JLabel("+");
		label.setForeground(new Color(255, 255, 224));
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(366, 188, 12, 22);
		center_panel.add(label);
		
		spinner = new JSpinner();
		spinner.setBounds(388, 185, 29, 23);
		center_panel.add(spinner);
		
		JLabel label_1 = new JLabel("=");
		label_1.setForeground(new Color(255, 255, 224));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(427, 188, 12, 22);
		center_panel.add(label_1);
		
		txt_total = new JTextField();
		txt_total.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) 
			{
				int total=Integer.parseInt(txt_qty.getText().toString())+Integer.parseInt(spinner.getValue().toString());
				txt_total.setText(""+total);
				
			}
		});
		txt_total.setBounds(449, 185, 86, 20);
		center_panel.add(txt_total);
		txt_total.setColumns(10);
		
		item_name = new JComboBox();
		item_name.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				try 
				{
					Connection con=DBConnect.getConnection();
					PreparedStatement pst=con.prepareStatement("select * from equipment where Item_type=? and Item_name=? ");
					pst.setString(1, comboBox.getSelectedItem().toString());
					pst.setString(2, item_name.getSelectedItem().toString());
					ResultSet rs=pst.executeQuery();
		
					//System.out.print(pst);
				//	item_name.removeAllItems();
					
					while(rs.next())
					{
						txt_qty.setText(rs.getString("qty"));
					}
					
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			
				
				
				
			}
		});
		item_name.setBounds(190, 119, 166, 22);
		center_panel.add(item_name);

	}
}
