
//Expando expando = new Expando() //
//expando.name = 'Semih'
//expando.writeCode = { -> println("$name loves to write code")}
//expando.writeCode()


class Developer {

}

//per instance
Developer semik = new Developer()
semik.metaClass.name = 'semikko'
semik.metaClass.writeCode = { -> println("$name loves to write code")}
semik.writeCode()

//every instance
String.metaClass.shout ={ -> toUpperCase()}
println("Hello dan".shout())
