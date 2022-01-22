package mediumCompileTimeMetaProg.tostring

import groovy.transform.ToString

/**
 * @author Semih Saydam
 * @since 22.01.2022
 */
@ToString(includeNames = true, excludes = ["email"])
//includeNames = true özelliğini verirsen first: Semih şeklinde first ifadesini de ekler.
//excludes ile de o field'i ignore edebiliyorsun.
class Person {

    String first, last, email

//                  Bunun yerine @ToString kullanıcaz --> line27
//    @Override
//    public String toString() {
//        return "Person{" +
//                "first='" + first + '\'' +
//                ", last='" + last + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }

    static void main(String[] args) {
        Person person = new Person(first: "Semih", last: "Saydam", email: "semihsaydamz@gmail.com")
        println(person.toString()) // Yukarıda 14-16 arası okuduğun şekilde String'e çekip veriyor.
        //Bunu sürekli yapmak ve Bu method'u generate etmek yerine direkt @ToString annotation'unu kullanırsın. Hem değişkeni filan değiştirdiğindeotmatik algılıyor.
    }
}


