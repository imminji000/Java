package sub2;

/*
 * 날짜 : 2022/08/24
 * 이름 : 임민지
 * 내용 : Java 캡슐화 연습하기
 */

public class EncapsuleTest {
	
	public static void main(String[] args) {
		
		//객체 생성과 초기화
		Car sonata = new Car("소나타", "흰색",0);
		
		//Setter를 통한 속성 변경
		sonata.setColor("은색");
		
		//기능
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		//Account 객체 생성과 초기화
		Account kb = new Account("국민은행","101-11-1001","김유신",0);
		
		//기능
		kb.deposit(100000);
		kb.withdraw(35000);
		kb.show();
		
		
		
		
	}



}
