class Student(_name: String)
{
    var name = _name
    var family = "Undefiend"
    var otchestvo = "Undefiend"
    var pol = "Undefiend"
    var group = 0
    var data = "Undefiend"
    var rost = 0
    var ves = 0
    var sport = "Undefiend"

    constructor(_name: String, _family: String, _otchestvo: String): this(_name) {
        family = _family
        otchestvo = _otchestvo
    }

    constructor(_name: String, _family: String, _otchestvo: String, _rost: Int, _ves: Int, _group: Int) : this(_name) {
        family = _family
        otchestvo = _otchestvo
        rost = _rost
        ves = _ves
        group = _group
    }

    fun DateKourse(_family: String, _name: String)
    {
        try {
            var data1 : Int
            var data2 : Int
            do {
            print("Введите год послупления: ")
             data1 = readLine()!!.toInt()
            print("Введите сегоднешний год: ")
             data2 = readLine()!!.toInt()
            }while(data1 > data2)

            println("$_family $_name, вы сейчас на ${data2-data1} курсе")
        }
        catch (ex: Exception)
        {
            println(ex.message)
        }
    }

    fun Rost(_family: String, _name: String)
    {
        try {
            print("Введите свой рост: ")
            var rost = readLine()!!.toInt()

            when{
                (rost < 150) -> println("$_family $_name, ваш карлик")
                (rost < 159) -> println("$_family $_name, ваш рост низкий")
                (rost < 172) -> println("$_family $_name, ваш рост ниже среднего")
                (rost < 178) -> println("$_family $_name, ваш рост средний")
                (rost < 189) -> println("$_family $_name, ваш рост высокий")
                else -> println("$_family $_name, ваш рост гигантский")
            }
        }
        catch (ex: Exception)
        {
            println(ex.message)
        }

    }

    fun Ves(_family: String, _name: String)
    {
        try {
            print("Введите свой вес: ")
            var ves = readLine()!!.toInt()

            when{
                (ves < 30) -> println("$_family $_name, вы скелет?")
                (ves < 50) -> println("$_family $_name, вы худой")
                (ves < 70) -> println("$_family $_name, ваш вес средний")
                (ves < 90) -> println("$_family $_name, ваш вес выше среднего")
                else -> println("$_family $_name, у вас ожирение")
            }
        }
        catch (ex: Exception)
        {
            println(ex.message)
        }

    }
}

