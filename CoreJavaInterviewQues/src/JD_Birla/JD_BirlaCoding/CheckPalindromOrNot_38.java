package JD_Birla.JD_BirlaCoding;

import java.util.stream.IntStream;

public class CheckPalindromOrNot_38 {

    public static void main(String[] args) {
        String str = "ROTATOR";
        Boolean val = IntStream.range(0, str.length()/2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
        if(val) {
            System.out.println(str+" is Palindrome String");
        } else {
            System.out.println(str+" is not Palindrome String");
        }
    }


}
