package medium1

class FileOp {
    static void main(String[] args) {

        new File("src/data.txt").eachLine{line -> println "$line" }

        File file = new File("src/data.txt")
        file.append('data7')
        println(file.text)

        println("File Size : ${file.length()} bytes")
        println("File : ${file.isFile()}")
        println("Dir : ${file.isDirectory()}")

        // yeni bir dosya oluşturup içine ilk dosyanın içerini kopyaladı
        def newFile = new File("data2.txt")
        newFile << file.text

        newFile.delete()

        def dirFiles = new File("").listRoots()
        dirFiles.each {item -> file.absolutePath}
    }

}
