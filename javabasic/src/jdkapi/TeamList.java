package jdkapi;

import java.util.ArrayList;

public class TeamList {
	public static void main(String[] args) {
		ArrayList<Team> epl = new ArrayList<Team>();
		
		//데이터 추가하기
		Team team = new Team();
		team.setTeamname("토트넘");
		team.setWin(5);
		team.setTie(1);
		team.setDefeat(5);
		team.setPlayers(new String[] {"손흥민", "케인"});
		
		epl.add(team);

		//새로운 데이터 생성해서 추가
		team = new Team();
		team.setTeamname("첼시");
		team.setWin(8);
		team.setTie(2);
		team.setDefeat(1);
		team.setPlayers(new String[] {"루카쿠", "햐베르츠"});
		
		epl.add(team);

		
		team = new Team();
		team.setTeamname("맨시티");
		team.setWin(7);
		team.setTie(2);
		team.setDefeat(2);
		team.setPlayers(new String[] {"페르난지뉴", "권도안"});
		
		epl.add(team);

		
		team = new Team();
		team.setTeamname("맨유");
		team.setWin(5);
		team.setTie(2);
		team.setDefeat(4);
		team.setPlayers(new String[] {"호날두", "포그바"});
	
		epl.add(team);
		
		//전체 데이터 개수
		System.out.println("팀 수:" + epl.size());
		System.out.println("===============================================");
		
		//데이터 전체 읽어오기
		//빠른 열거 사용
		for(Team t : epl) {
			System.out.print(t.getTeamname() + "\t");
			System.out.print(t.getPoints() + "\t");
			//내부에 배열이나 List가 있으면 다시 순회
			for(String player : t.getPlayers()) {
				System.out.print(player + " ");
			}
			System.out.println();
		}
		System.out.println("===============================================");
		
		//데이터 1개 가져오기
		//데이터 1개를 가져올 때는 인덱스 나 구분에 사용하는 키를
		//알아야 합니다.
		System.out.println(epl.get(0));
		
		System.out.println("===============================================");
		
	}
}

