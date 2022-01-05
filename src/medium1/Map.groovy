package medium1
/**
 * @author Semih Saydam
 * @version 0.0.1
 */
class Map {
    static void main(String[] args) {

        def ListMap = [
                'name' : 'Semih',
                'age' : 26,
                'list' : [3,4,5]
        ]

        println("isim : " + ListMap['name'])
        println("yas : " + ListMap['age'])
        println("İçerideki Listedeki üçüncü eleman : " + ListMap['list'][2])

        ListMap.put('job', "Engineer")
        println('Listede job keyi var mı ? : ' + ListMap.containsKey('job'))

    }
}
