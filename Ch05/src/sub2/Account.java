package sub2;
/*
 * 
 * 
 * 
 * 캡슐화 
 * -캡슐화는 객체의 속성(필드)를 외부에서 참조하지 못하도록 객체의 정보를 은닉하는 특성
 * -클래스의 속성은 반드시 private 선언을 통해 캡슐화 해야한다.
 * -은닉된 정보의 안전한 참조를 위해 Getter,Setter를 정의한다.
 */
public class Account {

	
	// 속성
	private String bank;
	private String id;
	private String name;
	private int balance;
	
	public Account(String bank, String id, String name, int balance) {
	this.bank = bank;
	this.id = id;
	this.name = name;
	this.balance = balance;
	}
	// 기능
	public void deposit(int money)  {
		this.balance =+ money;
		
	}
	public void withdraw (int money)  {
	this.balance -= money;
	}
	public void show()  {
		System.out.println("------------");
		System.out.println("은행명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입금주 : "+name);
		System.out.println("현재잔액 : "+balance);
		System.out.println("-------------" );
	}
}
