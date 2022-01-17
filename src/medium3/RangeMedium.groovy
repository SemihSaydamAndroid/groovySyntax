package medium3

import groovy.lang.Range

/**
 * @author Semih Saydam
 * @since 16.01.2022
 */
class RangeMedium {
    static void main(String[] args) {

//        for(int x=1; x<= 10; ++x){
//            println(x)
//        }
//        println("")
//        for(int y=10; y >= 1; --y){
//            println(y)
//        }

//        def letter = ['a','b','c']
//        for (int i=0; i > letter.size(); ++i){
//             println(letter[i])
//        }

        /*    Range    */
        //Range range = 0..10 // (0 to 10)
        Range range = 0..<10 // (0 to 9)
        println(range)
        println(range.class.name)
        println(range.from)
        println(range.to)
        assert (0..10).contains(0)
        assert (0..10).contains(10)  //default true..
        assert (0..10).contains(-1) == false
        assert !(0..10).contains(11) // simplfy "== false" to !(..)

        /* Date example with Range */
        Date today = new Date()
        Date oneWeekAway = today + 7
        println(today)
        println(oneWeekAway)
        Range days = today..oneWeekAway
        println(days)
        println(days.size())

        //Letters example
        Range letters = 'a'..'z'
        println(letters)
        println(letters.size())


    }
}
