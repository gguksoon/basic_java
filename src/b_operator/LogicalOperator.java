package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {

		boolean b;
		int a = 6;

		// a가 0초과이고 10이하인가?
		b = a > 0 && a <= 10;

		// a가 2의 배수이거나 3의 배수인가?
		if (a % 2 == 0 || a % 3 == 0)
			b = true;
		else
			b = false;

		// a가 2의 배수이거나 3의 배수이고 10이하인가?
		if ((a % 2 == 0 || a % 3 == 0) && a <= 10)
			b = true;
		else
			b = false;
		// and 연산이 or 연산보다 빠르기 때문에 괄호로 묶어줘야 한다.

		char c = 'l';// 알파벳 l

		// c는 숫자인가?
		b = (c >= '0' && c <= '9');

		// c는 영문소문자인가?
		b = c >= 'a' && c <= 'z';

		// c는 영문자인가?
		b = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
		// 우선순위에 상관없이 괄호를 해주는 것이 가독성이 좋다.

		// 왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		b = true && true; // 수행o
		b = true && false; // 수행o
		b = false && true; // 수행x
		b = false && false; // 수행x

		b = true || true; // 수행x
		b = true || false; // 수행x
		b = false || true; // 수행o
		b = false || false; // 수행o

		int d = 10;
		b = d < 10 && 0 < d++; // d++ 연산이 수행되지 않는다.

		b = !b; // b가 true이면 false, false이면 true

		int x = 1, y = 2;
		b = x + 3 * y > y - 2 || x < 3 && y >= 5;
		// 우선순위: 산술연산 > 비교연산 > 논리연산
	}

}
