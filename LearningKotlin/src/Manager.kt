import java.util.*
import kotlin.collections.ArrayList

class Manager {
    var person: Teacher? = null

    //var persons = Student()
    var persons: Student? = null

    var listPerson: ArrayList<Person> = ArrayList()

    public fun menu() {
        var mOpti: Int?
        println("\n1. Nhập thông tin giáo viên hoặc sinh viên")
        println("2. Hiển thị danh sách sinh viên")
        println("3. Hiển thị danh sách giáo viên")
        println("4. Hiển thị lương giáo viên")
        println("5. Hiển thị điểm trung bình học sinh")
        println("6. Sắp xếp điểm trung bình học sinh theo thứ tự tăng dần")
        println("7. Sắp xếp danh sách giáo viên theo tên")
        println("8. Thoát chương trình!")
        println("Lựa chọn của bạn là : ")
        mOpti = readLine()?.toInt()
        if (mOpti == null) return
        when (mOpti) {
            1 -> addInFor()
            2 -> showListStudent()
            3 -> showListTeacher()
            4 -> showSalaryTeacher()
            5 -> showAvgStudent()
            6 -> sortAvgStudent()
            7 -> sortListTeacher()
            8 -> {
                println("Thanks you for input !")
                System.exit(1)
            }
            else -> {
                print("Syntax error !")
                menu()
            }
        }
    }

    private fun addInFor() {
        var mOpti: Int?
        print("1. Nhập thông tin sinh viên")
        println("\n2. Nhập thông tin giáo viên")
        print("Nhập lựa chọn : ")
        mOpti = readLine()?.toInt()
        if (mOpti == null) return
        when (mOpti) {
            1 -> {
                persons = Student()
                print("Please enter : ")
                persons?.input()
                if (persons == null) {
                    println("Error !")
                    return
                }
                listPerson.add(persons!!)
            }
            2 -> {
                person = Teacher()
                print("Please enter : ")
                person?.input()
                if (person == null) {
                    println("Error !")
                    return
                }
                listPerson.add(person!!)
            }
            else -> {
                println("Syntax error !!")
                menu()
            }
        }
    }
    /////////////7. Sắp xếp danh sách giáo viên theo tên Thay fix giup em a @@
    private fun sortListTeacher() {
        if (listPerson.isEmpty()) {
            println("Danh sách rỗng!")
        } else {
            ///// do something errro
            print(listPerson.size)
        }
    }
/////////////6. Sắp xếp điểm trung bình học sinh theo thứ tự tăng dần Thay fix giup em a @@
    private fun sortAvgStudent() {

        if (listPerson.isEmpty()) {
            println("Danh sách rỗng!")
        } else {
            println("Điểm trung bình theo tăng dần : ")
            listPerson.sortBy { persons ->
                var avg = 0.0
                for (persons in listPerson) {
                    if (persons is Student) {
                        avg = persons.getAvgMark()!!
                    }
                }
                avg == 1.0
            }

            for (item in listPerson)
                if (item is Student)
                    println(item)
        }
    }

    private fun showAvgStudent() {
        if (listPerson.isEmpty()) {
            println("Danh sách rỗng!")
        } else {
            println("Điểm trung bình : ")
            for (item in listPerson) {
                if (item is Student)
                    println(item.getAvgMark())
            }
        }
    }

    private fun showSalaryTeacher() {
        if (listPerson.isEmpty()) {
            println("Danh sách rỗng!")
        } else {
            println("Lương giáo viên là : ")
            for (person in listPerson) {
                if (person is Teacher)
                    println(person.getSalary())
            }
        }
    }

    private fun showListTeacher() {
        print("Danh sách giáo viên là : \n")
        if (listPerson.isEmpty()) {
            print("\nDanh sách rỗng\n")
        } else {
//            var list = listPerson.filter { x -> x is Teacher }
//            println("Danh sách giáo viên")
//            for (item in list) {
//                println(item)
//            }
            for (item in listPerson) {
                item.show()
            }

            print(listPerson.size)

            print("aaaa")
        }
    }

    private fun showListStudent() {
        if (listPerson.isEmpty()) {
            println("Danh sách rỗng!")
        } else {
            println("\nDanh sách sinh viên :")
//            var list = listPerson.filter { x ->
//                x is Student
//            }
//
//
            for (item in listPerson) {
                item.show()
            }

            print(listPerson.size)

            print("aaaa")
        }
    }

}



