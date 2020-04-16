package h_useful;

public class StringClass {

	public static void main(String[] args) {

		// String(String s)
		// : 주어진 문자열(s)을 갖는 String인스턴스를 생성한다.
//		String s = new String("Hello");
//		System.out.println(s);
		
		// String(char[] value)
		// : 주어진 문자열(value)을 갖는 String인스턴스를 생성한다.
//		char[] c = {'H', 'e', 'l', 'l', 'o', '2'};
//		String s = new String (c);
//		System.out.println(s);
		
		// String(StringBuffer buf)
		// : StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String인스턴스를 생성한다.
//		StringBuffer sb = new StringBuffer("Hello3");
//		String s = new String(sb);
//		System.out.println(s);
		
		// char charAt(int index)
		// : 지정된 위치(index)에 있는 문자를 알려준다.(index는 0부터 시작)
//		String s = "Hello4";
//		String n = "0123456";
//		System.out.println(s.charAt(1));
//		System.out.println(n.charAt(1));
		
		// int compareTo(String str)
		// : 문자열(str)과 사전순서로 비교한다. 사전순으로 이전이면 음수, 이후면 양수, 같으면 0을 반환한다.
//		System.out.println("aaa".compareTo("bbb"));
//		System.out.println("bbb".compareTo("aaa"));
//		System.out.println("aaa".compareTo("aaa"));
		
		// String concat(String str)
		// : 문자열(str)을 뒤에 덧붙인다.
//		System.out.println("Hello".concat(" World!"));

		// boolean contains(CharSequence s)
		// : 지정된 문자열(s)이 포함되었는지 검사한다.
//		String s = "abcedfg";
//		System.out.println(s.contains("bc"));
//		System.out.println(s.contains("de"));
		
		// boolean endsWith(String suffix)
		// : 지정된 문자열(suffix)로 끝나는지 검사한다.
//		String file = "Hello.txt";
//		System.out.println(file.endsWith("txt"));
//		System.out.println(file.endsWith(".tx"));
		
		// boolean equals(Object obj)
		// : 매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다.
		//   obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
//		String s = "Hello";
//		System.out.println(s.equals("Hello"));
//		System.out.println(s.equals("hello"));
		
		// boolean equalsIgnoreCase(String str)
		// : 문자열과 String인스턴스의 문자열을 대소문자 구분없이 비교한다.
//		String s = "Hello";
//		System.out.println(s.equalsIgnoreCase("HELLO"));
//		System.out.println(s.equalsIgnoreCase("heLLo"));
		
		// int indexOf(int ch)
		// : 주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다.
		//   못 찾으면 -1을 반환한다.(index는 0부터 시작)
//		String s = "Hello";
//		System.out.println(s.indexOf('e'));
//		System.out.println(s.indexOf('o'));
		
		// int indexOf(int ch, int pos)
		// : 주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치(index)를 알려준다.
		//   못 찾으면 -1을 반환한다.(index는 0부터 시작)
//		String s = "Hello";
//		System.out.println(s.indexOf('e', 0));
//		System.out.println(s.indexOf('e', 2));
		
		// int indexOf(String str)
		// : 주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다.
		//   없으면 -1을 반환한다.(index는 0부터 시작)
//		String s = "ABCDEFG";
//		System.out.println(s.indexOf("EF"));
		
		// String intern()
		// : 문자열을 상수풀(constant pool)에 등록한다.
		//   이미 상수풀에 같은 내용의 문자열이 있을 경우 그 문자열의 주소값을 반환한다.
//		String s = new String("abc");
//		String s2 = new String("abc");
//		System.out.println("s==s2: " + (s==s2));
//		System.out.println("s.equals(s2): " + (s.equals(s2)));
//		System.out.println("s.intern()==s2.intern(): " + (s.intern()==s2.intern()));
		
		// int lastIndexOf(int ch)
		// : 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치(index)를 알려준다.
		//   못 찾으면 -1을 반환한다.
//		String s = "java.lang.Object";
//		System.out.println(s.lastIndexOf('.'));
//		System.out.println(s.indexOf('.'));
		
		// int lastIndexOf(String str)
		// : 지정된 문자열을 문자열의 오른쪽 끝에서부터 찾아서 위치(index)를 알려준다.
		//   못 찾으면 -1을 반환한다.
//		String s = "java.lang.java";
//		System.out.println(s.lastIndexOf("java"));
//		System.out.println(s.indexOf("java"));
		
		// int length()
		// : 문자열의 길이를 알려준다.
//		System.out.println("hello".length());
		
		// String replace(char old, char nw)
		// : 문자열 중의 문자(old)를 새로운 문자(nw)로 모두 바꾼 문자열을 반환한다.
//		System.out.println("Hello".replace('l', 'C'));
		
		// String replace(CharSequence old, CharSequence nw)
		// : 문자열 중의 문자열(old)을 새로운 문자열(nw)로 모두 바꾼 문자열을 반환한다.
//		System.out.println("Hellollo".replace("ll", "LL"));
		
		// String replaceAll(String regex, String replacement)
		// : 문자열 중에서 지정된 문자열(regex)과 일치하는 것을
		//   새로운 문자열(replacement)로 모두 변경한다.
//		System.out.println("AABBAABB".replaceAll("BB", "bb"));
		
		// String replaceFirst(String regex, String replacement)
		// : 문자열 중에서 지정된 문자열(regex)과 일치 하는 것 중,
		//   첫 번째 것만 새로운 문자열(replacement)로 변경한다.
//		System.out.println("AABBAABB".replaceFirst("BB", "bb"));
		
		// String[] split(String regex)
		// : 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
//		String animals = "dog,cat,bear";
//		String[] arr = animals.split(",");
//		for(int i = 0; i < arr.length; i++)
//			System.out.println("str[" + i + "]: " + arr[i]);
		
		// String[] split(String regex, int limit)
		// : 문자열을 지정된 분리자(regex)로 나누어 문자열배열에 담아 반환한다.
		//   단, 문자열 전체를 지정된 수(limit)로 자른다.
//		String animals = "dog,cat,bear";
//		String[] arr = animals.split(",", 2);
//		for(int i = 0; i < arr.length; i++)
//			System.out.println("str[" + i + "]: " + arr[i]);		
		
		// boolean startsWith(String prefix)
		// : 주어진 문자열(prefix)로 시작하는지 검사한다.
//		String s = "java.lang.object";
//		System.out.println(s.startsWith("java"));
//		System.out.println(s.startsWith("object"));
		
		// String substring(int begin)
		// String substring(int begin, int end)
		// : 주어진 시작위치(begin)부터 끝 위치(end) 범위에 포함된 문자열을 얻는다.
		//   이 때, 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다.
		//   (begin <= x < end)
//		String s = "java.lang.Object";
//		System.out.println(s.substring(10));
//		System.out.println(s.substring(5, 9));
		
		// String toLowerCase()
		// : String인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환한다.
//		System.out.println("Hello".toLowerCase());
		
		// String toUpperCase()
		// : String인스턴스에 저장되어있는 모든 문자열을 대문자로 변환하여 반환한다.
//		System.out.println("Hello".toUpperCase());
		
		// String toString()
		// : String인스턴스에 저장되어 있는 문자열을 반환한다.
//		String s = "Hello";
//		String s1 = s.toString();
//		System.out.println("s : " + s);
//		System.out.println("s1: " + s1);
//		System.out.println("s==s1: " + s==s1);
		
		// String trim()
		// : 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다.
		//   이 때 문자열 중간에 있는 공백은 제거되지 않는다.
//		System.out.println("       Hello  ".trim());
		
		// static String valueOf(boolean b)
		// static String valueOf(char c)
		// static String valueOf(int i)
		// static String valueOf(long l)
		// static String valueOf(float f)
		// static String valueOf(double d)
		// static String valueOf(Object o)
		// : 지정된 값을 문자열로 변환하여 반환한다.
		//   참조변수의 경우, toString()을 호출한 결과를 반환한다.
		// * String.valueOf(여러타입); 을 쓰면 String 타입으로 변환됨.
//		String b = String.valueOf(true);
//		System.out.println(b);
//		String c = String.valueOf('a');
//		System.out.println(c);
//		String i = String.valueOf(100);
//		System.out.println(i);
//		String l = String.valueOf(100L);
//		System.out.println(l);
//		String f = String.valueOf(10f);
//		System.out.println(f);
//		String d = String.valueOf(10.0);
//		System.out.println(d);
//		java.util.Date dd = new java.util.Date();
//		String date = String.valueOf(dd);
//		System.out.println(date);
		
		
		
		
	}

}

