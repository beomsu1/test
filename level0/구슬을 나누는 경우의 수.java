// 이미지 설명 참조 - https://school.programmers.co.kr/learn/courses/30/lessons/120840

/* 문제 설명
머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

제한사항
1 ≤ balls ≤ 30
1 ≤ share ≤ 30
구슬을 고르는 순서는 고려하지 않습니다.
share ≤ balls
입출력 예
balls	share	result
3	2	3
5	3	10 */



class Solution {

    private int factorial(int n){
        if(n <= 1){
            return 1;
        } else {

            // 재귀함수
            return n * factorial(n-1);
        }
    }


    public int solution(int balls, int share) {
        int answer = 0;

        answer = factorial(balls) / (factorial(balls-share) * factorial(share));
        return answer;
    }
}

// 정수의 값이 너무 커서 BigInteger 사용
// BigInteger를 사용할 때는 기호 사용 X -> 내장된 메소드를 사용해서 사칙연산

import java.math.BigInteger;

class Solution {

    private BigInteger factorial(int n) {
        if (n <= 1) {

            // 1을 BigInteger 에서는 .ONE을 사용
            return BigInteger.ONE;
        } else {

            // BigInteger에서 재귀함수를 사용할 때 multiply(곱하기) 사용  
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }

    public int solution(int balls, int share) {
        int answer = 0;

        BigInteger numerator = factorial(balls);
        BigInteger denominator = factorial(balls - share).multiply(factorial(share));

        // numerator를 denominator로 divide(나누기)후 result에 저장
        BigInteger result = numerator.divide(denominator);

        // result 값을 int로 값 변경
        answer = result.intValue();

        return answer;
    }
}
