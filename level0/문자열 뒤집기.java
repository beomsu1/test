// 문자열 my_string이 매개변수로 주어집니다.
//my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

// 제한사항
// 1 ≤ my_string의 길이 ≤ 1,000
// 입출력 예
// my_string	return
// "jaron"	"noraj"
// "bread"	"daerb"
// 입출력 예 설명
// 입출력 예 #1

// my_string이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.
// 입출력 예 #2

// my_string이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.

import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        // 문자열의 index가 0부터 시작하기에 -1
        for(int i = my_string.length()-1; i>=0; i--){

            // 문자열 잘라서 값 대입하기
            answer += my_string.substring(i,i+1);
        }
        return answer;
    }
}

// StringBuilder 사용

class Solution {
    public String solution(String my_string) {

        // StringBuilder로 객체 생성
        StringBuilder reverseString = new StringBuilder();

        // my_String을 추가
        reverseString.append(my_string);

        // 뒤집기
        reverseString.reverse;

        // toString으로 문자열반환
        return reverseString.toString();
    }
}