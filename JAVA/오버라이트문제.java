package JAVA;

// string에 내재되어있는 함수 charAt(), substring(), 그리고 length()이용.

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s);
        answer+=overwrite_string;
        int a = overwrite_string.length();
        answer+=my_string.substring(s+a);
        return answer;
    }
}

