fun main(args: Array<String>) {
    println(personDetails("Mwiyeria",23,"Kenya"))
    println(countryName("Kenya"))
    nameConfirmation("Senyia")
    val school = "AkiraChix"
    val schoolName = replaceVowelsWithAsterisk(school)
    println(schoolName)

}
//1. Write a function that takes in 3 parameters, name, age, and country, and returns a String with
//this structure “Hi, my name is x, I am y years old
//and I am from z.” Where x, y, and z are the provided name, age, and country respectively. (3 points)
fun personDetails(x: String,y: Int,z: String): String{
    var details = ("Hi my name is $x,I am $y years old and I am from $z")
    return details
}
//2. Write a function that takes in a String and returns its length
fun countryName(name: String): Int{
    return name.length

}
//3. Write a function that takes in a name and prints out “That’s me!” when your name is passed to it,
//otherwise, it prints out “I don’t know who that is”
fun nameConfirmation(name: String){
    var correctName = "Mwiyeria"
    if(correctName.equals(name)){
        println("That's me!")
    }
    else{
        println("I don't know who that is")
    }
}
//4. Write a Kotlin function that takes in a string will all the vowels replaces by the character ‘*’.
//Use string interpolation to generate the output.
fun replaceVowelsWithAsterisk(school: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var empty = ""
    for (i in school) {
        if (i in vowels) {
            empty += "*"
        } else {
            empty += i
        }
    }
    return "i: $empty"
}
