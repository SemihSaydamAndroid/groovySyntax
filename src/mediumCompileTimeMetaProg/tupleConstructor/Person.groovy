package mediumCompileTimeMetaProg.tupleConstructor

import groovy.transform.ToString
import groovy.transform.TupleConstructor

/**
 * @author Semih Saydam
 * @since 22.01.2022
 */
@ToString
@TupleConstructor
class Person {

    String first, last, email


    static void main(String[] args) {
        Person p = new Person("Semih", "Saydam", "semihsaydamz@gmail.com") //default constructor özelliği veriyor direkt
        println(p.toString())
    }
}
