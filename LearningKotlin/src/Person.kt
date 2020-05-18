import java.util.*

abstract class Person(var id: Int?, var name: String?, var numberPhone: String?, var address: String?) {
    init {
    }

    open fun show() {
        println("Id = $id")
        println("Name = $name")
        println("numberPhone = $numberPhone")
        println("address = $address")
    }

    open fun input() {
        print("input id = ")
        id = Scanner(System.`in`).nextInt()
        print("input  Name = ")
        name = readLine().toString()
        print("input  Phone = ")
        numberPhone = readLine().toString()
        print("input  Address = ")
        address = readLine().toString()
    }
}
