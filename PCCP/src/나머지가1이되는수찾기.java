
public class 나머지가1이되는수찾기 {
	public static void main(String[] args) {
		class Solution {
			public int solution(int n) {

				int result = 0;

				for (int x = 1; x <= n; x++) {
					if (n % x == 1) {
						result = x;
						break;
					}
				}
				return result;
			}
		}
	}
}
