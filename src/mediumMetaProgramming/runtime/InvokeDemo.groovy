package mediumMetaProgramming.runtime
/**
 * @author Semih Saydam
 * @since 22.01.2022

 * - invokeMethod()

 */
class InvokeDemo {

    def invokeMethod(String name, Object args){
        return "called invokeMethod $name $args"
    }

    def test(){
        return "method exists"
    }

    static void main(String[] args) {
        def invokeDemo = new InvokeDemo()
        assert invokeDemo.test() == "method exists"
        assert invokeDemo.someMethod() == 'called invokeMethod someMethod []' //var olmayan bir methodu çağrıyoruz. //invokeMethod sayesinde çağırabildik. Adı aynı değil dikkat et.
    }
}

