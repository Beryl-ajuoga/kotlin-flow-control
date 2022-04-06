fun main(){
    oddNumber(7)
    println(char(arrayOf("mary" ,"mark" ,"mercy" ,"molly")))
    robotServingDrinks(5)
    robotServingDrinks(15)
    robotServingDrinks(20)
    multiply()

}
fun oddNumber(num:Int){
    for (num in 1..100){
        if (num% 2 !==0){
            println(num)
        }
    }
}

fun char(name:Array<String>):Int{
    var num =0
    name.forEach { x->
        if (x.length > 5){
            num++
        }
    }
    return num
}

fun robotServingDrinks(age:Int){
    if (age<=6){
        println("glass of milk")
    }
    else{
        println("cocacola")
    }

}
fun multiply(){
    for (b in 1..100){
        if (b%7==0){
            println("buzz")
        }
        if (b%5==0){
            println("buzz")
        }
        if (b%7==0 && b%5==0){
            println("fizzbuzz")
        }

    }
}