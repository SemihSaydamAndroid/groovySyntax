package medium4Closures
/**
 * @author Semih Saydam
 * @since 18.01.2022

 https://dzone.com/articles/groovy-closures-owner-delegate
 https://groovy-lang.org/closures.html#_delegate_of_a_closure
 */
class ClosureDelegate2 {

    static void main(String[] args) {

        def writer = {
            append 'Semih'
            append 'Saydam'
        }
        StringBuffer sb = new StringBuffer()
        writer.resolveStrategy = Closure.DELEGATE_FIRST
        writer.delegate = sb
        writer()
    }

    //Bu methodu ekledikten sonra çalışacaktır. Ama burada olay delegate etmekte. Yukarıda StringBuffer kullanrak sorumluluğu writer'dan streamBuffer'a veriyoruz
    //Böylelikle çalışabilmiş oluyor.

    static def append(String s){
        println("append() methodu $s argümanı ile çağırıldı")
    }
}
