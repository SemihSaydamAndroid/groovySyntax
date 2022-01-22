package mediumCompileTimeMetaProg.sortable

import groovy.transform.Canonical
import groovy.transform.Sortable

/**
 * @author Semih Saydam
 * @since 22.01.2022
 */
@Canonical
@Sortable
class Person {

    String first, last

    static void main(String[] args) {
        Person p1 = new Person("Semih","Saydam")
        Person p2 = new Person("Esra","Saydam")
        Person p3 = new Person("Filiz","Saydam")
        Person p4 = new Person("Mehmet","Saydam")
        Person p5 = new Person("Samet","Saydam")
        Person p6 = new Person("Nejla","Saydam")

        def saydamz = [p1,p2,p3,p4,p5,p6]
        println(saydamz.toSorted())  //Harf sırasına göre sıraladı
        //sıralamayı soyadına göre yapmak istersen mesela @Sortable{includes = ["last"]} şeklinde
    }
}
