package drawing;

import javax.swing.*;
import java.awt.*;
class GraphicTest extends JFrame  
{
	public GraphicTest(String str) 
	{
		super(str);    
		setSize(200,200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void paint(Graphics g) 
	{
		g.drawLine(10, 10, 190,190);
		g.drawRect(10, 10, 100,100);
		g.drawOval(50, 50, 100,100);
		g.drawArc(100, 100, 80, 80, 0, 90);
	}
}
public class Paint1{
	public static void main(String[] args) {
		new GraphicTest("그래픽 테스트");
	}
}

