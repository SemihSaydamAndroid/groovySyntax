class Strings {
    static void main(String[] args) {

        //parameter
        def name = "Semih"
        println("Benim adım ${name}")
        println("Benim adım $name\n")

        //multi-line
        def multiLineString = '''Merhaba 
        Bu tanımlama sayesinde birden fazla
        satırı aynı string içinde yazdık
        '''
        println(multiLineString)

        //index of String for name = 'Semih'
        println("1st Index of name = " + name[0])
        println("Index of m = " + name.indexOf('m'))
        println("1st 4 Chars = " + name[0..3])
        println("Other chars = " + name[0,3,4])
        println("\n")

        //repeated string
        def repeatedStr = "Merhaaba Medium ! " * 2;
        println("repeated string = " + repeatedStr)
        println(repeatedStr - "Merhaaba")
        println(repeatedStr.split(' '))
        println(repeatedStr.toList())

    }
}
