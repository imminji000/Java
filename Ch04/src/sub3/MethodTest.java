package sub3;

/*
 * 날짜 : 2022/08/23
 * 이름 : 임민지
 * 내용 :Java 매서드 실습하기
 */
public class MethodTest {

	public static void main(String[] args) {
		
		int r1 = f(1);
		int r2 = f(2);
		int r3 = f(3);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		
		
	}// main end
	
	 // f 함수 정의
	public static int f(int x) {
		int y= 2 * x + 3;
		return y;
    }//f메서드 end
	
	
	
}
