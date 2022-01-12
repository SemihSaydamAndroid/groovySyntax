package medium2.astTransformations.sortable

import groovy.transform.Sortable
import groovy.transform.ToString
/**
 * @author Semih Saydam
 * @since 12.01.2022
 */
@Sortable
@ToString
class Customer {

    // for more information ASTTransformations
    // http://docs.groovy-lang.org/next/html/gapi/groovy/transform/package-summary.html

    String first, last
    int born

    static void main(String[] args) {
        def p1 = new Customer(first: "Semih", last: "Saydam")
        def p2 = new Customer(first: "Esra", last: "Saydam")
        def people = [p1, p2]
        println(people)
    }

}



