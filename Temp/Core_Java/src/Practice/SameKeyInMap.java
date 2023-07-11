package Practice;

import java.util.HashMap;
import java.util.Map;

public class SameKeyInMap {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("abc","1");
        map.put("abc", "2");
        System.out.println("OutPut is : "+map.get("abc"));
	}

}
