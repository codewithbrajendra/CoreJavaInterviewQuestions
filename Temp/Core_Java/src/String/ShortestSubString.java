package String;

import java.util.HashSet;

public class ShortestSubString {

	public static void main(String[] args) {
		String s = "adcadb";
		

		System.out.println(findShortest(s));
		
	}
	
	public static String findShortest(String str) {
		HashSet<Character> strSet = new HashSet<>();
		String longestOverAll = "";
		String longestTillNow = "";
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(strSet.contains(c)) {
				longestTillNow = "";
				strSet.clear();
			}
			strSet.add(c);
			longestTillNow+=c;
			
			if(longestTillNow.length()>longestOverAll.length()) {
				longestOverAll=longestTillNow;
			}
		}
		
		return longestOverAll;
	}

}
