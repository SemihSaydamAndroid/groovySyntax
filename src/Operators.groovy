class Operators {

    static void main(String[] args) {

//        def myAge = 8;
//
//        if (myAge == 6){
//            println("Ana sınıfına yönlendiriliyor..")
//        } else if ((myAge > 6) && (myAge < 15)){
//            printf("%d sınıfına yönlendiriliyor..", (myAge-5))
//        } else {
//            println("Liseye yönlendiriliyor")
//        }
//
//        def isTrue = true;
//        println(isTrue ? "True ise bu kısım çalışır" : "False ise bu kısım çalışır" )
//
//        def myNumber = 20
//        println(myNumber == 20 ? "Numara 20dir" : "Numara 20 değildir")

//        def age = 30
//        switch (age){
//            case 0..6 : println("bebek"); break;
//            case 7..12 : println("çocuk"); break;
//            case 12..17 : println("ergen"); break;
//            case 18 : println("genç"); break;
//            default: println("Yetişkin")
//        }

        //For loop
        for (def i = 0; i < 5; i++){println(i + " x")}
        for (j in 2..6){println(j + " yy")}

        def sList = [11,21,31,41,51]
        for (j in sList){println(j+" zzz")}

        def isimListesi =  [1 : "Esra", 2 : "Semih", 3: "Saydam"]
        for (deger in isimListesi){println("$deger.value : $deger.key" + " sırasındadır")}
    }
}
