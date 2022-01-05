package medium1

class HelloWorld {
    static void main(String[] args) {

        def name = "Semih"
        name = 40

        println("10 + 2 = " + (10 + 2))
        println("10 - 2 = " + (10 - 2))
        println("10 * 2 = " + (10 * 2))
        println("10 / 2 = " + (10.intdiv(2)))
        println("10 % 2 = " + (10 % 2))
        println("\n")

        //Float
        println("6.2 + 4.5 = " + (6.2.plus(4.5)))
        println("6.2 - 4.5 = " + (6.2.minus(4.5)))
        println("6.2 * 4.5 = " + (6.2.multiply(4.5)))
        println("6.2 / 4.5 = " + (6.2 / 4.5))
        println("\n")

        def age = 25
        println("age++ = " + (age++))
        println("++age = " + (++age))
        println("age-- = " + (age--))
        println("--age = " + (--age))

        println("\n")
        //Math functions
        def randomNum = 2.0
        println("Math.abs(-3.5) = " + (Math.abs(-3.5)))
        println("Math.round(-5.3) = " + (Math.round(-5.3)))
        println("randomNum.pow(4) = " + (randomNum.pow(4)))
        println("4.0.equals(3.0) = " + (4.0.equals(3.0)))
        println("randomNum.equals(Float.Nan) = " + randomNum.equals(Float.NaN))
        println("Math.sqrt(81) = " + (Math.sqrt(81)))
        println("Math.cbrt(27) = " + (Math.cbrt(27)))
        println("Math.ceil(3.24) = " + (Math.ceil(3.24)))
        println("Math.floor(3.24) = " + (Math.floor(3.24)))
        println("Math.min(3,5) = " + (Math.min(3,5)))
        println("Math.max(3,5) = " + (Math.max(3,5)))
        //logaritma
        println("Math.log(2) = " + (Math.log(2)))
        println("Math.log10(2) = " + (Math.log10(2)))

        println("Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI)))
        println("Math.toRadians(90) = " + (Math.toRadians(90)))
        println("Math.sin(0.5 * Math.PI) = " + (Math.sin(0.5 * Math.PI)))
        println("\n")

        //random
        println("Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1))
    }
}