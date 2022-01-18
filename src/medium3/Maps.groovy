package medium3
/**
 * @author Semih Saydam
 * @since 18.01.2022
 */
class Maps {
    static void main(String[] args) {
        // map
//        Map map = [:]
//        LinkedHashMap map = [:]
        def map = [:] /*def yerine yukarıdaki gibi tipini de verebilirsin*/
        println(map)
        println(map.getClass().name)

        def person = [first: "Semih", last: "Saydam", email: "semihsaydamz@gmail.com"] //key: value
        println(person)
        println(person.first)
        //add
        person.twitter = "@semihsaydamz"
        println(person)

//        def twitter = [username: "@semihsaydamz", "Email Address": "semihsaydamz@gmail.com"]
        def emailKey = "EmailAdress"
        def twitter = [username: "@semihsaydamz", (emailKey): "semihsaydamz@gmail.com"] //parantezleri koymazsan emailKey olarak anlar
        println(twitter)

        println(person.size())
        println(person.sort()) //sadece key'leri sıralıyor
        println(twitter.values()) //Collection halinde values'i veriyor.

        // looping through person
        for (entry in person){
            println(entry) //burada key=value şeklinde getirecektir.
        }

        for (key in person.keySet()){
            println($key:${person[key]}) //key'ler arasında dolaşıp $key: ve o key için value'yi çektik
        }

        // each | eachWithIndex (closures)

    }

}
