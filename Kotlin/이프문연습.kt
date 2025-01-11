// 코틀린에서는 자바의 삼항연산자 기법을 사용할 수 없다.
class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = if (num1 == num2) 1 else -1
        return answer
    }
}