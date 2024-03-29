package javagui;

import javax.swing.JFrame;

class JPanelTest extends JFrame{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel01 jpanel01 = null;
    public JPanel02 jpanel02 = null;
    
    public void change(String panelName){        // 패널 1번과 2번 변경 후 재설정
        
        if(panelName.equals("panel01")){
            getContentPane().removeAll();
            getContentPane().add(jpanel01);
            revalidate();
            repaint();
        }else {
            getContentPane().removeAll();
            getContentPane().add(jpanel02);
            revalidate();
            repaint();
        }
    }
    
    public static void main(String[] args) {
        
       JPanelTest win = new JPanelTest();            
        
        win.setTitle("frame test");
        win.jpanel01 = new JPanel01(win);
        win.jpanel02 = new JPanel02(win);
        
        win.add(win.jpanel01);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setSize(300,300);
        win.setResizable(false);
        win.setVisible(true);    
    }
}