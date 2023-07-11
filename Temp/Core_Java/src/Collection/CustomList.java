package Collection;

import java.util.Arrays;

public class CustomList {

	private Object[] items;
	
	private int count;
	
	public CustomList() {
		System.out.println("Inside CustomList constructor.");
		count=0;
		items = new Object[10];
	}
	
	public boolean add(Object item) {
		count = count + 1;
		items[count] = item;
		return true;
	}

	@Override
	public String toString() {
		return "CustomList [items=" + Arrays.toString(items) + "]";
	}
	
	
}
