package mediumMetaProgramming.runtime

import com.sun.javafx.util.TempState

// Groovy supports the concept of methodMissing. This method differs from invokeMetgod in that is is only
// Invoked in case of failed method dispatch, when no method can be found for the given name and/or the given arguments :

class MyEmployee {


    /// Tanımlanmamış bir method varsa onu yakalıyor ve yine de çalıştırıyor o methodu. Super cool
    def methodMissing(String name, def args){

        if ( name != 'someMethod'){
            throw new MissingMethodException(name, args)
        }

        println("Method Missing called on: $name")
        println("with argumenmts ${args}")
    }
}

MyEmployee emp = new MyEmployee()
emp.someMethod(1,2,3)
TempStat.someOtherMethod(4,5,6)

