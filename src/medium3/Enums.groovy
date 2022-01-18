package medium3
/**
 * @author Semih Saydam
 * @since 18.01.2022
 */
class Enums {

    enum Days {
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }

    static void main(String[] args) {

        //Enum'lar sabitlerden oluşan collection'lardır.


        def dayRange = Days.SUNDAY..Days.SATURDAY

        // for in loop
        for(day in dayRange){
            println(day)
        }

        // using closures
        dayRange.each { day ->
            println day
        }

        println(dayRange.size())
        println(dayRange.contains(Days.WEDNESDAY))
        println(dayRange.from) //başlangıç yeri
        println(dayRange.to)   //bitiş yeri

    }


}
