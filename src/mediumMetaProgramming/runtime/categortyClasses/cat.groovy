package mediumMetaProgramming.runtime.categortyClasses

//String.metaClass.shout = { -> toUpperCase()}
//println("Hello, World!".shout())

use(StringCategory) {      //use sayesinde sdaece bu blok içinde çalışacak o kod.
    println("Helo,World!".shout())
}

//    println("Helo,World!".shout())   // Buraya yazarsan shout diye method yok diyecek :)





