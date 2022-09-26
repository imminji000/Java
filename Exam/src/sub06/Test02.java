package sub06;
/*
 * 날짜: 2022/09/26
 * 이름: 임민지
 * 내용: 자바 총정리 연습문제
 * 
 * 원주율 공식
 * - 항수가 늘어날수록 정확도가 높아진다.
 */
public class Test02 {
	public static void main(String[] args) {
		boolean sign = false;
        double pi = 0;

        for (int i = 1; i <= 10000; i += 2)
        {
            if (sign == false)
            {
                pi += 1.0 / i;
                sign = true;
            }
            else
            {
                pi -= 1.0 / i;
                sign = false;
            }
            
            System.out.printf("i = %d, PI = %f\n", i, 4 * pi);
        }
	}
}