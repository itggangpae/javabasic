package javagui;

import javax.swing.*;
import java.awt.*; 
import javax.swing.border.*;

public class BoxLayoutTest extends JFrame {
	private static final long serialVersionUID = 1L;

	public BoxLayoutTest(){
		super( "BoxLayout연습예제" );
		JRadioButton r1,r2;

		//수직 배치 박스 레이아웃을 생성
		Box left = Box.createVerticalBox();
		//보기 좋게 배치하기 위래 투명 Component로 공간 확보
		left.add(Box.createVerticalStrut(30)); 
		//라디오버튼을 위한 버튼 그룹 생성
		ButtonGroup radioGroup = new ButtonGroup();
		//버튼 인스턴스를 생성 후 버튼 그룹에 추가
		radioGroup.add(r1 = new JRadioButton("야구")); 
		//버튼 인스턴스를 Box인스턴스 left에 추가
		left.add(r1);                                  
		left.add(Box.createVerticalStrut(30));              
		radioGroup.add(r2 = new JRadioButton("축구"));
		left.add(r2);


		//Box인스턴스 left를 패널에 추가
		JPanel leftPanel = new JPanel(new BorderLayout());
		//패널의 테두리선을 에칭효과로 지정
		leftPanel.setBorder(
				new TitledBorder( new EtchedBorder(),"스포츠"));       
		leftPanel.add(left, BorderLayout.CENTER);

		//수직으로 배치하는 박스레이아웃 생성
		Box right = Box.createVerticalBox();
		right.add(Box.createVerticalStrut(30));  
		//체크박스를 생성해 박스레이아웃에 추가
		right.add(new JCheckBox("C언어"));
		right.add(Box.createVerticalStrut(30));             
		right.add(new JCheckBox("Java"));
		right.add(Box.createVerticalStrut(30));             
		right.add(new JCheckBox("C#"));
		right.add(Box.createVerticalStrut(30));             
		right.add(new JCheckBox("Phython"));

		JPanel rightPanel = new JPanel(new BorderLayout());
		rightPanel.setBorder(
				new TitledBorder(new EtchedBorder(), "프로그래밍 언어"));  
		rightPanel.add(right, BorderLayout.CENTER);

		//수평으로 배치하는 박스레이아웃을 생성해
		//패널leftPanel과 rightPanel을 이 박스 레이아웃에 배치
		Box center = Box.createHorizontalBox();
		center.add(leftPanel);
		center.add(rightPanel);
		add(center,  BorderLayout.CENTER);

		setSize(300,300);
		setVisible(true);
	}
}
