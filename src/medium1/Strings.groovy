package medium1

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
        println(repeatedStr.replaceAll('Merhaaba', 'Hello'))
        println("UpperCase : " + name.toUpperCase())
        println("LowerCase : " + name.toLowerCase())

        //format string
        def dummyString = "dummy"
        println("A $dummyString string")
        printf("A %s string \n", dummyString) //%s yerine stringin gidip yerleşecektir
        printf(" %-30s %d %.2f %10s \n", ['Something', 10, 1.234, 'dummy']) //-30 stringin sağına , 10 ise soluna boşluk atıyor.
        //%.2f float yazcan ama virgül sonrası 2 basamak diyorsun
        //%d double veya integer
    }
}
