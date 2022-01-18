package medium4Closures
/**
 * @author Semih Saydam
 * @since 18.01.2022
 */
class ClosureDelegate {

        /*
            this == corresponds to the eclosing class where the closure is defined
            owner == corresponds to the eclosing object where the closure is defined, which may be either a class or a closure
            delegate == corresponds to a third party object where methos calls or properties are resolved whever the receiver of the message is not defined
         */

        def outerClosure = {
            println(this.class.name)
            println(owner.class.name)
            println(delegate.class.name)
            def innerClosure = {
                println(this.class.name)
                println(owner.class.name)
                println(delegate.class.name)
            }
            innerClosure()
        }

            /*
            medium4Closures.ClosureDelegate             this ->outer
            medium4Closures.ClosureDelegate             owner->outer
            medium4Closures.ClosureDelegate             delegate->outer

            medium4Closures.ClosureDelegate             this ->inner
            medium4Closures.ClosureDelegate$_closure1   owner ->inner
            medium4Closures.ClosureDelegate$_closure1   delegate ->inner

            delegate ve owner için dışardaki outerClosure owner oluyor..
            */


    static void main(String[] args) {
        def demo = new ClosureDelegate()
        demo.outerClosure()
    }

}


