package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HashMapClass {

	public static void main(String[] args) {

		/*
		ㅁ HashMap의 주요 메서드(교재 645p)
	 	  - put()    : 지정된 키와 값을 저장
		     > put(key, value)
		  - remove() : 저장된 키로 저장된 값을 제거
		     > remove(key)
		  - get()    : 지정된 키의 값을 반환(없으면 null)
		     > get(key)
		  - keySet() : 저장된 모든 키를 Set으로 반환
		     > 모든 key를 Set형태로 반환(출력할 때)
		*/
		
		// HashMap<Key(일반적으로 String), Value>
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 저장
		map.put("title", "안녕하세요");
		map.put("content", "그냥 작성");
		map.put("user", "강승구");
		
		System.out.print(map.get("title") + " ");
		System.out.print(map.get("content") + " ");
		System.out.println(map.get("user"));
		
		// 위에서 user에 강승구를 저장했었음
		// 홍길동을 넣으면 user의 값에 홍길동이 덮어쓰기 된다.
		map.put("user", "홍길동");
		System.out.println(map.get("user"));
		
		map.remove("user");
		System.out.println(map.keySet());
		
		// map에 저장된 모든 내용 출력
		Set<String> set = map.keySet(); // [key1, key2, key3]등을 set에 저장
		Iterator<String> itr = set.iterator(); // 컬렉션의 표준화된 출력방법
		// Iterator는 출력하는 방법으로, 동일한 방법으로 출력하고 싶을 때 사용한다.
		
		// itr.hasNext(): 0번인덱스부터 ++하며 다음 인덱스에 값이 있는지 확인
		// (값이 있으면 true, 없으면 false)
		while(itr.hasNext()){
			String key = itr.next(); // 값을 가져오기
			String value = map.get(key); // key를 이용해 value를 가져오기
			System.out.println(key + ": " + value); 
		}
		
		for(String i : map.keySet()){
			System.out.println(i);
		}
		
		
		// 게시판 만들기
		ArrayList<HashMap<String, Object>> table = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> row = new HashMap<String, Object>();
		
		row.put("no", 1);
		row.put("title", "제목");
		row.put("user", "김승섭");
		row.put("date", "2019-05-13");
	
		table.add(row);
		
		
		
		
		
		// 문제1. 3명의 아이디, 비밀번호, 이름을 ArrayList와 HashMap을 사용해 저장 후 출력해주세요.
		ArrayList<HashMap<String, Object>> table2 = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> row2 = new HashMap<String, Object>();
		
		// 입력
		row2.put("id", "mingsoo0807");
		row2.put("pw", "12345678");
		row2.put("name", "조민수");
		table2.add(row2); // 입력1
		
		row2 = new HashMap<String, Object>();
		row2.put("id", "ksk121");
		row2.put("pw", "1q2w3e4r");
		row2.put("name", "캉승쿠");
		table2.add(row2); // 입력2	
		
		row2 = new HashMap<String, Object>();
		row2.put("id", "1");
		row2.put("pw", "2");
		row2.put("name", "3");
		table2.add(row2); // 입력3
		
		// 출력
		System.out.println("=============================");
		for(int i = 0; i < table2.size(); i++){
			HashMap<String, Object> tm = table2.get(i);
			Iterator<String> itr2 = tm.keySet().iterator();
			while(itr2.hasNext()){
				String key2 = itr2.next();
				Object value2 = tm.get(key2);
				System.out.println(key2 + ": " + value2);
			}
			System.out.println("=============================");
		}
			
		
		
		
		
		
		
		
	}

}
