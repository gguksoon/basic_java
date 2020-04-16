package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// java.util에 있는 Date를 import할 것
		Date today = new Date(); // 현재 날짜
//		System.out.println(today);
		
		// 날짜 -> 포맷 -> 문자열
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");   // 소문자는 12시간 포맷
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss"); // 대문자는 24시간 포맷
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd hh:mm:ss a"); // yy는 뒤에서부터 2개 출력(19)
        
//        System.out.println(sdf1.format(today));
//        System.out.println(sdf2.format(today));
//        System.out.println(sdf3.format(today));
//        System.out.println(sdf4.format(today));
        
        // 문자열 -> 포맷 -> 날짜
        String str = "2019년 5월 10일";
        SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
        try {
			Date dateStr = sdf5.parse(str);
			System.out.println(sdf1.format(dateStr));
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        // 날짜 지정하기
        Calendar cal = Calendar.getInstance(); // getInstance()는 싱글톤
        
        // 날짜 셋팅
        cal.setTime(new Date());
        cal.set(2019, 4, 5); // 2019/05/05(월은 0부터 시작)
        Date time = cal.getTime();
        System.out.println(sdf3.format(time));
        
        // 날짜 계산
        cal.add(Calendar.YEAR, 1); // year +1
        cal.add(Calendar.MONTH, 2); // month +2
        cal.add(Calendar.DAY_OF_MONTH,  -3); // day -3
        System.out.println(sdf3.format(cal.getTime()));
        cal.add(Calendar.HOUR, 2); // hour +2
        cal.add(Calendar.MINUTE, 5); // minute +5
        cal.add(Calendar.SECOND, -10); // second -10
        System.out.println(sdf3.format(cal.getTime()));
        
        
        
        
        
	}

}
