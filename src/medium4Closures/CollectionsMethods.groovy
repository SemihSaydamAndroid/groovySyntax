package medium4Closures
/**
 * @author Semih Saydam
 * @since 18.01.2022
 */
class CollectionsMethods {
    static void main(String[] args) {

        // -------- each & eachWithIndex
        List favNums = [2,21,44,35,8,4]
        for (num in favNums){
            println(num)
        }
        favNums.each {println(it)}   //with closure


        for (int i = 0; i<favNums.size(); i++){
            println("$i:${favNums[i]}")
        }
        favNums.eachWithIndex { int num, int idx ->   /* Burada intellij sana zaten mükemmel şekilde i ve entry şeklinde ayarlıyor. İsimlerini değiştirmene olanak sağlıyor */
            println("$idx:$num")
        }//with closure


        // -------- findAll
        List days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
        List weekend = days.findAll {it.startsWith("S")}
        println(days)
        println(weekend)


        // -------- collect
        List nums = [1,2,2,7,2,7,2,3,4]
        //Bu listedeki item'ları 10 ile çarpıp yeni bir liste oluşturmak istiyoruz.
        List numsTimesTen = []
        nums.each {num ->
            numsTimesTen << num * 10  //her elemanı(each) 10 ile çarp numsTimesTen listesine ekle
        }
        // Bunu collect yapalım
        List newTimesTen = nums.collect {num -> num * 10}

        println(nums)
        println(numsTimesTen)
        println(newTimesTen)

    }
}
