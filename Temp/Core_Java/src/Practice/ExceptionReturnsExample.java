package Practice;

class MyException1 {
	
	public int m1() {
		
		try {
			return 10;
		}catch(Exception e) {
			return 15;
		}
		
		/*finally {
			return 20;
		}*/
		
	}
}

class MyException2 {
	
	public int m1() {
		try {
			int i = 50/0;
			return 25;
		}catch(Exception e) {
			return 30;
		}
		/*finally {
			return 35;
		}*/
	}
}

public class ExceptionReturnsExample {

	public static void main(String[] args) {
		MyException1 obj1 = new MyException1();
		MyException2 obj2 = new MyException2();
		//Output :- finally call always if exception is occur or not.If finally code is not write then out put is given as per code
		//For e.g - MyException1 output is 10, MyException2 output is 30
        System.out.println("MyException1 output is "+obj1.m1());
        System.out.println("MyException2 output is "+obj2.m1());
	}

}
