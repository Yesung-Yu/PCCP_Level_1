import java.util.*;

public class 부족한_금액_계산하기 {
	
	class Solution {
	    public long solution(int price, int money, int count) {
	        long requiredMoney = 0;

	        for (int i = 1; i <= count; i++) {
	            requiredMoney += price * i;
	        }

	        long answer = requiredMoney - money > 0 ? requiredMoney - money : 0;
	        return answer;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        int price = 3;
	        int money = 20;
	        int count = 4;
	        System.out.println(solution.solution(price, money, count)); // 10
	    }
	}
}
