package medium1
/**
 * @author Semih Saydam
 * @version 0.0.1
 */
class Range {

    static void main(String[] args) {
        def oneToFive = 1..5
        def aToZ = 'a'..'z'
        def zToA = 'z'..'a'

        println("Size integer range : " + oneToFive.size())
        println("2nd item is : " + oneToFive.get(1))
        println("First item is : " + oneToFive.getFrom())
        println("Last item is : " + oneToFive.getTo())
        println("Size alphabet range : " + aToZ.size())
    }

}
