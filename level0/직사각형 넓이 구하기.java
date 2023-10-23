/* 문제 설명
2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.

제한사항
dots의 길이 = 4
dots의 원소의 길이 = 2
-256 < dots[i]의 원소 < 256
잘못된 입력은 주어지지 않습니다.
입출력 예
dots	result
[[1, 1], [2, 1], [2, 2], [1, 2]]	1
[[-1, -1], [1, 1], [1, -1], [-1, 1]]	4
입출력 예 설명
입출력 예 #1

좌표 [[1, 1], [2, 1], [2, 2], [1, 2]] 를 꼭짓점으로 갖는 직사각형의 가로, 세로 길이는 각각 1, 1이므로 직사각형의 넓이는 1 x 1 = 1입니다.
입출력 예 #2

좌표 [[-1, -1], [1, 1], [1, -1], [-1, 1]]를 꼭짓점으로 갖는 직사각형의 가로, 세로 길이는 각각 2, 2이므로 직사각형의 넓이는 2 x 2 = 4입니다. */

import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        // 가로
        int max1 = dots[0][0];
        int min1 = dots[0][0];

        // 세로
        int max2 = dots[0][1];
        int min2 = dots[0][1];

        for(int i = 0; i<dots.length; i++){

            // max(), min() -> max(변수, 변경할 값)
            max1 = Math.max(max1, dots[i][0]);
            min1 = Math.min(min1, dots[i][0]);
            
            max2 = Math.max(max2, dots[i][1]);
            min2 = Math.min(min2, dots[i][1]);
        }

        answer = (max1 - min1) * (max2 - min2);
        return answer;
    }
}