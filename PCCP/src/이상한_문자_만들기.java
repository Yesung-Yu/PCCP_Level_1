//아 이거 안풀리네 주말에 한번 더 ㄱㄱㄱㄱ
public class 이상한_문자_만들기 {
	class Solution {
	    public String solution(String s) {
	        StringBuilder answer = new StringBuilder();

	        // 문자열을 공백을 기준으로 단어로 나누기
	        String[] words = s.split(" ");

	        // 각 단어에 대해 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 변환하여 answer에 추가
	        for (String word : words) {
	            for (int i = 0; i < word.length(); i++) {
	                char ch = word.charAt(i);
	                if (i % 2 == 0) {
	                    answer.append(Character.toUpperCase(ch)); // 짝수번째 알파벳은 대문자로 변환
	                } else {
	                    answer.append(Character.toLowerCase(ch)); // 홀수번째 알파벳은 소문자로 변환
	                }
	            }
	            answer.append(" "); // 단어 사이에 공백 추가
	        }

	        // 마지막 공백 제거
	        answer.setLength(answer.length() - 1);

	        return answer.toString();
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        String s = "try hello world";
	        System.out.println(solution.solution(s)); // "TrY HeLlO WoRlD"
	    }
	}
}
