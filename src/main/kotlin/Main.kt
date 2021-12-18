val likesWord1 = "лайк"
val likesWord2 = "лайков"
val likesWord3 = "лайка"

fun main(){
    val likes1 = 3
    val likes2 = 4
    val likes3 = 53
    val likes4 = 0
    val likes5 = 1
    val likes6 = 10

    println(getWord(likes1))
    println(getWord(likes2))
    println(getWord(likes3))
    println(getWord(likes4))
    println(getWord(likes5))
    println(getWord(likes6))
}

fun getWord(likes:Int):String{
    val last = likes-((likes/10)*10)
    var result = likes.toString();
    if (likes <= 14) {
        if (likes == 1)
            result = "$result $likesWord1"
        if (likes in 2..4)
            result = "$result $likesWord3"
        if(likes in 5..14 || likes == 0)
            result = "$result $likesWord2"
    } else {
        if(last == 1) {
            result = "$result $likesWord1"
        }
        if(last in 2..4) {
            result = "$result $likesWord3"
        }
        if((last in 5..9) || last == 0) {
            result = "$result $likesWord2"
        }
    }
    return result
}