package javagui;

import java.awt.*;

public class PanelTest extends Frame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelTest(String str) 
	{
		super(str);
		Panel panel1 = new Panel();
		panel1.setBackground(Color.lightGray);
		add(panel1);
		setSize(300,300);
		setVisible(true);		
	}
}

