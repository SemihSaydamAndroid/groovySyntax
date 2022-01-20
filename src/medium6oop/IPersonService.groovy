package medium6oop

interface IPersonService {

    default public void doSth(){  //Eğer methodu default tanımlarsan, methoda body verebiliyorsun ve bu interface'i implement eden class'lar bu methodu override edemeyecek
        println "do sth"
    }

}