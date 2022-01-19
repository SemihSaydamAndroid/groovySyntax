package medium5ControlStructures
/**
 * @author Semih Saydam
 * @since 19.01.2022
 */
class ControlStructures2 {
    static void main(String[] args) {

        // if ( boolean expression ) { //logic }
        if (true){
            println("true")
        } else {
            println("false")
        }

        def age = 37
        if (age >= 21 && age < 35){
            println("genç")
        } else if (age >= 35){
            println("yetişkin")
        } else {
            println("21in altında")
        }

        /* ternary operator (expression) ? true : false */
        def name = "Semik"
        def isItSemik = (name.toUpperCase() == "SEMIK") ? "YES" : "NO"
        println(isItSemik)

        def msg
        def output = (msg != null) ? msg : "default message..."
        //mesaj varsa ata yoksa şunu ata. Fakat bunu daha kısa bir yolla yazabiliriz :
        def elvisOutput = msg ?: "default message..."
        println(msg)
        println(output)
        println(elvisOutput)


        /* switch statement */
        def num = 3
        switch (num){
            case 1:
                println "1"
                break
            case 2:
                println "2"
                break
            case 1..3:              //Bu şekilde range verebiliyorsun. taurus task..
                println("1,2,3")
                break
            case [1,2,12]:
                println("değer liste içinde var")
                break
            case Integer :
                println("değer bir integer'dır")
                break
            default:
                println("default")  //break koymazsan case'lere default'a her türlü giriyor.
        }

        //in
        def validAges = 21..35
        def myAge = 27
        println myAge in validAges //True

    }
}
