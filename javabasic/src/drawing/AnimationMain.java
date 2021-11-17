package drawing;

import java.awt.*;
import java.awt.event.*;
class ImageAnimationTest extends Frame {	

	private static final long serialVersionUID = 1L;
	Image img[] = new Image[10];
	int num = 0 ;
	public ImageAnimationTest(String title){
		super(title);
		for(int i = 0 ; i < 4 ; i++){
			img[i] = Toolkit.getDefaultToolkit().getImage("aespa"+(i)+".jpeg");
		}		
		addWindowListener(new WindowHandler());
		setSize(201,251);
		setVisible(true);
	}
	public void paint(Graphics g){
		if( num > 3 ) num = 0 ;		
		g.drawImage(img[num++], 0, 0, this);		
	}
	class WindowHandler extends WindowAdapter{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
}

public class AnimationMain {
	public static void main(String[] args) {
		ImageAnimationTest ani = new ImageAnimationTest("슬립을 이용한 애니메이션");		
		while(true)
		{			
			try
			{
				Thread.sleep(500);
				ani.repaint();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
				break;
			}
		}
	}

}
