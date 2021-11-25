package multimedia;

import java.awt.*;
import java.awt.event.*;

class ImageTest extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image img ;
	String s = "aespa.jpeg" ;
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
