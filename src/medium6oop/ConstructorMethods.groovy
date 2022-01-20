package medium6oop

import groovy.transform.ToString

/**
 * @author Semih Saydam
 * @since 20.01.2022
 */
@ToString
class ConstructorMethods {

    String first, last

    //constructor
    ConstructorMethods(String fullName){
        List parts = fullName.split(' ')
        first = parts[0] //Burada this.first = parts[0] da diyebilirsin ama groovy bunda da kolaylık sağlıyor tabi
        last = parts[1]
    }

    //methods
    public void foo(String a, String b){
        //do stuff
    }

    String getFullName(){
        "$first $last"//Burada return keyword'üne de gerek yok onu da otomatik ayarlıyor bizim için. String yazdığın için zaten methoda, java olsa hata verir return'ünü yaz derdi
    }

    def bar(){

    }

    static String doGoodWork(){
        println("doing good work...")
    //aynı statik değişken gibi bu method da direkt instance oluşturmadan çağırılabiliyor
    }

    List someMethod(List nums = [1,2,3]){ //default parameter verme
    }

    def concat(Integer... args){ //integer args da yapılabiliyor. Method çağrılırken birden çok | istediğin kadar argüman verebiliyorsun.
        println(args.length)
    }



    static void main(String[] args) {
//        ConstructorMethods cunstructorMethods = new ConstructorMethods(first: "Semik", last: "Saydam") //Gördüğün gibi hiç constructor tanımlamasan bile senin için defaultta bir constructor yapıyor.
//        println(cunstructorMethods)

        //tabii yine de kendi constructor'ımızı oluşturabiliriz. Yukarıda bir tane oluşturalım ve burada instance oluşturduğumuzda çağırılsın :
//        ConstructorMethods constructorMethods = new ConstructorMethods("Semih Saydam")
//        println(constructorMethods)

        ConstructorMethods constructorMethods = new ConstructorMethods("semik saydam")
        constructorMethods.concat(1,2,3,45,66)
    }
}
