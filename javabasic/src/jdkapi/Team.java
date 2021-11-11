package jdkapi;

import java.util.Arrays;

class Team
{
	//팀의 번호를 자동으로 1증가시키도록 하기 위한 static 변수
	static int number;
	//static 초기화
	static { number = 0;} 
	
	public int teamnumber;
	public String teamname;
	public int win;
	public int tie;
	public int defeat;
	//win * 3 + tie * 1 로 계산되는 파생 속성
	public int points;
	//선수 명단
	public String [] players;
	
	//생성자 - 일련번호 생성
	public Team() {
		number = number + 1;
		teamnumber = number;
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Team.number = number;
	}

	public int getTeamnumber() {
		return teamnumber;
	}

	public void setTeamnumber(int teamnumber) {
		this.teamnumber = teamnumber;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getTie() {
		return tie;
	}

	public void setTie(int tie) {
		this.tie = tie;
	}

	public int getDefeat() {
		return defeat;
	}

	public void setDefeat(int defeat) {
		this.defeat = defeat;
	}

	//points는 파생 속성이므로 값을 가져갈 때 계산
	public int getPoints() {
		points = 3 * win + 1 * tie;
		return points;
	}

	//이 메서드는 필요 없음 직접 설정할 필요가 없기 때문
	public void setPoints(int points) {
		this.points = points;
	}

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}

	//디버깅을 위한 메서드
	@Override
	public String toString() {
		return "Team [teamnumber=" + teamnumber + ", teamname=" + teamname + ", win=" + win + ", tie=" + tie
				+ ", defeat=" + defeat + ", points=" + points + ", players=" + Arrays.toString(players) + "]";
	}
}
