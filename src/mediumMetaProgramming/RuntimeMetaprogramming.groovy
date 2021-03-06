package mediumMetaProgramming

/*
Groovy Object

Create a class and implement each of the following methods from the GroovyObject Interface
invokeMethod
getProperty
setProperty
Expando

Create an Expando Class
Add some properties and methods to it
Knowing that a class's metaclass is an expando create your own class and add properties and methods to it.
TimesTwo

Add a new method to the Integer class called timesTwo
This method should be available to any instance of Integer
What is another approach that we can take to create this method that would be a little more controlled?

 */

class Developer {

    String first, last, email
    List languages

    Developer(){}

    def invokeMethod(String name, Object args){  //olmayan bir method çağırıldığında invokeMethod devreye girer.
        println("invokeMethod() called with args $args")
    }

    def getProperty(String property){
        println("getProperty called...")
        metaClass.getProperty(this, property)
    }

    void setProperty(String property, Object newValue){
        println("setProperty() called with name $property and newValue $newValue")
        metaClass.setProperty(this, property, newValue)
    }
}

// *  *  * GroovyObjectDemo
Developer developer = new Developer(first: "Semih", last: "Saydam", email: "semihsaydamz@gmail.com")
developer.writeCode("Groovy")
println(developer.first)
developer.languages = ["Groovy", "Java"]

// *  *  * ExpandoDemo
Expando e = new Expando()
e.first = "Semih"
e.last = "Saydam"
e.email = "semihsaydamz@gmail.com"

e.getFullName = { "$first $last" }
println( e.toString())
println( e.getFullName())

@groovy.transform.ToString(includeNames = true)
class Person {
    String first, last
}

Person p = new Person(first: "Semih", last: "Saydam")
p.metaClass.email = "semihsaydamz@gmail.com"
println p
println p.email

// *  *  * SquaredDemo
Integer.metaClass.timesTwo = {delegate * 2}

println 2.timesTwo()
println 4.timesTwo()
println 5.timesTwo()
println 10.timesTwo()
