//import java.awt.BorderLayout;
//import java.awt.Desktop;
//import java.awt.Dimension;
//import java.awt.EventQueue;
//import java.awt.Graphics;
//import java.awt.Image;
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JMenuBar;
//import javax.swing.JMenu;
//import javax.swing.JMenuItem;
//import javax.swing.JSeparator;
//import javax.swing.JMenuBar;
//import javax.swing.JMenu;
//import javax.swing.JMenuItem;
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JSeparator;
//import java.net.Inet4Address;
//import java.net.URI;
//import java.net.UnknownHostException;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLEncoder;
//import javax.xml.xpath.XPathExpression;
//import javax.xml.xpath.XPathFactory;
//import javax.xml.xpath.XPathConstants;
//import javax.xml.xpath.XPath;
//import java.awt.Toolkit;
//import java.awt.GridLayout;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.SystemColor;

/*
import org.w3c.dom.Document;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import javax.xml.*;*/


import javax.xml.xpath.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public class Homepage extends JFrame {

	private JPanel contentPane;
	private JPanel center_panel;
	private JPanel panel;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton;
	private JMenu mnEncrypt;
	private JMenu mnLocation;
	private JMenu mnItem;
	private JMenu mnMessage;
	private JMenu mnNewMenu;
	private JMenu mnHelp;
	private JMenu mnUtility;
	private JMenu mnKeyFunction;
	private JMenuItem mntmAes;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmCeasorFunction;
	private JMenuItem mntmExit;
	private JMenuItem mntmStartServer;
	private JMenuItem mntmStopServer;
	private JMenuItem mntmGetServerAddress;
	private JMenuItem mntmAddEquiment;
	private JMenuItem mntmStockEntry;
	private JMenuItem mntmMaps;
	private JMenuItem mntmSearchCity;
	private JMenuItem mntmCalulator;
	private JMenuItem mntmNotepad;
	private JMenuItem mntmMenuitem;
	private JMenuItem mntmMsPaint;
	private JMenuItem mntmAboutUs;
	private JMenuItem mntmComment;
	private JSeparator separator_1;
	private JMenuBar menuBar;

	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
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
	public Homepage()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Image\\Military_Network\\military-wallpaper-6667-6914-hd-wallpapers.jpg"));
		setTitle("Main Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		menuBar.setFont(new Font("Arial", Font.BOLD, 18));
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Server");
		menuBar.add(mnNewMenu);
		
		mntmStartServer = new JMenuItem("Start Server");
		mntmStartServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					//v Runtime runTime = Runtime.getRuntime();
					//v Process process = runTime.exec("C:\\xampp\\xampp-control.exe");
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		mnNewMenu.add(mntmStartServer);
		
		mntmStopServer = new JMenuItem("Stop Server");
		mnNewMenu.add(mntmStopServer);
		
		mntmGetServerAddress = new JMenuItem("Get Server Address");
		mntmGetServerAddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try 
				{
					JOptionPane.showMessageDialog(null,Inet4Address.getLocalHost().getHostAddress());
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		mnNewMenu.add(mntmGetServerAddress);
		
		separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmExit);
		
		mnEncrypt = new JMenu("Encrypt");
		menuBar.add(mnEncrypt);
		
		mnKeyFunction = new JMenu("Message");
		mnEncrypt.add(mnKeyFunction);
		
		mntmAes = new JMenuItem("Encrypt");
		mntmAes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Encrpt_Caesar caesar=new Encrpt_Caesar();
				caesar.setVisible(true);
				center_panel.removeAll();
				center_panel.add(caesar);
			}
		});
		mnKeyFunction.add(mntmAes);
		
		mntmNewMenuItem = new JMenuItem("Decrypt");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Decrpt_Caesar caesar=new Decrpt_Caesar();
				caesar.setVisible(true);
				center_panel.removeAll();
				center_panel.add(caesar);
			}
		});
		mnKeyFunction.add(mntmNewMenuItem);
		
		mntmCeasorFunction = new JMenuItem("Rail Fence");
		mntmCeasorFunction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				RailFenceGui fenceGui=new RailFenceGui();
				fenceGui.setVisible(true);
				center_panel.removeAll();
				center_panel.add(fenceGui);
				repaint();
				revalidate();
			}
		});
		mnEncrypt.add(mntmCeasorFunction);
		
		mnLocation = new JMenu("Location");
		menuBar.add(mnLocation);
		
		mntmMaps = new JMenuItem("Maps");
		mntmMaps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String url = "https://www.google.co.in/maps";
				if(Desktop.isDesktopSupported()){
				Desktop desktop = Desktop.getDesktop();
				try {
				desktop.browse(new URI(url));
				} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}
				}else{
				Runtime runtime = Runtime.getRuntime();
				try {
				runtime.exec("xdg-open " + url);
				} catch (Exception e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
				}
				}
			}
		});
		mnLocation.add(mntmMaps);
		
		mntmSearchCity = new JMenuItem("Search City");
		mntmSearchCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
						String postcode=JOptionPane.showInputDialog(null,"Enter City Name Hear ","Search ",JOptionPane.QUESTION_MESSAGE);
						String latLongs[] = getLatLongPositions(postcode);
					    System.out.println("Latitude: "+latLongs[0]+" and Longitude: "+latLongs[1]);
						String url = "https://www.latlong.net/c/?lat="+latLongs[0]+"&long="+latLongs[1]+"";
				if(Desktop.isDesktopSupported())
				{
					Desktop desktop = Desktop.getDesktop();
					try 
					{
							desktop.browse(new URI(url));
					} catch (Exception e1)
					{
							e1.printStackTrace();
					}
				}
				else
				{
						Runtime runtime = Runtime.getRuntime();
						try 
						{
								runtime.exec("xdg-open " + url);
								
						} catch (Exception e3) 
						{
							e3.printStackTrace();
						}
				}
				}
				catch (Exception e)
				{
					// TODO: handle exception
				}
			}
		});
		mnLocation.add(mntmSearchCity);
		
		mnItem = new JMenu("Item");
		menuBar.add(mnItem);
		
		mntmAddEquiment = new JMenuItem("Add Equiment");
		mntmAddEquiment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				center_panel.removeAll();
				Item_Entry entry=new  Item_Entry();
				entry.setVisible(true);
				center_panel.add(entry);
				repaint();
				revalidate();
				
			}
		});
		mnItem.add(mntmAddEquiment);
		
		mntmStockEntry = new JMenuItem("Stock Entry");
		mntmStockEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				center_panel.removeAll();
				stock_entry entry=new  stock_entry();
				entry.setVisible(true);
				center_panel.add(entry);
				repaint();
				revalidate();
			
			}
		});
		mnItem.add(mntmStockEntry);
		
		mnMessage = new JMenu("File Operation");
		menuBar.add(mnMessage);
		
		mntmMenuitem = new JMenuItem("File Spilter");
		mntmMenuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				center_panel.removeAll();
				EasySplitter es=new EasySplitter();
				es.setVisible(true);
				//v es.show();
				es.setSize(700,470);
				center_panel.add(es);
				repaint();
				revalidate();
			}
		});
		mnMessage.add(mntmMenuitem);
		
		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		mnUtility = new JMenu("Utility");
		mnHelp.add(mnUtility);
		
		mntmCalulator = new JMenuItem("Calulator");
		mnUtility.add(mntmCalulator);
		
		mntmNotepad = new JMenuItem("Notepad");
		mnUtility.add(mntmNotepad);
		
		mntmMsPaint = new JMenuItem("Ms Paint");
		mnUtility.add(mntmMsPaint);
		
		mntmAboutUs = new JMenuItem("About Us");
		mnHelp.add(mntmAboutUs);
		
		mntmComment = new JMenuItem("Comment");
		mnHelp.add(mntmComment);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnNewButton_1 = new JButton("Send Message");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				center_panel.removeAll();
				Send_Message e=new Send_Message();
				e.setVisible(true);
				center_panel.add(e);
				repaint();
				revalidate();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("D:\\Image\\Military_Network\\send.png"));
		panel.add(btnNewButton_1);
		
		btnNewButton_3 = new JButton("Retrive Message");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				center_panel.removeAll();
				Recevie_message rs=new Recevie_message();
				rs.setVisible(true);
				center_panel.add(rs);
				repaint();
				revalidate();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setIcon(new ImageIcon("D:\\Image\\Military_Network\\b2cc37ffcc52e53e438cdfde85fed197-blue-message-box-icon-by-vexels.png"));
		panel.add(btnNewButton_3);
		
		btnNewButton_2 = new JButton("Soldier Detail");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				center_panel.removeAll();
				New_Soldier_entry entry=new New_Soldier_entry();
				entry.setVisible(true);
				center_panel.add(entry);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setIcon(new ImageIcon("D:\\Image\\Military_Network\\206884.png"));
		panel.add(btnNewButton_2);
		
		btnNewButton = new JButton("Armor Detail");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					AmmorDetail detail=new AmmorDetail();
					detail.setVisible(true);
					center_panel.removeAll();
					center_panel.add(detail);
					repaint();
					revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("D:\\Image\\Military_Network\\LAX_Range_Icon_Gun.png"));
		panel.add(btnNewButton);
		
		
		 center_panel = new JPanel()
			{
			    public void paintComponent(Graphics g)
			    {
			        Image img = new ImageIcon("D:\\Image\\Military_Network\\home_2.jpg").getImage();
			        getContentPane().setLayout(null);
			        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			    }
			};
		 center_panel.setBorder(new TitledBorder(null, "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(51, 255, 0)));
		 contentPane.add(center_panel, BorderLayout.CENTER);
		 center_panel.setLayout(null);
		 
		 JPanel panel_2 = new JPanel();
		 panel_2.setBackground(SystemColor.activeCaption);
		 contentPane.add(panel_2, BorderLayout.NORTH);
		 
		 JLabel lblNewLabel = new JLabel("Military Network ");
		 lblNewLabel.setForeground(new Color(128, 0, 0));
		 lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 50));
		 panel_2.add(lblNewLabel);
		
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	      setBounds(0,0,screenSize.width, screenSize.height);
		
	
		
	}
	public static String[] getLatLongPositions(String address) throws Exception
	  {
	    int responseCode = 0;
	    String api = "http://maps.googleapis.com/maps/api/geocode/xml?address=" + URLEncoder.encode(address, "UTF-8") + "&sensor=true";
	    URL url = new URL(api);
	    HttpURLConnection httpConnection = (HttpURLConnection)url.openConnection();
	    httpConnection.connect();
	    responseCode = httpConnection.getResponseCode();
	    if(responseCode == 200)
	    {
	      DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();;
	      Document document = builder.parse(httpConnection.getInputStream());
	      XPathFactory xPathfactory = XPathFactory.newInstance();
	      XPath xpath = xPathfactory.newXPath();
	      XPathExpression expr = xpath.compile("/GeocodeResponse/status");
	      String status = (String)expr.evaluate(document, XPathConstants.STRING);
	      if(status.equals("OK"))
	      {
	         expr = xpath.compile("//geometry/location/lat");
	         String latitude = (String)expr.evaluate(document, XPathConstants.STRING);
	         expr = xpath.compile("//geometry/location/lng");
	         String longitude = (String)expr.evaluate(document, XPathConstants.STRING);
	         return new String[] {latitude, longitude};
	      }
	      else
	      {
	         throw new Exception("Error from the API - response status: "+status);
	      }
	    }
	    return null;
	  }
}
