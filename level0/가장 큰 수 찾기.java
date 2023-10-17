/* 문제 설명
정수 배열 array가 매개변수로 주어질 때,
가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항
1 ≤ array의 길이 ≤ 100
0 ≤ array 원소 ≤ 1,000
array에 중복된 숫자는 없습니다.
입출력 예
array	result
[1, 8, 3]	[8, 1]
[9, 10, 11, 8]	[11, 2]
입출력 예 설명
입출력 예 #1

1, 8, 3 중 가장 큰 수는 8이고 인덱스 1에 있습니다.
입출력 예 #2

9, 10, 11, 8 중 가장 큰 수는 11이고 인덱스 2에 있습니다. */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        // sort는 void 타입 반환이기에 sort 사용하려면 배열을 새로 생성, 그래서 copyOf 사용
        int[] value = Arrays.copyOf(array, array.length);
        // 오름차순 정렬
        Arrays.sort(value);

        for(int i = 0; i<array.length; i++){
            if(array[i] == value[value.length-1]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}


class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        for(int i=0;i<array.length;i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}