package drawing;

import java.awt.*;
import java.awt.event.*;

class ImageTest extends Frame{
	Image img ;
	String s = "image1.png" ;
	public ImageTest(String title)
	{
		super(title);
		img = Toolkit.getDefaultToolkit().getImage(s) ;
		addWindowListener(new WindowHandler());
		setSize(800,600);
		setVisible(true);
	}
	public void paint(Graphics g) 
	{
		g.drawImage(img, 0, 0 , this);
	}      

	class WindowHandler extends WindowAdapter 
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
}


public class OriginalImage {
	public static void main(String[] args) {
		new ImageTest("태연");
	}

}
