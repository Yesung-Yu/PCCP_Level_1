
public class 문자열_다루기_기본 {
	class Solution {
	    public boolean solution(String s) {
	        if (s.length() != 4 && s.length() != 6) {
	            return false; // 길이가 4 혹은 6이 아니면 숫자로만 구성되지 않음
	        }

	        for (char c : s.toCharArray()) {
	            if (!Character.isDigit(c)) {
	                return false; // 숫자가 아닌 문자가 포함되어 있음
	            }
	        }

	        return true; // 조건을 모두 만족하면 숫자로만 구성됨
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        String s1 = "a234";
	        String s2 = "1234";
	        System.out.println(solution.solution(s1)); // false
	        System.out.println(solution.solution(s2)); // true
	    }
	}
}
