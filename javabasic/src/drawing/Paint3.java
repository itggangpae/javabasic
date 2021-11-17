package drawing;

import java.awt.*;
import javax.swing.*;
class XCanvas extends Canvas 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Font font = null;
	public void paint(Graphics g) 
	{
		font = new Font("Timesroman", Font.BOLD, 20);
		g.setFont(font);
		g.drawString("글꼴 출력", 50, 50);
		font = new Font("굴림", Font.ITALIC|Font.BOLD , 15);
		g.setFont(font);
		g.setColor( Color.blue);
		g.drawString("자바 ..!", 50, 120);
	}
}

public class Paint3 {
	public static void main(String[] args)
	{		
		XCanvas canvas = new XCanvas();
		JFrame f = new JFrame("폰트 예제");
		f.add(canvas);
		f.setSize(200, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
