package sub03;



/*
 * 날짜 : 2022/09/02
 * 이름 : 임민지
 * 내영 : 클래스 상속 연습문제
 */

class Rent {
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}

class Landload extends Rent {
	
	public void getMoney() {
		System.out.println("건물주 입니다.");
		payment();
	}
}

public class Test06 {
	public static void main(String[] args) {	
		Landload master = new Landload();
		master.getMoney();		
	}	
}