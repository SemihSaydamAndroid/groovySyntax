package mediumCompileTimeMetaProg.equealsAndHasCode

import groovy.transform.EqualsAndHashCode

/**
 * @author Semih Saydam
 * @since 22.01.2022
 */
@EqualsAndHashCode
class Person {

    String first, last, email

    //Equals and hash code generate edince bunu veriyor. Bu da çalışır ama @ ile temiz bir şekilde yukarıda tanımlamak varken buna gerek yok

//    boolean equals(o) {
//        if (this.is(o)) return true
//        if (getClass() != o.class) return false
//
//        Person person = (Person) o
//
//        if (email != person.email) return false
//        if (first != person.first) return false
//        if (last != person.last) return false
//
//        return true
//    }
//
//    int hashCode() {
//        int result
//        result = (first != null ? first.hashCode() : 0)
//        result = 31 * result + (last != null ? last.hashCode() : 0)
//        result = 31 * result + (email != null ? email.hashCode() : 0)
//        return result
//    }

    static void main(String[] args) {
        Person p1 = new Person(first: "Semih", last: "Saydam", email: "semihsaydamz@gmail.com")
        Person p2 = new Person(first: "Semih", last: "Saydam", email: "semihsaydamz@gmail.com")

        assert p1 == p2 //Bu şekilde eşitlersen eşit olmayacaktır çünkü instance olayları hafızada fakrlı yerdeler olayı
        //@EqualsAndHashCode annotation'undan sonra artık aynı instance'a gidiyorlar. çok iyi.
        //Örneğin email'i değişik verdin 38-39'da gidip @EqualsAndHascode{excludes = ["email"]} şeklinde excludes edersen p1==p2 olmaya devam edecektir.

    }
}
