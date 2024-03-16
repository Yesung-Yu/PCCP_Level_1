import java.util.*;

public class 삼총사 {

	class Solution {
	    public int solution(int[] number) {
	        int answer = 0;
	        int n = number.length;

	        // 비트 마스크를 이용하여 모든 부분집합을 생성하고, 합을 계산하여 0인 경우를 찾는다.
	        for (int i = 1; i < (1 << n); i++) {
	            int sum = 0;
	            int count = 0;
	            for (int j = 0; j < n; j++) {
	                if ((i & (1 << j)) != 0) {
	                    sum += number[j];
	                    count++;
	                }
	            }
	            if (count == 3 && sum == 0) {
	                answer++;
	            }
	        }

	        return answer;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        int[] number = {-2, 3, 0, 2, -5};
	        System.out.println(solution.solution(number)); // 출력 결과: 2
	    }
	}
}
