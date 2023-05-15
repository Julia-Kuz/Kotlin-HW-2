fun main() {

    // Задача 1
    val amount = 15_000
    val fee = amount * 0.75 / 100
    val minFee = 35
    val finalFee = if (fee > minFee) fee else minFee
    println("Комиссия составляет $finalFee руб.")

    //Задача 2
    val likes = 165
    if (likes % 10 === 1) {
        println("Понравилось $likes человеку")
    } else println("Понравилось $likes людям")

    //Задача 3
    val totalPrice = 50_000
    val client = true
    val priceWithDiscounts =
        if (totalPrice > 1001 && totalPrice < 10_000) totalPrice - 100 else if (totalPrice > 10_001) totalPrice - totalPrice * 5 / 100 else totalPrice
    val finalPrice = if (client) priceWithDiscounts - priceWithDiscounts * 1 / 100 else priceWithDiscounts
    println("Цена со всеми скидками $finalPrice руб.")

}

