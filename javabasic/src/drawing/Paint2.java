package drawing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ColorTest extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Color c = new Color( 0, 0, 255 ); 
	public void paint( Graphics g )
	{
		g.setColor(c);
		g.fillRect( 25, 40, 100, 20 );
		g.setColor(Color.BLACK);
		g.drawString( "RGB 값 : " + c, 25,75 );
	}
}

class ColorFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ColorFrame(){
		super("색상 테스트");
		ColorTest p = new ColorTest();
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		JMenu color = new JMenu("색상(C)");
		color.setMnemonic('c');
		color.setToolTipText("색상 선택");
		mb.add(color);
		JMenuItem red = new JMenuItem("빨강");
		red.addActionListener(new MenuEvent(p));
		color.add(red);
		JMenuItem green = new JMenuItem("녹색");
		green.addActionListener(new MenuEvent(p));
		color.add(green);
		JMenuItem blue = new JMenuItem("파랑");
		blue.addActionListener(new MenuEvent(p));
		color.add(blue);
		add(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
}

class MenuEvent implements ActionListener
{
	ColorTest pa;
	public MenuEvent(ColorTest arg)
	{
		pa = arg;
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("빨강")){
		pa.c = Color.red;
		}
		else if(e.getActionCommand().equals("녹색")){
			pa.c = Color.green;
			}
		else
			pa.c = Color.blue;
		pa.repaint();
	}
}

public class Paint2 {
	public static void main(String[] args) {
		new ColorFrame();
	}
}
