/* 문제 설명
영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

제한사항
numbers는 소문자로만 구성되어 있습니다.
numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
1 ≤ numbers의 길이 ≤ 50
"zero"는 numbers의 맨 앞에 올 수 없습니다.
입출력 예
numbers	result
"onetwothreefourfivesixseveneightnine"	123456789
"onefourzerosixseven"	14067
입출력 예 설명
입출력 예 #1

"onetwothreefourfivesixseveneightnine"를 숫자로 바꾼 123456789를 return합니다.
입출력 예 #1

"onefourzerosixseven"를 숫자로 바꾼 14067를 return합니다.
 */

class Solution {
    public long solution(String numbers) {
        String[] strings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] chars = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // replace는 변경하려는 타입과 변경되는 타입이 같아야지 사용가능
        for (int i = 0; i < 10; i++) {
            numbers = numbers.replace(strings[i], chars[i]);
        }
        return Long.parseLong(numbers);
    }
}

// replaceAll , valutOf 사용
class Solution {
    public long solution(String numbers) {

            String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for (int i = 0; i < numbers_arr.length; i++) {

                // valueOf-> i로 값 변경
                numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
            }

            long answer = Long.parseLong(numbers);
            return answer;
        }
}
