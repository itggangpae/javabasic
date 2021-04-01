package drawing;

import java.awt.*;

import javax.swing.*;

class ClippingTest extends JFrame {
	Container contentPane;
	public ClippingTest() {
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(50, 20, 150, 150);
			g.setColor(Color.BLUE);
			g.setFont(new Font("SanSerif", Font.ITALIC, 40));
			g.drawString("석양", 10, 150);
		}
	}
}


public class ClippingMain {
	public static void main(String [] args) {
		new ClippingTest();
	}
}
