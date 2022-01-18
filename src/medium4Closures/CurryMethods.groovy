package medium4Closures
/**
 * @author Semih Saydam
 * @since 18.01.2022
 */
class CurryMethods {
    static void main(String[] args) {

        def log = { String type, Date createdOn, String msg ->
            println( "$createdOn [$type] - $msg")
        }

        log("DEBUG", new Date(), "Bu bir debug mesajıdır")
        //Bu güzel bir yapı fakat bundan birden fazla olsaydı? Control + D ile çoklayıp mesajlarını mı değiştirecektin?
        //Zorunlu olmadıkça kendimizi tekrar etmek istemeyiz. İşte burada curry kullanacağız

        def debugLog = log.curry("DEBUG")
        debugLog(new Date(), "Bu bir debug mesajıdır")
        debugLog(new Date(), "Bu başka bir debug mesajıdır")
        //Burada gördüğün gibi log closure'ımıza curry yaparak type'ı her türlü debug gönderdik. Böylelikle sürekli "DEBUG" yazmamış oluyoruz.
        //sürekli new Date yazıyoruz, bunu da curry ile halledelim.

        //Burada debugLog'u da kullanabilirdin ama zahmete gerek yok, orijinal closure'a çift parametre gönderip ikisini de curry'liyoruz
        def todayDebugLog = log.curry("DEBUG", new Date())

        todayDebugLog("Bu bir debug mesajıdır")
        
        //Yani gördüğünüz üzere curry sayesinde tekrarlamadan kaçınıyoruz. Var olan closure'da bazı parametreleri sürekli bizim için set'liyor ve
        //set'lenmiş hali yine başka bir closure haline geliyor. todayDebugLog'da bir closure yani ama CurriedClosure diye geçiyor
        println(todayDebugLog.class.name) //org.codehaus.groovy.runtime.CurriedClosure

        /* right curry - rcurry*/
        def crazyPersonLog = log.rcurry("Önce msg'den başlıyor. Yani sağdan başlıyor   ")
        //rcurry ile sağdan sola doğru curry'lersin yani log closure'ında type,createdOn ve msg geliyor. Biz curry'lerden type'dan başlamıştık. Bunda msg'den başlıyorsun.
        crazyPersonLog("DEBUG", new Date())

        /* index based curry - ncurry*/
        def typeMsgLog = log.ncurry(1, new Date())
        typeMsgLog("ERROR", "error message")
        //Burada da anlaşılacağı üzere log içinde 3 parametremiz var, sağdan veya soldan yapmak yerine istediğimiz index'i curry'liyoruz.


    }
}
