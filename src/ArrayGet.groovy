class ArrayGet {

    static void main(String[] args) {

        def array = [2,3,4,5,6,7,8]
        println("2nd array element " + array[1])
        println("3rd array element " + array.get(2))
        println("Ana listenin eleman sayısı : " + array.size() + "\n")

        array.add(3)
        println("eleman eklendi, dizinin yeni eleman sayısı : " + array.size() + "\n" + "yeni liste : " + array + "\n")

        array + [29,30]
        array - [30]
        println("Is empty" + array.isEmpty())
        println("Birinciden dördüncüye kadar" + array[0..3])

        println("Matches " + array.intersect([2,3,4]))
        println("Reverse " + array.reverse())
        println("Sort " + array.sort())
        println("Son eleman " + array.pop())

        def allTypeArray = ['Semih', 40, 4.3, [3,4,5]]
        println("ilk eleman : " + allTypeArray[0])
        println("liste içindeki listenin ilk elemanı : " + allTypeArray[3][0])
        println("Ana listenin size'ı : " + allTypeArray.size())
    }

}
