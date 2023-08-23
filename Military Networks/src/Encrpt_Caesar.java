import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;


public class Encrpt_Caesar extends JInternalFrame {
	private JTextArea encrpyt_textArea;
	private JComboBox key_cb;
	private JButton btn_encryt;
	private JTextArea De_textarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encrpt_Caesar frame = new Encrpt_Caesar();
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
	public Encrpt_Caesar() {
		setClosable(true);
		setBounds(100, 100, 691, 504);
		getContentPane().setLayout(null);
		
		JLabel lblKey = new JLabel("Key");
		lblKey.setForeground(Color.RED);
		lblKey.setFont(new Font("Arial", Font.BOLD, 20));
		lblKey.setHorizontalAlignment(SwingConstants.CENTER);
		lblKey.setBounds(168, 27, 68, 27);
		getContentPane().add(lblKey);
		
		key_cb = new JComboBox();
		key_cb.setModel(new DefaultComboBoxModel(new String[] {"Select Key Hear !", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		key_cb.setFont(new Font("Arial", Font.BOLD, 16));
		key_cb.setBounds(246, 28, 184, 26);
		getContentPane().add(key_cb);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(68, 130, 513, 132);
		getContentPane().add(scrollPane_1);
		
		encrpyt_textArea = new JTextArea();
		encrpyt_textArea.setFont(new Font("Arial", Font.BOLD, 18));
		scrollPane_1.setViewportView(encrpyt_textArea);
		
		btn_encryt = new JButton("Encrypt");
		btn_encryt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String message, encryptedMessage = "";
				int key;
				char ch;
				message = encrpyt_textArea.getText().toString();
				key =Integer.parseInt(key_cb.getSelectedItem().toString());
				
				for(int i = 0; i < message.length(); ++i){
					ch = message.charAt(i);
					
					if(ch >= 'a' && ch <= 'z'){
			            ch = (char)(ch + key);
			            
			            if(ch > 'z'){
			                ch = (char)(ch - 'z' + 'a' - 1);
			            }
			            
			            encryptedMessage += ch;
			        }
			        else if(ch >= 'A' && ch <= 'Z'){
			            ch = (char)(ch + key);
			            
			            if(ch > 'Z'){
			                ch = (char)(ch - 'Z' + 'A' - 1);
			            }
			            
			            encryptedMessage += ch;
			        }
			        else {
			        	encryptedMessage += ch;
			        }
				}
				De_textarea.setText(encryptedMessage);
				System.out.println("Encrypted Message = " + encryptedMessage);
			}
		});
		btn_encryt.setForeground(Color.RED);
		btn_encryt.setBackground(Color.WHITE);
		btn_encryt.setHorizontalAlignment(SwingConstants.LEFT);
		btn_encryt.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\Image\\Military_Network\\axcrypt-logo.png"));
		btn_encryt.setBounds(212, 279, 228, 59);
		getContentPane().add(btn_encryt);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 361, 523, 59);
		getContentPane().add(scrollPane);
		
		De_textarea = new JTextArea();
		De_textarea.setFont(new Font("Arial", Font.BOLD, 18));
		scrollPane.setViewportView(De_textarea);
		
		JLabel lblNewLabel_1 = new JLabel("* NOTE PLEASE USE BLANK SPACE AT END .");
		lblNewLabel_1.setBorder(new LineBorder(Color.GREEN, 2));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(56, 96, 535, 23);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\Image\\Military_Network\\encryption.png"));
		lblNewLabel.setBounds(0, 0, 683, 475);
		getContentPane().add(lblNewLabel);

	}
}
