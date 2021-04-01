package drawing;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.JFrame;

class Graphics2DTest1 extends JFrame {
	public Graphics2DTest1() 
	{
		super( "Graphics2D 연습" );
		setSize( 350, 180 );
		setVisible(true);
	}
	public void paint( Graphics g )
	{
		Graphics2D g2d = ( Graphics2D ) g;
		g2d.setPaint(
				new GradientPaint( 5, 30,Color.blue,10, 50, Color.cyan,true ) ); 
		g2d.fill( new Rectangle2D.Double( 10, 50, 60, 100 ) );
		g2d.setStroke( new BasicStroke( 8 ) ); 
		g2d.draw( new Ellipse2D.Double( 80, 50, 60, 100 ) );
		float dashes[] = { 10 };
		g2d.setPaint( Color.magenta );    
		g2d.setStroke(
				new BasicStroke( 8,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dashes, 0 ) );      

		g2d.draw( new Line2D.Double( 150, 50, 200, 150 ) );

		g2d.draw(new Arc2D.Double(210, 50, 50, 100, 0, 270, Arc2D.CHORD ) );

		g2d.setPaint( Color.darkGray );
		g2d.fill(new Arc2D.Double(280, 50, 50, 100, 0, -90, Arc2D.PIE ) );
	}
}


public class Paint5{
	public static void main(String[] args) {
		new Graphics2DTest1();
	}
}

