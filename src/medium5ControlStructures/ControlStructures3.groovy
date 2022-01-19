package medium5ControlStructures
/**
 * @author Semih Saydam
 * @since 19.01.2022
 */
class ControlStructures3{

    static void main(String[] args) {

        //while
        List numbers = [1,2,3]
        while ( numbers ) {
            numbers.remove(0) //Bunu yapmazsan sonsuz p'a gier
        }
        assert numbers == []

        //for
        List nums = [1,2,3]
        for (i in nums){
            println(i)
        }
//        for (j in 1..20){} //range de kullanabiliyorsun yine

        Integer a = 1
        while (true){ //infinite loop
            a++
            break
        }
        assert a == 2

        for (String s in 'a'..'z'){
            if ( s == 'a') continue
            println(s)
            if ( s > 'b') break
        }

        /* exception handling */

        //Java
        /*
        public void foo() throws Exception {
            throw new Exception()
        }
        */

        List log = []
        try{
            foo()
        } catch( Exception e){
            log << e.message
        } finally {
            log << 'finally'
        }
        println(log) //[Foo exception, finally]

        //java7 multi catch syntax
        try{
            //sth
        } catch( FileNotFoundException | NullPointerException e){
            println(e.class.name)
            println(e.message)
        }

    }
    //groovy
    def static foo(){
        //do stuff
        throw new Exception("Foo exception")
    }
}
