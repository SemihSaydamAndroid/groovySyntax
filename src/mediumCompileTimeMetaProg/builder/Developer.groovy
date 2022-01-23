package mediumCompileTimeMetaProg.builder

import groovy.transform.ToString
import groovy.transform.builder.Builder

/**
 * @author Semih Saydam
 * @since 23.01.2022
 */
@Builder
@ToString(includeNames = true)
class Developer {
    String firstName
    String lastName
    String middleInitial
    String email
    Date hireDate
    List languages

    static void main(String[] args) {
        Developer semih = Developer.builder().firstName("semik").lastName("Saydam").middleInitial("M").email("sermihsaydamz@gmail.com")
                                             .hireDate(new Date()).languages(["Java","Groovy"]).build()

    assert semih.firstName == "Semih"
    assert semih.lastName == "Saydam"
    assert semih.languages.size() == 2
    }

}
