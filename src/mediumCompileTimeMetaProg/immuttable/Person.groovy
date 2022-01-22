package mediumCompileTimeMetaProg.immuttable

import groovy.transform.Immutable
import groovy.transform.ToString

/**
 * @author Semih Saydam
 * @since 22.01.2022
 */
@ToString
@Immutable
class Person {

    String first, last

    static void main(String[] args) {
        Person p = new Person(first: "Semih", last: "Saydam")
        println(p.toString())
//        p.first = //field'leri değiştirilemez yani final hale getiriyor.
    }
}
