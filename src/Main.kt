fun main() {
// Ask the user to enter one integer (Int).
    println("enter  your int")
    val myint = readln().toInt()

  //  Ask the user to enter one double (Double).
println("enter your double")
val mydouble = readln().toDouble()

    //Calculate the quotient of the double divided by the integer.
    val quotient = mydouble / myint

//Calculate the remainder when the integer is divided by 3.
    val remainder = myint %3

    //Print the results of both calculations.
    println("the result of quotient equal $quotient")
    println("the result of remainder equal$remainder")

// Check if the double is greater than the integer.
val check =mydouble>myint
     //Print the result of this comparison.
    println("the result is $check ")

    //check if the double is greater than 5 and the integer is greater than 5.
    var check2= (mydouble>5) and (myint>5)
//check if the double is greater than 5 or the integer is greater than 5.
    var check3= (mydouble>5) or  (myint>5)

    //Print the results of these logical operations.
    println("the result for check2 is $check2")
    println("the result for check3 is $check3")

    //Prompt the user to enter an email address.
    println("enter your email")
    val email = readln()
    // Validate the entered email using a regular expression (regex).
    val regex = "^[A-Z0-9+_.-]+@icloud.com+$".toRegex()

    //Print whether the entered email is valid or not
    println(" email validation = ${regex.matches(email)}")

}