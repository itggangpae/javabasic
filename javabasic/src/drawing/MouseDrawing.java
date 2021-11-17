package drawing;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.util.List;

class PaintMain extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	public PaintMain() {
		setTitle("Drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		List<Point> vs = new ArrayList<Point>();
		List<Point> ve = new ArrayList<Point>();

		Point startP = null;
		Point endP = null;

		public MyPanel() {
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
					startP = e.getPoint();
				}
				
			});
			
			addMouseMotionListener(new MouseMotionListener() {
				@Override
				public void mouseDragged(MouseEvent e) {
					endP = e.getPoint();
					vs.add(startP);
					ve.add(endP);
					repaint();
				}

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for(int i=0; i<vs.size(); i++) {
				Point s = vs.get(i);
				Point e = ve.get(i);
				g.drawLine((int)s.getX(), (int)s.getY(), 
						(int)e.getX(), (int)e.getY());
			}
		}
	}
} 

public class MouseDrawing {
	public static void main(String [] args) {
		new PaintMain();
	}
}
