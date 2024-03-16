import java.util.*;

public class 직사각형_별찍기 {

	class Solution {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();

	        // 세로 길이만큼 반복
	        for (int i = 0; i < m; i++) {
	            // 가로 길이만큼 별 출력
	            for (int j = 0; j < n; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); // 한 줄 출력 후 줄 바꿈
	        }
	    }
	}
}
