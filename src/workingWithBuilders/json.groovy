//package workingWithBuilders
//
//import groovy.json.JsonBuilder
//
//JsonBuilder builder = new JsonBuilder()
//
//builder.books{
//
//    currentBook {
//        title 'The 4 hour work werr'
//        istbn '32482934823'
//        author(first: 'semih', last: 'saydam')
//        related 'The 4 hour body', 'the 4 hour chef' //liste veriyor "releated": ["XXX", "yyy"]
//    }
//
//    nextBook {
//        title 'The 4 asdas work werr'
//        istbn 'asd'
//        author(first: 'semih', last: 'saydam')
//        related 'The 4 hour body', 'the 4 hour chef' //liste veriyor "releated": ["XXX", "yyy"]
//    }
//
//}
//
////Dosyaya prettyString kayd
//new File('json/books.json').write(builder.toPrettyString())
//
//
//println(builder.toString())
//// output : {"books":{"book":{"title":"The 4 hour work werr","istbn":"32482934823","author":{"first":"semih","last":"saydam"},"related":["The 4 hour body","the 4 hour chef"]}}}
//println(builder.toPrettyString())
//// output :
////        {
////            "books": {
////            "currentBook": {
////                "title": "The 4 hour work werr",
////                "istbn": "32482934823",
////                "author": {
////                    "first": "semih",
////                    "last": "saydam"
////                },
////                "related": [
////                        "The 4 hour body",
////                        "the 4 hour chef"
////                ]
////            },
////            "nextBook": {
////                "title": "The 4 asdas work werr",
////                "istbn": "asd",
////                "author": {
////                    "first": "semih",
////                    "last": "saydam"
////                },
////                "related": [
////                        "The 4 hour body",
////                        "the 4 hour chef"
////                ]
////            }
////        }
////        }
//
