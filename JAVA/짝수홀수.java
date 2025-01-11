package JAVA;

// 입력값이 짝수일때 홀수일때 다르게 출력하기기
// 3항연산자를 이용한 방법
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));


    }
}


// 내 풀이 (불리안 이용용)

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean bool= n % 2 == 0;
        if (bool) {
            System.out.println(n + " is even");
        }else{
        System.out.println(n + " is odd");
            }
    }
}
