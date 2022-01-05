package medium1

class InputString {
    static void main(String[] args) {

        print("Whats your name ")
        def firstName = System.in.newReader().readLine()
        print("Hello " + firstName)

        print("Enter a number ")
        def number1 = System.in.newReader().readLine().toDouble()
        print("Enter a number ")
        def number2 = System.in.newReader().readLine().toDouble()

        printf("%.2f + %.2f = %.2f \n", [number1, number2, (number1 + number2)])

    }
}
