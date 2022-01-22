package medium6oop.groovyBeans
/**
 * @author Semih Saydam
 * @since 22.01.2022
 *
 * - Direct field access
 *
 */
class DoubleBean {
    //Değişkeni public yaptık Direct field access'i denemek için  --> app.groovy
    public Integer value
    void setValue(value){
        this.value = value
    }

    Integer getValue(){
        value * 2
    }

}

