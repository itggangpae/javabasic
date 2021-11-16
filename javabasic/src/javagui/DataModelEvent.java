package javagui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

class AddActionListener implements ActionListener
{
 
	JTable table;
	JTextField text;
	JComboBox <String>combo;
	AddActionListener(JTable table, JTextField text, JComboBox<String> combo) 
	{
		this.table = table;
		this.text = text;
		this.combo = combo;
	}

	public void actionPerformed(ActionEvent e)
	{
		String arr[] = new String[2];
		arr[0] = text.getText();
		arr[1] = (String)combo.getSelectedItem();
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addRow(arr);
	}
}

class RemoveActionListener implements ActionListener
{
	JTable table;
	RemoveActionListener(JTable table)
	{
		this.table = table;
	}
 
	public void actionPerformed(ActionEvent e)
	{
		int row = table.getSelectedRow();
		if ( row == -1)
		{
			JOptionPane.showMessageDialog(null,"삭제 오류","선택된 행이 없음",JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.removeRow(row);
	}
}


public class DataModelEvent extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataModelEvent() {
		String rows[][] = { { "윤석민", "야구" }, { "이동국", "축구" }, { "문성민", "배구" } };
		String headers[] = { "이름", "종목" };
		String sports[] = { "야구", "축구", "배구", "기타" };

		setTitle("JTable Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTable table = new JTable(new DefaultTableModel(rows, headers));

		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		JTextField text = new JTextField(12);
		JComboBox<String> comboBox = new JComboBox<String>(sports);
		comboBox.setMaximumRowCount(4);

		JButton btn1 = new JButton("삽입");
		JButton btn2 = new JButton("삭제");

		btn1.addActionListener(new AddActionListener(table, text, comboBox));
		btn2.addActionListener(new RemoveActionListener(table));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.add(new JLabel("이름"));
		panel.add(text);
		panel.add(new JLabel("종목"));
		panel.add(comboBox);

		panel.add(btn1);
		panel.add(btn2);

		add("South", panel);

		setSize(500, 150);
		setVisible(true);
	}
}
