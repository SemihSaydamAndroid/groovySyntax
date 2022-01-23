package workingWithBuilders

import groovy.xml.MarkupBuilder

MarkupBuilder markupBuilder = new MarkupBuilder()
markupBuilder.omitEmptyAttributes = true
markupBuilder.omitNullAttributes = true

markupBuilder.sports {
    sport(id:1){
        name 'baseball'
    }
    sport(id:2){
        name 'football'
    }
    sport(id:3){
        name 'basketball'
    }
    sport(id:4){
        name 'Hockey'
    }
    }

    //Output -->

//            <sports>
//              <sport id='1'>
//                  <name>baseball</name>
//              </sport>
//              <sport id='2'>
//                  <name>football</name>
//              </sport>
//              <sport id='3'>
//                  <name>basketball</name>
//               </sport>
//              <sport id='4'>
//                  <name>Hockey</name>
//               </sport>
//              </sports>
//}