package mediumMetaProgramming.runtime
/**
 * @author Semih Saydam
 * @since 22.01.2022
 */
class propertyMissings {
    
    // Groovy supports the concept of propertyMissing for intercepting otherwise failing property resolutin attemps.

    // field yoksa onu yakalıyor ve ona göre cevap atıyor. Method missing'de de gidip method yoksa onu yakalıyor ve cevap atıyor. Supercool


    def propertyMissing(String name){
        "caught missing property: $name"
    }

    static void main(String[] args) {
        new propertyMissings().bar
    }
}
