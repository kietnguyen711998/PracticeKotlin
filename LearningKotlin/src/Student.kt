class Student(
    studentID: Int? = null,
    studentName: String? = null,
    numberPhone: String? = null,
    address: String? = null,
    private var Batch: String? = null,
    var Mark1: Double? = null,
    var Mark2: Double? = null
) : Person(studentID, studentName, numberPhone, address) {

    override fun show() {
        super.show()
        println("Batch = $Batch")
        println("Mark1 = $Mark1")
        println("Mark2 = $Mark2")

    }

    fun getAvgMark(): Double? {
//        var avg = (Mark1 + Mark2)/2
//        Mark2?.let {  return Mark1?.plus(it) } //it is Mark2
        //if else
        Mark1?.apply {
            Mark2?.let {
                return (it + this) / 2
            }
        }
        return 0.0
    }


    override fun input() {
        super.input()
        print("input Batch = ")
        Batch = readLine()!!
        print("input Mark1 = ")
        Mark1 = readLine()!!.toDouble()
        print("input Mark2 = ")
        Mark2 = readLine()!!.toDouble()
    }
}