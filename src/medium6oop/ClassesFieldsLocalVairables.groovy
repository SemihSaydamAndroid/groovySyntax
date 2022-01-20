package medium6oop
/**
 * @author Semih Saydam
 * @since 20.01.2022
 */
class ClassesFieldsLocalVairables {

    String firstName, lastName //sen bu şekilde oluşturduğunda zaten arkada private yapıyor, getter sett'ını oluşturuyor otomatik...default private
    def dob
    //private | protexted | public
    protected String f1,f2,f3
    private Date createdOn = new Date()
    public static final String WELCOME_MSG = "hi"//Bu bir constant'tır ve o yüzden genellikle büyük harfle tanımlarsın

    static welcomeMsg = 'Hello' //Bu alana intansce oluşturmadan da ulaşabilirsin. println ClassesFieldsLocalVairables.welcomeMsg şeklinde

    //local variables
    def foo(){   //method'lar da defaultta public tekrar public demiyoruz o yüzden
        String msg = "Hello"
        String firstName = "Semikko"
        println("$msf, $firstName")
    }

    static void main(String[] args) {
    }


}
