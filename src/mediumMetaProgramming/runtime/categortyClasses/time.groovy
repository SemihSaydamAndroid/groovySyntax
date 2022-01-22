package mediumMetaProgramming.runtime.categortyClasses

import groovy.time.TimeCategory

use(TimeCategory){
    println(1.minute.from.now)
    println(10.hours.ago)

    def someDate = new Date()
    println(someDate - 3.months)
}

//println(1.minute.from.now)  //Gördüğün gibi burada çalışmaz. use içindeki blok'ta çalışıyor sadece. efso

