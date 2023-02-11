class KinoTeatr(_namefilm: String)
{
    var namefilm = _namefilm
    var seans = "Undefiend"
    var moneyticket = 0
    var numberzal = 0
    var kolvoWatcher = 0

    constructor(_namefilm: String, _seans: String, _moneyticket: Int): this(_namefilm) {
        seans = _seans
        moneyticket = _moneyticket
    }

    constructor(_namefilm: String, _seans: String, _moneyticket: Int, _numberzal : Int, _kolvoWatcher: Int) : this(_namefilm) {
        seans = _seans
        moneyticket = _moneyticket
        numberzal = _numberzal
        kolvoWatcher = _kolvoWatcher
    }

    fun Seans()
    {
        try {
            var time : Int
            do {
                print("Введите час сеанса: ")
                time = readLine()!!.toInt()
            }while (time < 0 || time > 24)


            when{
                (time > 0 && time <= 4) -> println("Ночной сеанс")
                (time > 4 && time <= 11) -> println("Утренний сеанс")
                (time > 11 && time <= 16) -> println("Дневной сеанс")
                (time > 16 && time <= 24) -> println("Вечерний сеанс")
            }
        }
        catch (ex: Exception)
        {
            println(ex.message)
        }
    }

    fun Zal()
    {
        try {
            var mestall : Int
            var zanyat: Int
            do{
                print("Кол-во занятых мест должно быть меньше мест в зале")
                print("Введите мест в зале: ")
                mestall = readLine()!!.toInt()
                print("Введите кол-во занятых мест: ")
                zanyat = readLine()!!.toInt()
            }while (zanyat > mestall)

            println("В зале свобожных мест ${mestall - zanyat} ")
        }
        catch (ex: Exception)
        {
            println(ex.message)
        }
    }

    fun Money()
    {
        try {
            print("Введите сколько у вас денег: ")
            var MyMoney = readLine()!!.toInt()
            print("Введите цену билета: ")
            var moneyTicket = readLine()!!.toInt()
            print("Введите кол-во билетов: ")
            var kolvoTicket = readLine()!!.toInt()

            when{
                ((moneyTicket * kolvoTicket) < MyMoney) -> println("Вы успешно купили билеты")
                ((moneyTicket * kolvoTicket) > MyMoney) -> println("Ваш не хватает денег")
            }
        }
        catch (ex: Exception)
        {
            println(ex.message)
        }
    }


}