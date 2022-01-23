package workingWithBuilders

import groovy.xml.MarkupBuilder

/**
 * @author Semih Saydam
 * @since 23.01.2022
 */

FileWriter fileWriter = new FileWriter('html/about.html') //writer yapıp aşağıdaki markupbuilder'ın içine verdik. Markup'ını yapınca gidip dosya içinde yapcak yani çok iyi
MarkupBuilder markupBuilder = new MarkupBuilder(fileWriter)

List courses = [
        [id:1, name: 'Apache groovy'],
        [id: 2, name: 'Spring boot']
]

markupBuilder.html {
    head{
        title: 'Semih saydam hk'
        description: "Bu sayfayla alakalı açıklama"
        keywords: "Java, groovy, smh"
    }
    body{
        h1 'About me'
        p 'This is a bunch of text about me'
        section{
            h2 'courses'
            table {
                tr{
                    th 'id'
                    th 'name'
                }
//                tr{
//                    td '1'
//                    td 'Groovy'
//                }
//                tr{
//                    td '2'
//                    td 'Spring boot'
//                }                               //Buradaki tr'lerin yerine liste vericez
                courses.each {
                    course ->
                    tr{
                        td course.id
                        td course.name
                    }
                }
            }
        }
    }
    
    /*
    Output :

    <html>
  <head />
  <body>
    <h1>About me</h1>
    <p>This is a bunch of text about me</p>
    <section>
      <h2>courses</h2>
      <table>
        <tr>
          <th>id</th>
          <th>name</th>
        </tr>
        <tr>
          <td>1</td>
          <td>Groovy</td>
        </tr>
        <tr>
          <td>2</td>
          <td>Spring boot</td>
        </tr>
      </table>
    </section>
  </body>
</html>

     */
    
}


