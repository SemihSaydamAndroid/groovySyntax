package mediumCompileTimeMetaProg.compileStatic

import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode

/**
 * @author Semih Saydam
 * @since 23.01.2022
 */
@CompileStatic
class someClass {

    String foo(){
        "foor"
    }
    String bar(){
        "bar"
    }

    @CompileStatic(TypeCheckingMode.SKIP)
    void noReturn(){

    }
}
