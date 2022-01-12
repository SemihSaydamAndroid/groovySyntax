package medium2.astTransformations

import groovy.transform.Immutable
/**
 * @author Semih Saydam
 * @since 12.01.2022
 */
@Immutable
class Customer {

    String first, last
    int age
    Date since
    Collection favItems

    void sth(){
        //Immutable makes this private and final
        //first = 5
    }
    //add cunstructor / hascode etc...

}



