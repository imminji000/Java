package ch04;

public class p116 {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2; dan <=9; dan++) {
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan);
			}
			System.out.println(); //한 줄 띄어서 출력
		}
	}
}
