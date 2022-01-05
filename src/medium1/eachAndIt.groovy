package medium1

class eachAndIt {

    static void main(String[] args) {
        def numList = [1,2,3,4]
        numList.each {println(it)}

        def employees = ["Semih":27, "Esra":25]
        employees.each {println("$it.key : $it.value")}

        def randomNumbers = [1,2,3,4,5,6]
        randomNumbers.each {num -> if(num % 2 == 0)
        println(num)}

        def nameList = ["Doug", "Sally", "Sue"]

        def matchEle = nameList.find {item -> item == "Sue"}
        println(matchEle)

        def randomList = [1,2,3,4,5,6,7]
        def selectedNumbers = randomList.findAll {item -> item > 5}
        println(selectedNumbers)

        println("> 5 " + randomList.any {item -> item > 5}) //true
        println("> 1 " + randomList.every {item -> item > 1}) //false
    }
}
