package medium2.astTransformations.Canonical

import groovy.transform.Canonical
/**
 * @author Semih Saydam
 * @since 12.01.2022
 */
@Canonical
class Customer {

    // canonical tema-annotation combines the @EqualAndHasCode, @ToString and @TupleConstructor
    String first, last
    int age
    Date since
    Collection favItems = ['Food']
    def object

    static void main(String[] args) {
        def d = new Date()
        def anyObject = new Object()
        def c1 = new medium2.astTransformations.Immutable.Customer(first: 'Semih', last: 'Saydam', age: 25, since: d, favItems: ['Books', 'Games'],anyObject)
        def c2 = new medium2.astTransformations.Immutable.Customer('Semih', 'Saydam', 25, d, ['Books', 'Games'], anyObject)
        assert c1 == c2
    }
}
