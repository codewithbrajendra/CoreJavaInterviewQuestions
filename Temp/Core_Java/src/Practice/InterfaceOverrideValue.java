package Practice;

interface Foo {
	int BAR=42;

	void go();
}

class Zoo implements Foo {
	
	@Override
	public void go() {
		//error : final field BAR cannot be asigned
		//BAR=50;
		
	}
}

public class InterfaceOverrideValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final InterfaceOverrideValue obj = new InterfaceOverrideValue();
InterfaceOverrideValue obj2 = new InterfaceOverrideValue();
	}

}
