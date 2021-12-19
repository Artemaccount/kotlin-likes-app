val likesWord1 = "лайк"
val likesWord2 = "лайков"
val likesWord3 = "лайка"

fun main(){
    val likes1 = 1
    val likes2 = 0
    val likes3 = 21
    val likes4 = 213
    val likes5 = 212
    val likes6 = 111
    val likes7 = 124124
    val likes8 = 23

    println(getWord(likes1))
    println(getWord(likes2))
    println(getWord(likes3))
    println(getWord(likes4))
    println(getWord(likes5))
    println(getWord(likes6))
    println(getWord(likes7))
    println(getWord(likes8))
}

fun getWord(likes:Int):String{
    var result = likes.toString()
    if(likes % 100 in 5..20 || likes == 0) result += " $likesWord2"
    else if(likes % 10 == 1) result += " $likesWord1"
    else if(likes % 10 in 2..4) result += " $likesWord3"
    else result = likesWord3;
    return result
}