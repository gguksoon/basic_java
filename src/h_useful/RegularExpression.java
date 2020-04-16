package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		< 정규표현식(Regular Expression): 문자열의 패턴을 검사하는 표현식 >
		- ^     뒷 문자로 시작
		- $     앞 문자로 종료
		- .     임의의 문자(줄바꿈 제외)
		- *     앞 문자가 0개 이상
		- +     앞 문자가 1개 이상
		- ?     앞 문자가 없거나 1개
		- []    문자의 집합이나 범위([a-z]: a부터 z까지, [^a-z]: a부터 z까지가 아닌 것)
		- {}    앞 문자의 개수({2}: 2개, {2,4}: 2개 이상 4개 이하)
		- ()    그룹화(1개의 문자처럼 인식)
		- |     OR 연산
		- \s    공백, 탭, 줄바꿈
		- \S    공백, 탭, 줄바꿈이 아닌 문자
		- \w    알파벳이나 숫자
		- \W    알파벳이나 숫자가 아닌 문자
		- \d    숫자
		- \d    숫자가 아닌 문자
		- (?i)  뒷 문자의 대소문자 구분 안함
		- \     정규표현식에서 사용되는 특수문자 표현
		
        - https://regexr.com
		*/
		
		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
		String regex = ".*";
		
		Pattern p = Pattern.compile(regex);
		
		// p와 매칭되는지 확인
		Matcher m = p.matcher(str);
		
		// 결과출력
		System.out.println(m.matches());
		
		// 아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		// 아이디: 최소 6글자 이상..10글자 이하 (영문+숫자)
		// 비번: 최소 8글자 이상.. (영문+숫자+특수문자)
		// 이메일: 영문 @ ~~~ . ~~~

		// 아이디: \\w{6,20}
		// 전화번호: ^0\\d{1,3}-\\d{3,4}-\\d{4}
		// 이메일: \\w{6,20}@[a-zA-Z]+\\.(?i)(com|net|org|[a-z]{2}\\.kr))$
		// 비밀번호: ^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@!%*#?&])[A-Za-z\\d$@!%*#?&]{8,}$
		
	}

}
