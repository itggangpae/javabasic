package multimedia;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
class Java2DTest extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Rectangle2D.Double rect;
	Ellipse2D.Double circle;
	Line2D.Double line;	
	public Java2DTest(String title) 
	{
		super(title);
		rect = new Rectangle2D.Double(20, 50, 250, 200);
		circle = new Ellipse2D.Double(50, 50, 200, 200);
		line = new Line2D.Double(30.1, 51.3, 193.9, 219.1);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	public void paint(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.blue);
		g2.draw(rect);
		g2.setColor(Color.red);
		g2.fill(circle);
		g2.setColor(Color.black);
		g2.draw(line);
	}
}

public class Paint4{
	public static void main(String[] args) {
		new Java2DTest("Java2DTest");
	}
}
