
/*
 * 	데이터 저장 (변수) ==== 데이터 가공 
 * 					  (연산자, 제어문) --> 메소드. 
 *  변수+메소드 --> 클래스 (객체지향 프로그램) 
 * 				==================
 * 					재사용, 수정, 추가 가능하게 제작해야.
 * 					===   ==   ===
 * 					상속   오버라이딩    오버로딩 
 * 				--> 설계 (인터페이스)
 * 				--> 데이터 여러개 저장 --> 자료구조
 * 	=============================== 라이브러리 
 * 
 * <연산자 (자바에서 제공하는 연산자)>
 *  
 * 1. 단항연산자
 * 	1) 증감연산자 (++, --)  : 한 개 증가, 한 개 감소
 * 		전치 연산자 vs 후치 연산자 구분 잘 해야.
 * 		전치 연산자 : ++a, --a : a를 먼저 증가시킨 후 다른 연산 수행. : a를 먼저 +1/-1 시킨다.
 * 		후치연산자 : a++, a-- : 다른 연산을 먼저 수행한 후 a를 나중에 증가시킴.: a를 나중에 +1/-1 시킨다.
 *  2) 부정연산자 (!) : boolean에서만 사용.
 *  	true→false 또는 false→true 로 변경.
 *  3) (type) : cast 연산자 (형변환 연산자)
 *  	byte < char < int < long < float < double 
 *  		   short    
 *  	자동 형변환 (upcasting) 
 *  		같은 데이터형만 연산이 가능하다. --> 데이터형이 다르면 자동으로, 표현크기가 큰 형으로, 형을 변환시켜버림.  
 *  		ex) 10.5 (double) + 10 (int) --> 10.5 (double) + 10.0 (int, 형변환) --> 20.5  
 *  		ex) 'A'(char) + 1 (int) --> 65(int, 형변환) + 1 (int) --> 66.
 *  	강제 형변환  (downcasting) 
 *  		형을 지정하는 것. 
 *  		ex) int(10.5) + 10 --> 20. : 10.5를 강제로 int로 변경했음. 
 *  
 * 2. 이항연산자	
 * 	1) 산술연산자 (+, -, *, /, %)
 * 	2) 비트연산자 (&, |, ^)
 * 		& (AND) : 직렬연산자. 
 * 		| (OR) : 병렬연산자. 
 * 	3) 쉬프트 연산자 (<<, >>) : 비트 이동 연산자. 
 * 		ex) x<<y --> x*(2^y) 하면 됨.  
 * 		ex) x>>y --> x/(2^y) 하면 됨.
 * 		ex) 40<<2 : 40 (101000, 이진법)을 왼쪽으로 2칸 이동시켜라 --> 10100000(2) = 160
 * 			간단한 계산방법 : 40*(2^2) = 160  <-- 왜냐면 2진법에서 2칸 왼쪽으로 이동시킨거니까 이진법 자리수가 2 증가한거잖아 그러니까 *(2^2)
 * 		ex) 35<<2 : 35 (100011(2))를 왼쪽으로 2칸 이동시켜라 --> 10001100 (2) = 140 
 * 			간단한 계산방법 : 35*(2^2) = 140
 * 		ex) 10>>4 : 2. 정수/정수니까 2(정수)이다. 
 * 	4) 비교연산자 (==, !=, <,  : 결과값이 항상 boolean임.
 * 		(1) == : 같다.
 * 			ex) 5==8 --> false. 
 * 		(2) != : 다르다
 * 		(3) < : 작다 (항상 왼쪽이 기준점이기 때문) 
 * 		(4) > : 크다 
 * 		(5) <= : 작거나 같다
 * 		(6) >= : 크거나 같다.
 * 	5) 논리연산자 (&&, ||) 
 * 		true && false --> false
 * 		true || false --> true  
 * 	6) 대입연산자 (=, +=, -=, *=, /=, .... op=) 
 * 
 * 3. 삼항연산자 (조건? 값1 : 값2)
 *	조건이  true일 경우 값 1을 가져옴
 *	조건이 false일 경우 값 2를 가져옴
 *	ex) 10%2==0?"짝수":"홀수" --> 짝수. --> if/else 구문으로 바꿀 수 있음.  
 * 
 * 
 * 4. 기타
 * 	ex) double d=123456.78
 * 		int a=(int)((d-123456)*100); 답이 int(0.78*100) = int(78.0) --> 78 아님!!!!
 * 		답은 77임!!
 * 		d-123456 했을 때, double : 4byte. 123456 : int. 3byte.
 *      자동형변환해서 0.78 (double) 되는거 아닌가?  
 * 		이걸 "부동소수점"이라고 한다.   
 * 
 * 
*/
public class 연산자_종합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
