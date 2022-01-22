package mediumCompileTimeMetaProg.Canonical

import groovy.transform.Canonical

/**
 * @author Semih Saydam
 * @since 22.01.2022
 */
@Canonical
class Person {
    String first, last, email

    static void main(String[] args) {
        Person p1 = new Person("Semih", "Saydam", "semihsaydamz@gmail.com") //Bunu tuple constructor kısmı yapıyor
        Person p2 = new Person("Semih", "Saydam", "semihsaydamz@gmail.com")
        assert p1==p2 //Bunu equals and hashcode yapıyor
        println(p1.toString()) //bunu toString yapıyor.

        //Bu üçünün birleşimini ise @Canonical yapıyor.
    }
}
