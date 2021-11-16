package javagui;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.*;

public class JTableTest extends JFrame
{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JTableTest()
	 {
         super("JTable 테스트");
         String title[] = {"번호", "이름", "나이"};
         String data[][] = {
             {"1","김   구 ", "40"},
             {"2","이순신", "41"},
             {"3","강감찬", "42"}
         };
         //JTable table = new JTable(data, title);
         DefaultTableModel model = new DefaultTableModel(data, title);
         JTable table = new JTable(model);
         JScrollPane sp = new JScrollPane(table);
         getContentPane().add(sp, BorderLayout.CENTER);
         setSize(300,150);
         setVisible(true);
     }
 }			
