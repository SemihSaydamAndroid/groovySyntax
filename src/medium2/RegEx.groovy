package medium2
import java.util.regex.*;
/**
 * @author Semih Saydam
 * @since 15.01.2022
 */
class RegEx {

    //find operator(=~)         : You can directly use the find operator =~ to build a java.util.regex.Matcher instance :
    //match operator(==~)       : The match operator(==~) is a slight variation of the find operator, that does not return a matcher
    //                              but a boolean and requires a strict match of the input string :
    //pattern operator(~string) : The pattern operator (~) provides a simple way to create java.util.regex.Pattern instance:

    /*  Pattern  */                                      /*   Meaning   */
    // abc                                              matches any string that contains a followed by b followed by a c
    // b[aeiou]t                                        matches "bat","bet", "bit","bot", and "but"
    // <TAG\b[^>]*>(.*?)</TAG>                          matches the opening and closing pair of a specific HTML tag
    // \b[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}\b        matches any email adress
    //www.regular-expressions.info/refquick.html


    static void main(String[] args) {
        // Java
        Pattern pattern = Pattern.compile("abc")
        println(pattern)
        println(pattern.class)
        // Groovy

        String slashy = /a\b/
        String url = $/http:\/\/semih.com\/blog/$

        println(slashy.class)

        //Aşağıdaki kullanım 24üncü satırdakine denk.~Tilda bu işi yapıyor
        def pattern2 = ~/a\b/
        println(pattern2.class)

        // Find | Match (*** important : finder and matcher *** )

        def text = "semih saydam warrior" //true
        def pattern3 = ~/warrior/
        def finder = text =~ pattern3
        println(finder)
        println(finder.size())

        def matcher = text ==~ pattern3
        println(matcher)  //false because cannot match

        def text2 = "semih saydam warrior"
        def pattern4 = ~/semih saydam warrior/
//        def pattern4 = ~/[a-z ]+/   //içine boşluk da bıraktım çünkü 100de 100 match olursa buluyor matcher
        def matcher2 = text ==~ pattern4
        println(matcher2) //this matched, true

        if (matcher2){/*  do something  */  }

        text2 = text.replaceFirst(pattern4,"semikko")
        println(text2)

    }

}
