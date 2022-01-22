package medium6oop.groovyBeans
/**
 * @author Semih Saydam
 * @since 22.01.2022
 */
//Java'da yazdığımız JavaBean employeeBean'in groovy karşılığı:
@groovy.transform.ToString
class EmployeeBeanGroovy implements Serializable{

    String first, last, email
    //--> Build --> Compile EmployeeBeanGroovy --> out file (veya yukarıdaki çekiç Build)
    // O dosyaya baktığında Groovy bean için her koşulu sağlıyor:
        // 3 private field -- // no arg constructor -- // toString -- // özellikler için getter ve setters
    //Groovy bean tek satırda ve implement serializable ile oluyor.


    //Eğer kendi getter & setter'ını yazmak istersen :
    String fullName
    void setFullName(String name){
        fullName = name
    }
    String getFullName(){
        "Full name ${fullName}"
    }
    //Tekrar compile ettikten sonra out kısmından incelediğinde göreceksin ki , groovy senin getter setter'ını ezmiyor. Oraya da ekliyor
}

class app {
    static void main(String[] args) {
//        EmployeeBean emp = new EmployeeBean(first: "Semih", last: "Saydam", email: "semihsaydamz@gmail.com")
//        println(emp)

//        EmployeeBean emp = new EmployeeBean()
//        emp.first = "Semih"
//
//        println(emp.first)

        DoubleBean doubleBean = new DoubleBean()
        doubleBean.value = 100

        println(doubleBean.value)   // Burası bize getValue'deki * 2 yi uygulayıp dönecek
        println(doubleBean.@value)  // @ işareti ile ise valuenin asıl değerini alıyorsun. Yukarıda 100 yaptığın için 100 alıyon, getter'daki ,işlemlere girmemiş halini

    }
}