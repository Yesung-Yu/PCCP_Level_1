import java.util.*;

public class 가운데_글자_가져오기 {

	class Solution {
	    public String solution(String s) {
	        int length = s.length();
	        int middleIndex = length / 2;

	        if (length % 2 == 0) {
	            // 길이가 짝수인 경우
	            return s.substring(middleIndex - 1, middleIndex + 1);
	        } else {
	            // 길이가 홀수인 경우
	            return s.substring(middleIndex, middleIndex + 1);
	        }
	    }
	}
}
