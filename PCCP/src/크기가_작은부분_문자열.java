
public class 크기가_작은부분_문자열 {
	class Solution {
	    public int solution(String t, String p) {
	        int answer = 0;
	        int tLength = t.length();
	        int pLength = p.length();

	        // t의 부분 문자열 중에서 p와 길이가 같은 부분문자열을 비교하여 개수를 센다
	        for (int i = 0; i <= tLength - pLength; i++) {
	            String sub = t.substring(i, i + pLength); // t의 부분 문자열 추출
	            if (isLessThanOrEqualTo(sub, p)) { // 부분 문자열이 p 이하인지 확인
	                answer++;
	            }
	        }

	        return answer;
	    }

	    // 문자열 a가 b보다 작거나 같은지 확인하는 메소드
	    private boolean isLessThanOrEqualTo(String a, String b) {
	        // 문자열의 길이가 같을 때, 문자열을 비교하여 작거나 같은지 확인
	        if (a.length() == b.length()) {
	            return a.compareTo(b) <= 0;
	        }
	        // 문자열의 길이가 다를 때, 두 문자열을 숫자로 변환하여 비교
	        long numA = Long.parseLong(a);
	        long numB = Long.parseLong(b);
	        return numA <= numB;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        String t = "3141592";
	        String p = "271";
	        System.out.println(solution.solution(t, p)); // 2
	    }
	}
}