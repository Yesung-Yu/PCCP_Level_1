
public class 시저암호 {
	class Solution {
	    public String solution(String s, int n) {
	        // 문자열을 문자 배열로 변환
	        char[] chars = s.toCharArray();

	        // 각 문자를 n만큼 밀어서 암호화
	        for (int i = 0; i < chars.length; i++) {
	            // 공백은 그대로 둠
	            if (chars[i] == ' ') {
	                continue;
	            }

	            // 대문자인 경우
	            if (Character.isUpperCase(chars[i])) {
	                chars[i] = (char) ((chars[i] - 'A' + n) % 26 + 'A');
	            }
	            // 소문자인 경우
	            else if (Character.isLowerCase(chars[i])) {
	                chars[i] = (char) ((chars[i] - 'a' + n) % 26 + 'a');
	            }
	        }

	        // 암호화된 문자 배열을 문자열로 변환하여 반환
	        return new String(chars);
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        String s = "AB";
	        int n = 1;
	        String encrypted = solution.solution(s, n);
	        System.out.println("Encrypted: " + encrypted); // 예상 출력: "BC"
	    }
	}
}
