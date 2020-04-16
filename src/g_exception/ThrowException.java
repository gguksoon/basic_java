package g_exception;

import java.io.IOError;
import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		/*
		< 예외 발생시키기 >
		   - throw new Exception();
		   - throw 키워드와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다.
		*/
		IOException ioe = new IOException();
		
		try {
			// 예외를 고의로 발생시킬 수 있다.
			throw ioe;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// RuntimeException의 자식들은 예외처리가 강제되지 않는다.
		throw new NullPointerException("예외 발생시켜 봆디ㅏ~");
		
//		System.out.println("여기는 수행되지 안ㅇㅎ아요.");
	}

}
