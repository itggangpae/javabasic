package javagui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class JPanel01 extends JPanel {  // 1번째 패널

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton jButton1;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private JPanelTest win;

	public JPanel01(JPanelTest win){
		this.win = win;
		setLayout(null);

		jButton1 = new JButton("버튼");
		jButton1.setSize(70,20);        
		jButton1.setLocation(10, 10);
		add(jButton1);

		jTextArea1 = new JTextArea();

		jScrollPane1 = new JScrollPane(jTextArea1);
		jScrollPane1.setSize(200,150);
		jScrollPane1.setLocation(10,40);
		add(jScrollPane1);

		jButton1.addActionListener(new MyActionListener());
	}
	
	class MyActionListener implements ActionListener {    // 버튼 키 눌리면 패널 2번 호출
		@Override
		public void actionPerformed(ActionEvent e) {
			win.change("panel02");
		}
	}
}