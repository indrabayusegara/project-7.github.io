import java.util.ArrayList

fun main() {
    val firstname1 = "Andi"
    val lastname1 = "Budiman"
    val age1 = 34

    println(firstname1)
    println(lastname1)
    println(age1)

    val firstname2 = "Rudi"
    val lastname2 = "Setiawan"
    val age2 = 25

    println(firstname2)
    println(lastname2)
    println(age2)

    //array
    val firstname = arrayListOf<String>()
    val lastname = arrayListOf<String>()
    val age = arrayListOf<Int>()

    firstname.add("Andi")
    lastname.add("Budiman")
    age.add(34)

    firstname.add("Rudi")
    lastname.add("Setiawan")
    age.add(25)

    for (first in firstname) {
        println(first)
    }
    for (last in lastname){
        println(last)
    }
    for (a in age){
        println(a)
    }

    //array 2
    val andiarray = arrayListOf<Any>()
    andiarray.add("Andi")
    andiarray.add("Budiman")
    andiarray.add(34)
    for (andi in andiarray){
        println(andi)
    }

    //array 3
    val  mhsarray = arrayListOf<ArrayList<Any>>()
    mhsarray.add(andiarray)
    mhsarray.add(arrayListOf("Budi", "Setiawan", 25))
    for (item in mhsarray){
        for (i in item){
            println(i)
        }
    }

    // data class
    val andi = User("andi", "budiman", 34)
    val rudi = User(age = 25, lastname = "Setiawan", firstname = "rudi")
    val dedi = User()
    dedi.age = 35
    dedi.firstname = "dedi"

    val andi2 = andi.copy(age = 40)

    println(andi)
    println(rudi)
    println(dedi)

    println(andi.lastname)
    println(andi2)

    // data class array
    val mhsamikom = arrayListOf<User>()
    mhsamikom.add(andi)
    mhsamikom.add(rudi)
    mhsamikom.add(dedi)

    mhsamikom.add(User("ferdi", "Setiawan" , 45))

    for (mhs in mhsamikom){
        println(mhs)
    }

    
}