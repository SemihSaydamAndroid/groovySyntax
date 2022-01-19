package medium5ControlStructures
/**
 * @author Semih Saydam
 * @since 19.01.2022
 *
 * http://www.groovy-lang.org/semantics.html
 */
class ControlStructures1 {
    static void main(String[] args) {

        /* Type'lara göre bizi false'a düşürecek şeyle :  */
        // Boolean
        assert true
        assert !false
        // Matcher
        assert ('a' =~ /a/)
        assert !('a' =~ /a/)
        // Collection
        assert [1]
        assert ![]
        // Map
        assert [1:'one']
        assert ![:]
        // String
        assert 'a'
        assert !''
        // Number
        assert 1
        assert 3.5
        assert !0
        // None of the above
        assert new Object()
        assert !null

    }
}
