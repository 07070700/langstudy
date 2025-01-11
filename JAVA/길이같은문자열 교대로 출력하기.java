package JAVA;

// 길이가 같은 문자열 교대로 출력하기
// String으로 바꿀때 다시 answer가 재정의 되지 않도록 다른 이름으로 출력해야함.
class Solution {
    public String solution(String str1, String str2) {
        StringBuffer answer= new StringBuffer();
        //두 길이가 같으니까
        int ls = str1.length();
        int i=0;
        while (i<ls) {
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
            i++;
        }
        String result = answer.toString();
        return result;
    }
}

//다른사람풀이: answer 빈탕 스트링을 저렇게 그냥 줄 수 있다는 것에 간단함 놀라움.
class Solution2 {
    public String solution(String str1, String str2) {
        String answer = "";

        for(int i = 0; i < str1.length(); i++){
            answer+= str1.charAt(i);
            answer+= str2.charAt(i);
        }

        return answer;
    }
}
