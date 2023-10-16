/* 문제 설명
정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10,000
입출력 예
n	result
24	[1, 2, 3, 4, 6, 8, 12, 24]
29	[1, 29]
입출력 예 설명
입출력 예 #1

24의 약수를 오름차순으로 담은 배열 [1, 2, 3, 4, 6, 8, 12, 24]를 return합니다.
입출력 예 #2

29의 약수를 오름차순으로 담은 배열 [1, 29]를 return합니다. */

import java.util.*;

// for문 한 번만 돌려서 딱 떨어지는 값 구해서 집어넣으면 끝. 중복된 값이 나오지 않음.
class Solution {
    public int[] solution(int n) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(n % i*j == 0){
                    result.add(i);
                }

            }
        }

        // 중복된 값 제거 Set - result 를 set으로 변환
        Set<Integer> set = new HashSet<>(result);

        // ArrayList Clear
        result.clear();

        // set 전체를 ArrayList로 변경
        result.addAll(set);

        // 배열 크기를 ArrayList 사이즈로 맞추기
        int [] answer = new int[result.size()];
        
        for(int i = 0; i<result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}

// for문 한 번 사용
class Solution {
    public int[] solution(int n) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                result.add(i);
            }
        }

        int[] answer = new int[result.size()];

        for(int i = 0; i<result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}