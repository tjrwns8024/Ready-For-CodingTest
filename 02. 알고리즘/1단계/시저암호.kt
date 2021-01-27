package programmers.one

class Solution5 {
    fun solution(s: String, n: Int): String {
        var answer = ""

        for(i in s.indices){
            val char = s[i].toInt() + n

            if(s[i].toInt() in 65..90){
                answer += if(char > 90){
                    (65 + (char-91)).toChar()
                }else {
                    char.toChar()
                }
            } else if( s[i].toInt() in 97..122){
                answer += if(char > 122){
                    (97 + (char -123)).toChar()
                }else {
                    char.toChar()
                }
            }else {
                answer += s[i]
            }
        }
        return answer
    }
}

fun main(){
    val solution5 = Solution5()
    println(solution5.solution("Zz",1))
}