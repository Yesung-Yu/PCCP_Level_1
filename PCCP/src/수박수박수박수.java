import java.util.*;

public class 수박수박수박수 {

	class Solution {
		public String solution(int n) {
			StringBuilder answer = new StringBuilder();

			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					answer.append("수");
				} else {
					answer.append("박");
				}
			}

			return answer.toString();
		}
	}
}