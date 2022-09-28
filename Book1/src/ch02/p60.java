package ch02;

/* 날짜 : 2022/08/18
 * 이름 : 임민지
 * 내용 : 자료형 추론 
 */


public class p60 {
  public static void main(String[] args) {
	var i = 10; //int i = 10으로 컴파일링
	var j = 10.0; //double j =10.0으로 컴파일링
	var str = "hello"; //String str = "hello"로 컴파일됨
	
	System.out.println(i);
	System.out.println(j);
	System.out.println(str);
	
	str = "test"; //다른 문자열을 대입 가능
	//str = 3; (String 변수는 String으로 먼저 사용되었기에 정수 값을 넣을 수 없음)
	
}
}
