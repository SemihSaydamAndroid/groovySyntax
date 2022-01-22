package mediumMetaProgramming.runtime
/**
 * @author Semih Saydam
 * @since 22.01.2022
 *
 * Every read acces to a property can be intercepted by overriding the getProperty() method of the current object.
 *
 */
class GetPropertyDemo {


    //burada getter'ı override ediyorsun :

    def prop1 = "prop1"
    def prop2 = "prop2"
    def prop3 = "prop3"

    def getProperty(String name){
        println("getProperty() called with argument $name")
        //return

        if (metaClass.hasProperty(this,name)){
            metaClass.getProperty(this, name)
        } else {
            println("else")
            return "sth"
        }

    }

    static void main(String[] args) {
        def pd = new GetPropertyDemo()
        println(pd.prop1)
        println(pd.prop2)
        println(pd.prop3)
    }
}

