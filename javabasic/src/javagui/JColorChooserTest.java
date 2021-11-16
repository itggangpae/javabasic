package javagui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JColorChooserTest extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lbl;
	JButton btn;
	public JColorChooserTest()
	{
		super("JColorChooser 테스트");
		btn = new JButton("색상 대화 상자 호출");
		lbl = new JLabel("색상 출력");
		add("North",lbl);
		add("Center",btn);
		btn.addActionListener(this);
		setBounds(300, 300, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="색상 대화 상자 호출")
		{
			Color rgb=JColorChooser.showDialog(this,"색상 선택", Color.CYAN);
			lbl.setText("색상:" + rgb);
			btn.setBackground(rgb);
		}
	}	
}

