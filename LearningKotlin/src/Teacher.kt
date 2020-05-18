class Teacher(
    teacherId: Int? = null,
    teacherName: String? = null,
    numberPhone: String? = null,
    address: String? = null,
    var salary: Double? = null,
    var numberWorkDay: Int? = null
) :
    Person(teacherId, teacherName, numberPhone, address) {
    init {

    }

    fun getSalary(): Int? {
        var luong = numberWorkDay?.times(800000)
        return luong
    }

//    fun getSalary() = numberWorkDay? * 800000

    override fun show() {
        super.show()
        println("salary = $salary")
        println("numberWorkDay = $numberWorkDay")

    }


    override fun input() {
        super.input()
        print("input salary = ")
        salary = readLine()!!.toDouble()
        print("input numberWorkDay = ")
        numberWorkDay = readLine()!!.toInt()

    }

}