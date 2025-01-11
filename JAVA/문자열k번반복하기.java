package JAVA;


// 문자열 k번 반복하기기
class Solution {
    public String solution(String my_string, int k) {
        
        String answer= my_string;
        int i=1;
        // string 을 붙여서 answer 문자열 재선언이 되어버려서 안됨. 
        // 자바에서는 문자열 재선언이 안됨
        while (i<k) {
        answer += my_string;
        i++;
        }
        
        return answer;
    }
}

// 좋은 답안

class Solution2 {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}