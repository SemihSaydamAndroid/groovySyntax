package medium2
/**
 * @author Semih Saydam
 * @since 12.01.2022
 */
class ControlStructure {
    static void main(String[] args) {

        if (true)
            println("value is true")
        else
            print("value is false")

        String name = "Semih"
        if (name)
            println("name has a value")

        String last = ""
        if (last)
            println("last has a value")

        def x = 10
        if (x==10)
            println "x is 10"
        else
            println "x is not 10"

        def list = [1,2,3,4,5]
        for (num in list)
            println num

        //closure
        def list2 = [1,2,3,4]
        list2.each{ println it}

        //switch
        def myNum = 1
        switch (myNum){
            case 1:
                println("number is 1")
                break
            default:
                println("we hit the default case")
        }
    }
}
