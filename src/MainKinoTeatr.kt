fun main()
{
    try {
        val kinofilmOne = KinoTeatr("Человек паук: возвращение домой", "Вечерний", 300)

        val kinofilmTwo = KinoTeatr("Перевозчик", "Ночной", 500, 4, 50)

        println("Название: ${kinofilmOne.namefilm} Сеанс: ${kinofilmOne.seans} Стоимость: ${kinofilmOne.moneyticket}")

        println("Название: ${kinofilmTwo.namefilm} Сеанс: ${kinofilmTwo.seans} Стоимость: ${kinofilmTwo.moneyticket}" +
                " Номер зала: ${kinofilmTwo.numberzal} Кол-во зрителей: ${kinofilmTwo.kolvoWatcher}")

        kinofilmOne.Seans()
        kinofilmOne.Zal()
        kinofilmOne.Money()
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}