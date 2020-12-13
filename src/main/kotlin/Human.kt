class Human (val name: String){
    //properti / atribut / field
    var email: String = ""
    var address: String = ""

    // method / fungsi
    fun talk(){
        println("Alamat Email saya adalah $email")
    }

    fun verify(email:String):Boolean {
        return email == this.email
    }

    fun introduce(){
        println("Perkenalkan, Nama saya adalah $name")
    }
}