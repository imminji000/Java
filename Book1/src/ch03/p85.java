package ch03;

public class p85 {

	public static void main(String[] args) {
		int num = 0B00000101; //5를 8비트 2진수로 나타냄
		
		System.out.println(num << 2); //왼쪽으로 2비트 이동 
		System.out.println(num >> 2); // 오른쪽으로 2 비트 이동
		System.out.println(num >>>2); //오른쪽으로 2비트 이동
		
		System.out.println(num);
		
		num = num <<2; //왼쪽으로 이동한 값을 다시 num에 대입
		System.out.println(num);
	}
}
