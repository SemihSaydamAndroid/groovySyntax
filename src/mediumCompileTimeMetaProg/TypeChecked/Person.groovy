package mediumCompileTimeMetaProg.TypeChecked
/**
 * @author Semih Saydam
 * @since 22.01.2022
 */
class Person {

    String firstName, lastName

    String getFullName(){
        "$firstName $lastName"
    }

}
