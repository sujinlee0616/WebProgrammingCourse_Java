// 사칙연산 
// + - * / 
public class 메소드12 {
	
	// 사용자가 직접 값을 넣어주게... 매개변수가 나옴...
	// ex) 계산기를 코딩... 두 정수와.. 연산자... 사용자가 직접 입력 할 수 있게...
	// 다른 프로그램과 연결 : 1) 매개변수 2) 리턴형 
	
	
	static void calc() {
		int a=10; int b=20;
		char op='-';
		if(op=='+') {
			System.out.println(a+b);
		}
		else if(op=='-') {
			System.out.println(a-b);
		}
		else if(op=='*') {
			System.out.println(a*b);
		}
		else if(op=='/') {
			if(b==0) 
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.println(a/b);
		}
		else {
			System.out.println("연산자가 잘못되었습니다.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc();
	}

}
