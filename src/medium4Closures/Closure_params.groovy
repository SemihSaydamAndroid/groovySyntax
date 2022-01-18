package medium4Closures
/**
 * @author Semih Saydam
 * @since 18.01.2022
 */
class Closure_params {
    static void main(String[] args) {

        //implicit parameter (örtük)
        //bunu istersen def foo = {name-> println (name)} şeklinde de verebilirdin ama hiçbir şey vermezsen de it oluyor çünkü reserved.
        // Ve örtük olarak parametre vermiş oluyorsun.
        def foo = {println( it )}
        foo("semih")

        //Argüman vermesen de direkt çalışacaktır. Hatta çağırırken argümanlı da çağırsan çalışacktır :
        def noParams = {println("no parameter")}
        noParams()
        noParams("Semih")
        //fakat eğer argüman vermeyeceksen ve argüman verildiğinde patlasın istiyorsan sadece -> yazman yeterli :
        def noParams2 = { -> println("no parameter2")}
        noParams2()
        //noParams2("Semih") //Burada hata alıyor olacaktır. Çünkü -> diyerek biz bu closure'ın argüman almayacağını söyledik.


        //birden fazla parametre verme
        //Bu parametrelere def ile veya String first, String last vb. şekilde type'da verebilirsin.
        def sayHi = { first, last ->
            println("Hello, $first $last")
        }
        sayHi("Semih", "Saydam")

        //Default value parameter
        def greet = {String name, String greeting = "hi" ->
            println "$greeting, $name"
        }
        greet("Semih", "Hello")
        greet("Semih") // greeting parametresine değer yollamazsan da hata almazsın. Default valuesi var, gidip default değeri kendi yerine koyar


        /* var-arg */
        // Burada kaç tane argüment vereceğimizi bilmiyoruz/kararsız. İşte bu durumda varArg'ı kullanabiliriz. Kaç tane parametre gönderdiğine bakmaksızın kabul edecektir
        def concat = { String... arguments ->
            args.join('-')
        }
        println(concat("Semih", "Esra"))
        println(concat("Semih", "Esra", "Filiz", "Mehmet", "Samet", "Nejla")) //istediğin kadar argüman yollayabilirsin

        // someMethod'daki maximumNumberOfParameters ve parameterTypes ile parametre sayısına && parametre type'larına ulaşabiliyorsun
        // 2, [int, int]
        def someClosure = {int x, int y -> x + y}
        someMethod (someClosure)

    }

    static def someMethod(Closure c){
        println("...")
        println(c.maximumNumberOfParameters)
        println(c.parameterTypes)
    }
}
