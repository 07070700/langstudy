//코틀린은 함수를 fun 으로 가져오고 문자의 출력 유형을 미리 언급하는게 아니라 나중에 언급해주는것이 특징이다.
//컴파일 시간이 좀 걸리네..

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = num1 % num2
        return answer
    }
}

//보다 간단하게 


class Solution {
    fun solution(num1: Int, num2: Int) = num1 % num2
}


//몫만 가져오기기
// 코틀린이나 자바는 나눈 몫이 // 가 아니라 /이다.
class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = num1 / num2
        return answer
    }
}

// 빼기

// 코틀린이나 자바는 나눈 몫이 // 가 아니라 /이다.
class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = num1 / num2
        return answer
    }
}