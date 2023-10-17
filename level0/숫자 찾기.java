/* 문제 설명
정수 num과 k가 매개변수로 주어질 때,
num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < num < 1,000,000
0 ≤ k < 10
num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.
입출력 예
num	k	result
29183	1	3
232443	4	4
123456	7	-1
입출력 예 설명
입출력 예 #1

29183에서 1은 3번째에 있습니다.
입출력 예 #2

232443에서 4는 4번째에 처음 등장합니다.
입출력 예 #3

123456에 7은 없으므로 -1을 return 합니다. */

class Solution {
    public int solution(int num, int k) {
        int answer = -1;

        // int 타입은 split 불가-> String 타입 변환 후 사용

        String arr = Integer.toString(num); // int -> String
        String[] arr1 = arr.split(""); // 배열로 변환

        for(int i = 0; i<arr1.length; i++){
            if(arr1[i].equals(Integer.toString(k))){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}