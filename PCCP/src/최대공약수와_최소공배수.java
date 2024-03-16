
public class 최대공약수와_최소공배수 {
	class Solution {
	    public int[] solution(int n, int m) {
	        int[] answer = new int[2];

	        // 최대공약수를 구하는 메소드 호출
	        int gcd = gcd(n, m);
	        // 최소공배수를 구하는 공식을 이용하여 계산
	        int lcm = (n * m) / gcd;

	        // 결과 배열에 최대공약수와 최소공배수 저장
	        answer[0] = gcd;
	        answer[1] = lcm;

	        return answer;
	    }

	    // 최대공약수를 구하는 메소드
	    private int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = a % b;
	            a = b;
	            b = temp;
	        }
	        return a;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        int n1 = 3, m1 = 12;
	        int n2 = 2, m2 = 5;
	        int[] result1 = solution.solution(n1, m1);
	        int[] result2 = solution.solution(n2, m2);
	        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // [3, 12]
	        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // [1, 10]
	    }
	}
}
