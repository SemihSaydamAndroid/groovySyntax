package medium4Closures
/**
 * @author Semih Saydam
 * @since 18.01.2022
 */
class ReviewClosures {

    static void main(String[] args) {

         //method içine closure alıyor ve bu closure'i çağırıyor. Closure bir obje, method içinde durabilir.
         def myClosure = {println("foo")}
         myMethod {myClosure}

         //Create a list and use the each iterate over each item in list and print it out
        List names = ["Semih", "Esra", "Filiz", "Mehmet", "Samet", "Nejla"]
        names.each {name -> println(name)}

         //Create a map of data and iterate over it using the each method
            //This method can take a closure that accepts 1 or 2 arguments
            // Use 2 arguments and print out the key and value on each line
        Map teams = [basketball: "Efes Pilse", football: "Galatasaray SK"]
        teams.each {k,v -> println("$k = $v")}


        // Demonstrate the use of curry
        def greet = {String greeting, String name ->
            println("$greeting, $name")
        }
        greet("Hello", "Semih")
        def sayHello = greet.curry("Hello")
        sayHello("Esra")


        /*
            find || findAll
            any ||every
            groupBy
        */

        List people = [
                [name: 'Semih', city: "Zonguldak"],
                [name: 'Mehmet', city: "Zonguldak"],
                [name: 'Esra', city: "Kastamonu"],
                [name: 'Filiz', city: "Zonguldak"],
                [name: 'Saliha', city: "Kastamonu"],
                [name: 'Saim', city: "Kastamonu"],
        ]

        println(people.find {person -> person.city == "Kastamonu"}) //Gidip Kastamonu olanın ilkini buluyor. person yerine it'de gelir. Tanımladığın parametre
        println(people.findAll {person -> person.city == "Kastamonu"}) //findAll ise gidip hepsini buluyor. ve bunları bir listede getiriyor

        println(people.any {person -> person.city == "Kastamonu"}) //Eğer bir tane bile bulursa true döndürüyor
        println(people.every {person -> person.city == "Kastamonu"}) //Burada ise her birinin Kastamonu olduğunu söylüyorsun ama değil o yüzden false
        println(people.every {person -> person.name.size() >= 4}) //Burada her bir person için name'in size'ına bakıyor. Semih,mehmet.. hep 4 harften büyük isimler olduğundan every yani her biri için sağlandığından true

        def peopleCity = people.groupBy {person -> person.city} //Zonguldak olanları ve Kastamonu olanları group'ladı. Yani person.city'e göre gruplara ayırıyor. Süper
        println(peopleCity)

        def zonguldaklilar = peopleCity["Zonguldak"]  //Aslında people city Zonguldak ve Kastamonu diye ayrıldı. Sen sadece Zonguldak'ı çektin buradan
        def kastamonulular = peopleCity["Kastamonu"]

        zonguldaklilar.each {println(it.name)} //Semih Mehmet Filiz
        println("tek satırda yazmak : ")
        println(people.groupBy {person -> person.city}["Zonguldak"].each {println(it.name)}) //findAll sonrası .each ile devam etme denemesi.

    }

    //Create a Method that accpes a closure as an argument
    //Closure'u bir parametre olarak alan bir method oluşturacağız
    def static myMethod(Closure c){
        c()
    }

}
