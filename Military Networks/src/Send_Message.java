import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class Send_Message extends JInternalFrame {
	private JPanel panel;
	private JTextField txt_name;
	private JTextField txt_key;
	
	Connection con;
	private JComboBox comboBox;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Send_Message frame = new Send_Message();
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
	public Send_Message() 
	{
		con=DBConnect.getConnection();
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 821, 489);
		
		panel = new JPanel()
		{
		    public void paintComponent(Graphics g)
		    {
		        Image img = new ImageIcon("D:\\Image\\Military_Network\\home.jpg").getImage();
		        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		    }
		};
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblSol = new JLabel("ID");
		lblSol.setHorizontalAlignment(SwingConstants.CENTER);
		lblSol.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSol.setBounds(33, 31, 104, 38);
		panel.add(lblSol);
		
		txt_name = new JTextField();
		txt_name.setBounds(147, 99, 193, 39);
		panel.add(txt_name);
		txt_name.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(33, 100, 104, 38);
		panel.add(lblName);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) 
			{
				try
				{
					PreparedStatement pst=con.prepareStatement("select name from register where id=?");
					pst.setString(1, comboBox.getSelectedItem().toString());
					ResultSet rs=pst.executeQuery();
					while(rs.next())
					{
						txt_name.setText(rs.getString("Name"));
					}
				}
				catch (Exception e)
				{
				e.printStackTrace();
				}
			}
		});
		comboBox.setBounds(147, 33, 193, 38);
		panel.add(comboBox);
		
		JLabel lblKe = new JLabel("KEY");
		lblKe.setHorizontalAlignment(SwingConstants.CENTER);
		lblKe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKe.setBounds(33, 175, 104, 38);
		panel.add(lblKe);
		
		txt_key = new JTextField();
		txt_key.setColumns(10);
		txt_key.setBounds(147, 174, 193, 39);
		panel.add(txt_key);
		
		JLabel lblSearteMessage = new JLabel("MESSAGE");
		lblSearteMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearteMessage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearteMessage.setBounds(10, 251, 127, 38);
		panel.add(lblSearteMessage);
		
		textArea = new JTextArea();
		textArea.setBounds(147, 260, 198, 102);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("SEND MESSAGE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
					try
					{
						PreparedStatement pst=con.prepareStatement("insert into message values(?,?,?)");
						pst.setString(1,comboBox.getSelectedItem().toString());
						pst.setString(2, txt_key.getText().toString());
						pst.setString(3, textArea.getText().toString());
						pst.execute();
						JOptionPane.showMessageDialog(null, "Message Send !");
						
						
					}
					catch (Exception e) 
					{
						e.printStackTrace();
					}
			
			}
		});
		btnNewButton.setBounds(161, 403, 179, 32);
		panel.add(btnNewButton);

		try
		{
			PreparedStatement pst=con.prepareStatement("SELECT  * from  register");
			ResultSet rs=pst.executeQuery();
			String arg[]=new String[50];
			int i=0;
			while(rs.next())
			{
				arg[i]=rs.getString("ID");
				comboBox.addItem(arg[i]);
			}
		}
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
		
	}
}
