package JAVA;

// number가 n과 m의 배수이면 0과 1

//주의할점: public 뒤에는 반환형으로 이번에는 int 반환형으로 되어있으므로 return으로 출력값을 주어야한다.
//다른 문제들은 void로 되어있어서 출력에 system.out.print로 반환값이 없이 출력값만 있어도 되지만, public 뒤에 다른 값이 주어져있다면 아래와 같이 return값으로 주어야한다.
class Solution {
    public int solution(int number, int n, int m) {
        if (number%n==0 && number%m==0){
            return 1;
        }else {
        return 0;
        }
    }
}

// 3항연산자
class Solution2 {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}