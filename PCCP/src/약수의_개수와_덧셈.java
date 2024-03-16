import java.util.*;

public class 약수의_개수와_덧셈 {
	
	class Solution {
	    public int solution(int left, int right) {
	        int answer = 0;

	        for (int num = left; num <= right; num++) {
	            int divisorCount = countDivisors(num);
	            if (divisorCount % 2 == 0) {
	                // 약수의 개수가 짝수인 경우
	                answer += num;
	            } else {
	                // 약수의 개수가 홀수인 경우
	                answer -= num;
	            }
	        }

	        return answer;
	    }

	    // 약수의 개수를 세는 메서드
	    private int countDivisors(int num) {
	        int count = 0;
	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                count++;
	            }
	        }
	        return count;
	    }
	}
	
}
