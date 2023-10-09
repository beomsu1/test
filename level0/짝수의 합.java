// 문제 설명
// 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

// 제한사항
// 0 < n ≤ 1000

// 입출력 예
// n	result
// 10	30
// 4	6
// 입출력 예 설명
// 입출력 예 #1

// n이 10이므로 2 + 4 + 6 + 8 + 10 = 30을 return 합니다.
// 입출력 예 #2

// n이 4이므로 2 + 4 = 6을 return 합니다.

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i =0; i<=n; i++){
            if(i % 2 == 0){
                answer += i;
            }
        }
        return answer;
    }
}

// Stream 사용
class Solution {
    public int solution(int n) {
        
        // 0부터 n까지의 정수 포함하는 스트림 생성
        return IntStream.rangeClosed(0, n)

            // filter, map, reduce, forEach 등 사용할 때 람다식 사용
            // 람다식 사용해서 짝수분별
            .filter(e -> e % 2 == 0)

            // 더하기
            .sum();
    }
}