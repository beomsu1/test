/* 문제 설명
문자열 my_string이 매개변수로 주어질 때,
대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
입출력 예
my_string	result
"cccCCC"	"CCCccc"
"abCdEfghIJ"	"ABcDeFGHij"
입출력 예 설명
입출력 예 #1

소문자는 대문자로 대문자는 소문자로 바꾼 "CCCccc"를 return합니다.
입출력 예 #2

소문자는 대문자로 대문자는 소문자로 바꾼 "ABcDeFGHij"를 return합니다. */

class Solution {
    public String solution(String my_string) {
        String answer = "";

        // 아스키코드 - 대문자 65~90 소문자 97~122
		// 두개의 차이는 32

        // char 형식 배열로 만들기 -> toCharArray() 사용
        char[] arr = my_string.toCharArray();


        for(char alphabet : arr){
            if(alphabet >= 65 && alphabet <= 90){
                answer +=(char)(alphabet + 32);
            } else if(alphabet >= 97 && alphabet <= 122){
                answer += (char)(alphabet - 32);
            }
        }

        return answer;
    }
}