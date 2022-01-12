package medium2.astTransformations
/**
 * @author Semih Saydam
 * @since 12.01.2022
 */
class customerCall {
    static void main(String[] args) {
        def d = new Date()
        def c1 = new Customer(first: 'Semih', last: 'Saydam', age: 25, since: d, favItems: ['Books', 'Games'])
        def c2 = new Customer('Semih', 'Saydam', 25, d, ['Books', 'Games'])
        assert c1 == c2
    }
}
