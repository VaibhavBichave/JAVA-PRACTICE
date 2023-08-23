import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class Splash extends JWindow
{
  private int duration;

  public Splash(int d) {
    duration = 3500;
  }

  // A simple little method to show a title screen in the center
  // of the screen for the amount of time given in the constructor
  public void showSplash() {
    JPanel content = (JPanel) getContentPane();
    content.setBackground(Color.white);

    // Set the window's bounds, centering the window
    int width = 450;
    int height = 300;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (screen.width - width) / 2;
    int y = (screen.height - height) / 2;
    setBounds(x, y, width, height);

    // Build the splash screen
    JLabel label = new JLabel(new ImageIcon("D:\\Image\\Military_Network\\sp.gif"));
    JLabel copyrt = new JLabel("Welcome to Military Networks",
       JLabel.CENTER);
    copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
    content.add(label, BorderLayout.CENTER);
    content.add(copyrt, BorderLayout.SOUTH);
    Color oraRed = new Color(9, 202, 250, 255);
    content.setBorder(BorderFactory.createLineBorder(oraRed, 10));

    // Display it
    setVisible(true);

    // Wait a little while, maybe while loading resources
    try 
    {
    	Thread.sleep(duration);
    	} catch (Exception e)
    	{
    }

    setVisible(false);
  }

  public void showSplashAndExit()
  {
	  showSplash();
	  dispose();
	  Homepage e=new Homepage();
	  e.setVisible(true);
  }

  public static void main(String[] args) 
  {
    // Throw a nice little title page up on the screen first
    Splash splash = new Splash(10000);
    // Normally, we'd call splash.showSplash() and get on with the program.
    // But, since this is only a test...
    splash.showSplashAndExit();
  }
}

        