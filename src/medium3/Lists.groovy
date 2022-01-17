package medium3
/**
 * @author Semih Saydam
 * @since 16.01.2022
 */
class Lists {
    static void main(String[] args) {

        /* List */
        List nums = [1,2,3,4,5,6,7,8,9]
        println(nums)
        println(nums.class.name)

        // add | remove | get | clear

        nums.push(99)
        nums.putAt(0,77)
        nums[0] = 78
        println(nums)

        // plus operator
        println(nums + [3,4,5])
        nums + 7
        nums << 66

        //
        nums.pop() //remove the last element
        nums.removeAt(0)
        def newList = nums - 3 //belirli elementi silme

        println( nums.getAt(0..3)) //support range.. ilk 4 elemanı getircek böylece.
        // temizlemek için nums.clear yada direkt nums = []

        // dizi içinde dolanmak çok kolay ve kullanışlı
        for (x in nums){
            println(x)
        }

        //bunu closures ile yapmak daha iyi tabi.
        nums << [3,4,5]
        nums << [1,2]
        println(nums)
        /* flatten */
        println(nums.flatten()) // yukarıdaki printte liste içinde liste yapıyor. flatten method ise içerdeki listeleri açıp ana listeye dahil ediyor

        /* unitque */ //sadece eşsiz eleementleri gösterir
        println(nums.unique())

        /* Set */
        def numbers = [1,2,3,4,6,7,8,4,4,11,42,156,4,5,6,7,5] as Set // Eğer sıralı olmasını istiyorsan : as SortedSet
        println(numbers) //Set olarak tanımladığın için duplicate olanları almıyor.
        println(numbers.class.name) //LinkedHashSet
    }
}
