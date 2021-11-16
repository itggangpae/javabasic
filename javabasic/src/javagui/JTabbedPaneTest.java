package javagui;

import java.awt.*;
import javax.swing.*;

class JTable1 extends JPanel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JTable1(){
        String title[] = {"번호", "이름", "나이"};
        String data[][] = {
            {"1","박문석", "40"},
            {"2","이종범", "40"},
            {"3","강호동", "40"}
        };
        JTable table = new JTable(data, title);
        JScrollPane sp = new JScrollPane(table);
       add(sp);		 
    }
}
class JTable2 extends JPanel {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public JTable2(){
       String title[] = {"번호", "직업", "소속"};
        String data[][] = {
            {"1","프로그래머", "프리랜서"},
            {"2","야구선수", "KIA"},
            {"3","MC", "프리랜서"}
        };
        JTable table = new JTable(data, title);
        JScrollPane sp = new JScrollPane(table);
        add(sp);		 
    }
}

public class JTabbedPaneTest extends JFrame{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTabbedPane tab;
     JTable1 j1;
	 JTable2 j2;
     public JTabbedPaneTest()
	{
         super("JTabbedPane 연습예제");
         tab = new JTabbedPane(JTabbedPane.TOP);

         JPanel one = new JPanel();
		 j1 = new JTable1();
         JPanel two = new JPanel();
		 j2 = new JTable2();
 
         one.add(j1);
        two.add(j2);

        tab.addTab("기본 데이터", one);
        tab.addTab("기타 데이터", two);

        getContentPane().add(tab, BorderLayout.CENTER);
        setSize(500,200);
        setVisible(true);
    }
}           								