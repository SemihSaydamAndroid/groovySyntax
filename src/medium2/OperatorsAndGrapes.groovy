package medium2
/* search.maven.org */
/*
<dependency>
  <groupId>org.apache.commons</groupId>
  <artifactId>commons-lang3</artifactId>
  <version>3.12.0</version>
</dependency>
 */

@Grapes(
        @Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.12.0')
)

//import org.apache.commons.lang3.text.WordUtils

/**
 * @author Semih Saydam
 * @since 14.01.2022
 */
class OperatorsAndGrapes {
    def static displayName, user
    static void main(String[] args) {

        /* Elvis Operator */
        displayName = user.name ? user.name : 'Anonymous'
        displayName = user.name?: 'Anonymous'

        /* Safe navigation operator */
        //Java
        ControlStructure controlStructure = new ControlStructure()
        if (controlStructure != null){
            //Adress adress = controlStructure.address
        }
        //Groovy
        //p.address yoksa null pointer exception atma. assert'e düşür. ? ile sağlandı
//        def adress = p?.adress
//        assert address = null

        /* http://groovy-lang.org/operators.html */


        String name = "semih saydam"
//        WordUtils wordUtils = new WordUtils()
//        println(wordUtils.initials(name))
    }
}
