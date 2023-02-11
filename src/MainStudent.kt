fun main()
{
    try {
        val studentone = Student("Кирилл", "Максимов", "Эдуардович")

        val studenttwo = Student("Игорь", "Бондырев", "Николаевич", 175, 55, 21)

        println("Имя: ${studentone.name} Фамилия: ${studentone.family} Отчество: ${studentone.otchestvo}")

        println("Имя: ${studenttwo.name} Фамилия: ${studenttwo.family} Отчество: ${studenttwo.otchestvo} " +
                "Рост: ${studenttwo.rost} Вес: ${studenttwo.ves} Группа ${studenttwo.group}")

        studentone.DateKourse(studentone.family, studentone.name)
        studentone.Rost(studentone.family, studentone.name)
        studentone.Ves(studentone.family, studentone.name)
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }

}