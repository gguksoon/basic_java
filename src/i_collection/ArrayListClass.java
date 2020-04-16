package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {

		/*
		ㅁ ArrayList의 주요 메서드(교재 585p)
		   - add()    : 마지막 위치에 객체를 추가
		   - get()    : 지정된 위치의 객체를 반환
		   - set()    : 지정된 위치에 주어진 객체를 저장(수정)
		   - size()   : 저장된 객체의 수 반환
		   - remove() : 저장된 위치의 객체를 제거
		*/
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		// Object타입으로 만들어서 무엇이든 저장 가능
		list.add(10);
		list.add("ABC");
		list.add(true);
		list.add(new ArrayListClass()); // 현재 클래스의 객체도 저장 가능
		// 이렇게 저장하면 값을 가져올 때 무슨 타입인지 모르기 때문에 좋지 않은 방법이다.
		
		// String타입으로 생성
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456");
		
		for(int i = 0; i < list2.size(); i++)
			System.out.println("[" + i + "]" + list2.get(i));
		
		for(String i : list2)
			System.out.println(i);
		
		list2.remove(0);
		// 리스트에 저장된 값을 삭제하면 그 뒤의 모든 값의 인덱스가 당겨진다.
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		
		
		
		
		// 2차원 ArrayList
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>();
		
		// 위의 2차원 ArrayList에 들어갈 리스트
		ArrayList<Integer> list4 = new ArrayList<Integer>(); // list3의 0행
		list4.add(10);
		list4.add(20);
		list4.add(30);
		
		ArrayList<Integer> list5 = new ArrayList<Integer>(); // list3의 1행
		list5.add(40);
		list5.add(50);
		list5.add(60);
		
		list3.add(list4);
		list3.add(list5);
		
		// list3에 저장된 값을 꺼내서 출력해주세요.
		// 1-1
		for(int i = 0; i < list3.size(); i++)
			System.out.println(list3.get(i));
		
		// 1-2
		for(ArrayList<Integer> i : list3)
			for(Integer j : i)
				System.out.print(j + " ");
		System.out.println();
		
		// 1-3
		for(int i = 0; i < list3.size(); i++)
			for(int j = 0; j < list4.size(); j++)
				System.out.print(list3.get(i).get(j) + " ");
		System.out.println();
		
		// 1-4(선생님의 답)
		for(int i = 0; i < list3.size(); i++){
			ArrayList<Integer> list6 = list3.get(i);
			for(int j = 0; j < list6.size(); j++){
				System.out.print(list6.get(j) + " ");
			}
		}
		System.out.println("\n");
		
		
		
		
		
		// 문제1. 정수를 저장할 수 있는 ArrayList를 생성해 값을 3번 이상 넣어주세요.
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			al.add((int)(Math.random() * 100) + 1);
		}
		System.out.print("ArrayList al: ");
		for(Integer i : al)
			System.out.print(i + " ");
		System.out.println();
		
		

		
		
		// 문제2. 문제1에서 만든 ArrayList에 담긴 값들의 합계와 평균을 구해주세요.
		// (list3 안에 list4와 list5가 저장됨)
		int sum = 0;
		double avg = 0.0;
		for(Integer i : al){
			sum += i;
		}
		avg = ((int)(((double)sum / al.size() + 0.05) * 100)) / 100.0;
		System.out.println("합: " + sum + ", 평균: " + avg);
		

		
		
				
		// 문제3. 문제1에서 만든 ArrayList에 담긴 값들 중 최소값과 최대값을 구해주세요.
		int maxNum = al.get(0);
		int minNum = al.get(0);
		for(Integer i : al){
			if(i > maxNum)
				maxNum = i;
			if(i < minNum)
				minNum = i;
		}
		System.out.println("최대값: " + maxNum + ", 최소값: " + minNum);
		
	}

}
