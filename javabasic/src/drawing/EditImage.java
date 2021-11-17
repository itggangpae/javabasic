package drawing;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.filechooser.*;

enum ImageTask{
	BASIC,ZOOMIN,ZOOMOUT,HORIZONTAL,VERTICAL,REVERSE;
}

class ImageEditing extends Frame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image img ;		
	EditCanvas xcanvas;
	Button[] btn = new Button[7];
	String[] btn_str = {"기본","확대","축소","좌우","상하","반전", "이미지 불러오기"};
	TextField txt ;

	ImageTask message = ImageTask.BASIC ;

	String s = "aespa.jpeg" ; // 초기 이미지

	public ImageEditing(String title){  
		super(title);
		img = Toolkit.getDefaultToolkit().getImage(s) ;
		xcanvas = new EditCanvas(this);
		xcanvas.setSize(550,450);
		Panel panel1 = new Panel(); 
		Panel panel2 = new Panel();		
		ActionHandler handler = new ActionHandler(this);
		for( int i = 0 ; i < 6 ; i++ ){ 
			btn[i] = new Button(btn_str[i]);
			btn[i].addActionListener(handler);
			panel1.add(btn[i]);
		}
		panel2.add(new Label("파일 불러오기 :"));
		txt = new TextField(30);
		panel2.add(txt);
		btn[6] = new Button(btn_str[6]);
		btn[6].addActionListener(handler);
		panel2.add(btn[6]);

		add("North", panel2);
		add("Center",xcanvas);
		add("South", panel1);
		addWindowListener(new WindowHandler());
		setSize(550,500);
		setVisible(true);
	}
}

class EditCanvas extends Canvas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageEditing imageTest;
	
	public EditCanvas(ImageEditing imageTest) {
		this.imageTest = imageTest;
	}
	
	public void paint(Graphics g) {
		switch(imageTest.message ){
		case BASIC:			 
			g.drawImage(imageTest.img, 0, 0, this);
			break;
		case ZOOMIN:
			g.drawImage(imageTest.img, 0, 0, imageTest.img.getWidth(this)*2, this.getHeight() + imageTest.img.getHeight(this)*2, 0 , 0, imageTest.img.getWidth(this), imageTest.img.getHeight(this), this);
			break;
		case ZOOMOUT:
			g.drawImage(imageTest.img, 0, 0, imageTest.img.getWidth(this)/2, imageTest.img.getHeight(this)/2, 0 , 0, imageTest.img.getWidth(this), imageTest.img.getHeight(this), this);
			break;
		case HORIZONTAL:
			g.drawImage(imageTest.img, imageTest.img.getWidth(this), 0, 0, imageTest.img.getHeight(this) ,0,0,imageTest.img.getWidth(this), imageTest.img.getHeight(this), this);
			break;
		case VERTICAL:
			g.drawImage(imageTest.img, 0, imageTest.img.getHeight(this) ,imageTest.img.getWidth(this), 0, 0, 0, imageTest.img.getWidth(this), imageTest.img.getHeight(this), this);
			break;
		case REVERSE:
			g.drawImage(imageTest.img, imageTest.img.getWidth(this), imageTest.img.getHeight(this) ,0, 0, 0, 0, imageTest.img.getWidth(this), imageTest.img.getHeight(this),this);
			break;
		}
	}
} 


class ActionHandler implements ActionListener{
	ImageEditing imageTest;
	
	
	public ActionHandler(ImageEditing imageTest) {
		super();
		this.imageTest = imageTest;
	}

	public void actionPerformed(ActionEvent e){
		Button obj = (Button)e.getSource();		
		if( obj == imageTest.btn[0] ){           
			imageTest.message = ImageTask.BASIC ;          
		}
		else if( obj == imageTest.btn[1] ){
			imageTest.message = ImageTask.ZOOMIN ;          
		}
		else if( obj == imageTest.btn[2] ){
			imageTest.message = ImageTask.ZOOMOUT ;          
		}
		else if( obj == imageTest.btn[3] ){
			imageTest.message = ImageTask.HORIZONTAL ;          
		}
		else if( obj == imageTest.btn[4] ){
			imageTest.message = ImageTask.VERTICAL ;          
		}
		else if( obj == imageTest.btn[5] ){
			imageTest.message = ImageTask.REVERSE ;          
		}
		else{
			JFileChooser fc = new JFileChooser();
			FileNameExtensionFilter filter = 
					new FileNameExtensionFilter("ImageFile", "jpg", "gif", "png");
			fc.setFileFilter(filter);
			int result = fc.showOpenDialog(null);
			if(result ==JFileChooser.APPROVE_OPTION){
				File f = fc.getSelectedFile();
				imageTest.txt.setText(f.getAbsolutePath());
				imageTest.img = Toolkit.getDefaultToolkit().getImage(f.getAbsolutePath()) ;	
			}
		}
		imageTest.xcanvas.repaint();           
	}
}

class WindowHandler extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}	 

public class EditImage {
	public static void main(String[] args) {
		new ImageEditing("이미지 확대축소");
	}

}
