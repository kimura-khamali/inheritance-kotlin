//feature of OOP
fun main() {
    val banker = Banker("Kelvin", 24)//type of banker is Banker which is a custom type
    val doctor = Doctor("Ann", 30)
    val farmer = Farmer("Scarlet", 22)
//    val knight = Khight("Scarlet", 22)
    banker.introduction()
    banker.age
    banker.name
    farmer.introduction()
    doctor.introduction()
//    banker.eat()
//    banker.countMoney(arrayOf(100, 50, 200, 500, 100))
//    banker.sleep()
//    banker.talk("Right turn")

//    doctor.talk("were")
//    doctor.eat()
//    doctor.sleep()
//    doctor.treatpatient("Anne", "Malaria")

//    farmer.talk("farm")
    farmer.eat()
//    farmer.cultivate()
//    farmer.sleep()
//
//    adult()
//    adult(4)
}

class Banker(name: String, age: Int) : Person(name, age) {
//    fun talk(words: String) {
//        println(words)
//    }
//
//    fun eat() {
//        println("yum")
//    }
//
//    fun sleep() {
//        println("zzzzzzz")
//    }

    fun countMoney(notes: Array<Int>): Int {
        var sum = 0
        notes.forEach { note -> sum += note }
        return sum
    }
}

open class Person(var name: String, var age: Int) {
    fun talk(words: String) {
        println(words)
    }

    open fun eat() {
        println("yum")
    }

    fun sleep() {
        println("zzzzzzz")
    }

    open fun introduction() {
        println("Hi my name is $name")
    }
}

class Doctor(name: String, age: Int) : Person(name, age) {
//    fun talk(words: String) {
//        println(words)
//    }
//
//    fun eat() {
//        println("yum")
//    }
//
//    fun sleep() {
//        println("zzzzzzz")
//    }

    fun countMoney(notes: Array<Int>): Int {
        var sum = 0
        notes.forEach { note -> sum += note }
        return sum
    }

    fun treatpatient(patient: String, disease: String) {
        println("Treat $patient for $disease")
    }

    override fun introduction() {
        // super.name
        println("Hi, I am  doctor $name")
    }
}

class Farmer(name: String, age: Int) : Person(name, age) {
//    fun talk(words: String) {
//        println(words)
//    }
//
//    fun eat() {
//        println("yum")
//    }
//
//    fun sleep() {
//        println("zzzzzzz")//repeatition
//    }

    fun cultivate() {
        println("dig dig dig")
    }

    override fun eat() {
        super.eat()  //parents word  add something to it//extend
        // println("I am eating the food that i have grown")//you can use this alone replacing
    }

}

/*fun adult(age: Int=18) {
    var diff = age -18
    println("Adult for $age years")
}*/


/*fun main() {
    val banker = Banker("Kelvin", 24)//type of banker is Banker which is a custom type
    val doctor = Doctor("Ann", 30)
    val farmer = Farmer("Scarlet", 22)
}

class Banker(name: String, age: Int) : Person(name, age) {
//    fun talk(words: String) {
//        println(words)
//    }
//
//    fun eat() {
//        println("yum")
//    }
//
//    fun sleep() {
//        println("zzzzzzz")
//    }

    fun countMoney(notes: Array<Int>): Int {
        var sum = 0
        notes.forEach { note -> sum += note }
        return sum
    }
}

class Doctor(name: String, age: Int):Person(name, age) {

}


open class Person(var name: String, age: Int) {
    fun talk(words: String) {
        println(words)
    }

    open fun eat() {
        println("yum")
    }

    fun sleep() {
        println("zzzzzzz")
    }*/

//how program make certain decision control flow