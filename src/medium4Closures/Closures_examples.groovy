package medium4Closures
/**
 * @author Semih Saydam
 * @since 18.01.2022
 */
class Closures_examples {
    static void main(String[] args) {
        //closure is an object and can be used or passed around your programs.
        //just a block of code inside of the curly brace
        def c = { }
        println(c.class.name)
        println(c instanceof Closure)

        // bir method ama ismi yok, anonymous function. Sadece body'si var
        def sayHello = {
            println("Hello")
        }
        sayHello()

        // eğer parametre vermek istersen parametreyi, fonksiyon body'sinden -> ile ayırıyorsun
        def sayHi = { name ->
            println("Hello, $name")
        }
        sayHi("Semih")

        // each methodu listedeki her elemanı gezer. İçine de bir closure alabilir. Yani elemanları gezerken bir fonksiyon uygulayabilir
        /* Eğer closure'a bir parametre geçmediysen burada special reserved keyword olarak "it" kelimesi vardır.  */
        /* Zaten nums.each({}) yaptıktan sonra kendiliğinden {Integer it->} şeklinde intellij bize gösteriyor reserved keyword'ü */
        List nums = [1,4,7,4,30,2]
        nums.each {println(it)}
        // yine istersen it'i kullanmayıp kendi parametreni ekleyebilirsin. it sana hız kazandırıyor burada
        //nums.each {num -> println(num)}

        //
//        timesTen(10, {println(it)})
        //Eğer bir method'un son parametresi bir closure ise aşağıdaki gibi ()'leri silebilirsin. Burada method içinde method yapıyorsun aslında.
        // Closure'a çok farklı şeyler de yaptırabilirdin. Method daha da kapsamlı olabilirdi ve bir yerinde closure kullanıyor olurdun
//        timesTen(10) {println(it)}

        //Integer'ın methodlarından olan times'da closure kabul eder. Böylelikle o method'u times kadar çağırırsın
        10.times {println(it)}
        // 3 tane random numara üret mesela clouse ile
        Random rand = new Random()
        3.times {println rand.nextInt()}

    }

    /* Closures are objects & last param */
    //TimesTen adında normal bir method tanımlayalım, bu method içine bir parametre bir de closure alsın. Yani closure'da bir object :)
    def timesTen(num, closure){
        closure(num * 10)
    }
}
