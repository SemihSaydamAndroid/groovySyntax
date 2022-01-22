package mediumMetaProgramming.runtime.interceptCacheInvoke

class Developer {

    List languages = []

    def methodMissing(String name, args){

        println("${name}() method was called...")

        if (name.startsWith("write")){
            String language = name.split("write")[1] //write java --> java
            if (languages.contains(language)){
                def impl = { Object [] theArgs ->
                    println("I like to write code in $language")
                }
                getMetaClass()."$name" = impl
            }
        }
    }
}

Developer semih = new Developer()
semih.languages << "Groovy"
semih.languages << "Java"
println(semih.metaClass.methods.size()) //aşağıdaki çağrımı 3-4 kez yapıştır alt alta method sayısı artacaktır :) Amaç methodMissing kaç kez çağırılıyor görmek
semih.writeGroovy() //Böyle bir method yok ama biz gidip hata almakdı çünkü method missing yakaladı
semih.writeGroovy()
semih.writeGroovy()
println(semih.metaClass.methods.size()) //aşağıdaki çağrımı 3-4 kez yapıştır alt alta method sayısı artacaktır :) Amaç methodMissing kaç kez çağırılıyor görmek
semih.writeJava()
semih.writeJava()
println(semih.metaClass.methods.size()) //aşağıdaki çağrımı 3-4 kez yapıştır alt alta method sayısı artacaktır :) Amaç methodMissing kaç kez çağırılıyor görmek
