package cn.zmy.day19;

@SuppressWarnings("serial")
public class MyFirstException extends RuntimeException {

	public MyFirstException () {}
	
	public MyFirstException(String message) {
		super(message);
	}

}
