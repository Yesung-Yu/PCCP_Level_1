import java.util.*;

public class 문자열_내림차순_배치하기 {

	class Solution {
	    public String solution(String s) {
	        // 문자열을 char 배열로 변환
	        Character[] charArray = new Character[s.length()];
	        for (int i = 0; i < s.length(); i++) {
	            charArray[i] = s.charAt(i);
	        }

	        // char 배열을 역순으로 정렬
	        Arrays.sort(charArray, Collections.reverseOrder());

	        // 정렬된 char 배열을 문자열로 변환
	        StringBuilder sb = new StringBuilder();
	        for (Character c : charArray) {
	            sb.append(c);
	        }

	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        Solution sl = new Solution();
	        String s = "Zbcdefg";
	        System.out.println(sl.solution(s)); // "gfedcbZ"
	    }
	}
}
