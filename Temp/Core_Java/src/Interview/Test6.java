package Interview;

class Helper {
	private int data;

	private Helper() {
		data = 5;
	}
}

public class Test6 {
	public static void main(String[] args) {
		Helper help = new Helper();
		System.out.println(help.data);
	}
}
