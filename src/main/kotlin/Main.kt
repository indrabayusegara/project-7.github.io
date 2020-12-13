fun main (){

    val indra : Human = Human("Indra")
    val andi : Human = Human("Andi")

    indra.email = "indra.2000@students.amikom.ac.id"
    indra.address = "jln.kaliurang km 16,5"

    andi.email = "haha@gmail.com"
    andi.address = "jln.kaliurang km 10"

    indra.talk()
    andi.talk()

    indra.introduce()
    andi.introduce()

    println(indra.verify("indra.2000@students.amikom.ac.id"))

    println(Indra.nama)

    val ardi : Indra = Indra
    println(ardi.kenegaraan)
}