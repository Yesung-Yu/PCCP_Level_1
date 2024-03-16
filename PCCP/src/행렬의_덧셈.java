
public class 행렬의_덧셈 {
	class Solution {
	    public int[][] solution(int[][] arr1, int[][] arr2) {
	        int rows = arr1.length;
	        int columns = arr1[0].length;
	        
	        int[][] answer = new int[rows][columns];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                answer[i][j] = arr1[i][j] + arr2[i][j];
	            }
	        }

	        return answer;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        int[][] arr1 = {{1, 2}, {2, 3}};
	        int[][] arr2 = {{3, 4}, {5, 6}};
	        int[][] result = solution.solution(arr1, arr2);

	        for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[0].length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	        // 출력 예시:
	        // 4 6
	        // 7 9
	    }
	}
}