package medium1

class Functions {
    static void main(String[] args) {
        sayMyName()

        println("3 + 5 = " + toplama(3, 5))

        def sList = [2,4,6,8]
        sList = listeyiCiftle(sList)
        println(sList)

        def toplam = verilenKadariniTopla(2,3,4,5)
        println("verilen sayıların toplamı : " + toplam)

        def fact4 = factorial(4)
        println("Factorial 4 : " + fact4)

//        def greeting = "Goodbye";
//        sayGoodBye("Derek")
    }

    static def sayMyName() { println("Heisenberg") }

    static def toplama(sayi1 = 0, sayi2 = 0) {
        return sayi1 + sayi2
    }

    static def listeyiCiftle(list){
        def yeniListe = list.collect { it * 2}
        return yeniListe
    }

    static def verilenKadariniTopla(int... sayi){
        def toplam = 0
        sayi.each {toplam += it}
        return toplam
    }

    static def factorial(num){
        if(num < 1){
            return 1;
        } else {
            return (num * factorial(num -1))
        }
    }

    //alternative of factorial :
    //Closures :
    def getFactorial = {number -> (number <= 1 ? 1 : number * call(number-1))}

//    static def sayGoodBye = {theName -> println("$greeting $theName")}
}
