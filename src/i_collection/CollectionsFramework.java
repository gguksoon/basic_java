package i_collection;

import java.util.ArrayList;

public class CollectionsFramework {

	public static void main(String[] args) {

		/*
		ㅁ CollectionsFramework
		   - Collections: 다수의 데이터
		   - Framework: 표준화된 프로그래밍 방식

		ㅁ List // 인터페이스
		   - Vector: ArrayList의 구버전				// 인터페이스를 구현해서 생성한 클래스들
		   - ★ArrayList: 저장순서 유지, 중복 허용
		   - LinkedList: (ArrayList보다 빨라짐)데이터 추가 및 삭제시간 단축
		   		> ArrayList는 읽는게 빠름, LinkedList는 추가삭제가 빠름
		   		> 인덱스와 저장순서는 같음
		   - Stack: LIFO(Last In First Out)
		   - Queue: FIFO(First In First Out)

		ㅁ Set // 인터페이스
		   - HashSet: 중복 허용 안함, 저장순서 유지 안함	// 인터페이스를 구현해서 생성한 클래스들
		   - TreeSet: HashSet에서 정렬, 검색 기능 향상

		ㅁ Map // 인터페이스
		   - HashTable: HashMap의 구버전			// 인터페이스를 구현해서 생성한 클래스들
		   - ★HashMap: 키(key)와 값(value)을 한쌍으로 저장
		   - TreeMap: 정렬, 검색 기능 향상
		   
		 Array와 HashMap 위주로 학습할 것.
		 */
		
		// 문제(ArrayListClass.java와 HashMapClass.java를 이용)
		score();
	}
	
	private static void score(){
		// 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를 50~100까지 랜덤으로 생성시켜주시고,
		// 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		
		// 석차	이름		Java	Oracle	HTML	CSS	JQeury	JSP	총점	평균
		// 1   	차주환 	100	 	100 	100 	100 100 	100 100 100
		// 2  	노현아	90		90		90		90  90		90  90  90
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		stuList.add(new Student("차주환"));
		stuList.add(new Student("노현아"));
		stuList.add(new Student("강진구"));
		stuList.add(new Student("조하경"));
		stuList.add(new Student("홍다은"));
		stuList.add(new Student("김소리"));
		stuList.add(new Student("전민규"));
		stuList.add(new Student("류우찬"));
		stuList.add(new Student("김혜인"));
		stuList.add(new Student("이다혜"));
		stuList.add(new Student("박채은"));
		stuList.add(new Student("조민수"));
		
		rank(stuList);
		
		sort(stuList);
		
		System.out.println("석차\t이름\tJava\tOracle\tHTML\tCSS\tJQeury\tJSP\t총점\t평균");
		System.out.println("===============================================================================");
		for(Student i : stuList)
			System.out.println(i.toString());
		
		
	}
	
		

	private static void rank(ArrayList<Student> stuList){
		for(Student i : stuList){
			i.rank++;
			for(Student j : stuList)
				if(i.subject.sum < j.subject.sum)
					i.rank++;
		}
	}
	
	private static void sort(ArrayList<Student> stuList) {
		for(int i = 0; i < stuList.size() - 1; i++){
			for(int j = 1 + i; j < stuList.size(); j++){
				if(stuList.get(j).subject.sum > stuList.get(i).subject.sum){
					Student temp = stuList.get(i);
					stuList.set(i, stuList.get(j));
					stuList.set(j, temp);
				}
			}
		}
	}
}

class Student{
	int rank;
	String name;
	Subject subject = new Subject();
	
	Student(String name){
		this.name = name;
	}
	
	Student(){
		this(null);
	}
	
	@Override
	public String toString() {
		return rank + "\t"
				+ name + "\t"
				+ subject.java + "\t"
				+ subject.oracle + "\t"
				+ subject.html + "\t"
				+ subject.css + "\t"
				+ subject.jquery + "\t"
				+ subject.jsp + "\t"
				+ subject.sum + "\t"
				+ subject.avg + "\t";
	}
}

class Subject{
	int java;
	int oracle;
	int html;
	int css;
	int jquery;
	int jsp;
	int sum;
	double avg;
	
	Subject(){
		java = (int) (Math.random() * 51) + 50;
		oracle = (int) (Math.random() * 51) + 50;
		html = (int) (Math.random() * 51) + 50;
		css = (int) (Math.random() * 51) + 50;
		jquery = (int) (Math.random() * 51) + 50;
		jsp = (int) (Math.random() * 51) + 50;
		sum = java + oracle + html + css + jquery + jsp;
		avg = sum / 6.0;
		avg = Math.round(avg / .01) * .01;
	}
}