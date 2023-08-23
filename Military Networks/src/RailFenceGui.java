import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RailFenceGui extends JInternalFrame {
	private JComboBox cb_key;
	private JTextPane En_txt;
	private JTextPane Dn_txt;
	private JButton btnDecrypt;
	private JButton btnEncrypt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RailFenceGui frame = new RailFenceGui();
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
	public RailFenceGui() {
		setClosable(true);
		setBounds(100, 100, 776, 506);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Depth");
		lblNewLabel.setForeground(new Color(255, 140, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(98, 106, 58, 27);
		getContentPane().add(lblNewLabel);

		cb_key = new JComboBox();
		cb_key.setAutoscrolls(true);
		cb_key.setModel(new DefaultComboBoxModel(new String[] { "Select Key Hear !", "1", "2", "3", "4" }));
		cb_key.setFont(new Font("Tahoma", Font.BOLD, 17));
		cb_key.setBounds(166, 106, 306, 27);
		getContentPane().add(cb_key);

		JLabel lblNotePlease = new JLabel("* NOTE PLEASE ADD BLANK SPACE AT END OF LINE ");
		lblNotePlease.setForeground(Color.RED);
		lblNotePlease.setFont(new Font("Arial", Font.BOLD, 20));
		lblNotePlease.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotePlease.setBounds(122, 21, 554, 33);
		getContentPane().add(lblNotePlease);

		En_txt = new JTextPane();
		En_txt.setBorder(new MatteBorder(3, 3, 3, 2, (Color) new Color(255, 153, 0)));
		En_txt.setBounds(166, 162, 306, 91);
		getContentPane().add(En_txt);

		JLabel lblInput = new JLabel("Input \r\nText :");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblInput.setForeground(Color.ORANGE);
		lblInput.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInput.setBounds(39, 169, 117, 33);
		getContentPane().add(lblInput);

		Dn_txt = new JTextPane();
		Dn_txt.setBorder(new LineBorder(new Color(51, 255, 0), 3, true));
		Dn_txt.setBounds(166, 291, 306, 91);
		getContentPane().add(Dn_txt);

		JLabel lblNewLabel_1 = new JLabel("Output Text :");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBounds(39, 304, 117, 27);
		getContentPane().add(lblNewLabel_1);

		btnEncrypt = new JButton("Encrypt");
		btnEncrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				 * int
				 * r=Integer.parseInt(cb_key.getSelectedItem().toString()),len=En_txt.getText().
				 * length();
				 * int c=len/Integer.parseInt(cb_key.getSelectedItem().toString());
				 * char mat[][]=new char[r][c];
				 * int k=0;
				 * 
				 * String cipherText="";
				 * 
				 * for(int i=0;i< c;i++)
				 * {
				 * for(int j=0;j< r;j++)
				 * {
				 * if(k!=len)
				 * mat[j][i]=En_txt.getText().toString().charAt(k++);
				 * else
				 * mat[j][i]='X';
				 * }
				 * }
				 * for(int i=0;i< r;i++)
				 * {
				 * for(int j=0;j< c;j++)
				 * {
				 * cipherText+=mat[i][j];
				 * }
				 * }
				 * Dn_txt.setText("");
				 * Dn_txt.setText("Encrypted : "+cipherText);
				 */

				RailFenceBasic rf = new RailFenceBasic();
				try {
					String cipherText = rf.Encryption(En_txt.getText().toString(),
							Integer.parseInt(cb_key.getSelectedItem().toString()));
					Dn_txt.setText("");
					Dn_txt.setText("Encrypted : " + cipherText);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		btnEncrypt.setBounds(587, 177, 89, 23);
		getContentPane().add(btnEncrypt);

		btnDecrypt = new JButton("Decrypt");
		btnDecrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				 * int
				 * r=Integer.parseInt(cb_key.getSelectedItem().toString()),len=Dn_txt.getText().
				 * length();
				 * int c=len/Integer.parseInt(cb_key.getSelectedItem().toString());
				 * char mat[][]=new char[r][c];
				 * int k=0;
				 * 
				 * String plainText="";
				 * 
				 * 
				 * for(int i=0;i< r;i++)
				 * {
				 * for(int j=0;j< c;j++)
				 * {
				 * mat[i][j]=Dn_txt.getText().charAt(k++);
				 * }
				 * }
				 * for(int i=0;i< c;i++)
				 * {
				 * for(int j=0;j< r;j++)
				 * {
				 * plainText+=mat[j][i];
				 * }
				 * }
				 * Dn_txt.setText("");
				 * Dn_txt.setText("Decryption :"+plainText);
				 */
				RailFenceBasic rf = new RailFenceBasic();
				try {

					String decryptedText = rf.Decryption(En_txt.getText().toString(),
							Integer.parseInt(cb_key.getSelectedItem().toString()));
					Dn_txt.setText("");
					Dn_txt.setText("DECRYTED TEXT: " + decryptedText);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnDecrypt.setBounds(587, 308, 89, 23);
		getContentPane().add(btnDecrypt);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\Image\\Military_Network\\1.jpg"));
		lblNewLabel_2.setBounds(0, 0, 760, 466);
		getContentPane().add(lblNewLabel_2);

	}
}
