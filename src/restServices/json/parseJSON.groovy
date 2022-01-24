import groovy.json.JsonSlurper

//package restServices.json
//
//import groovy.json.JsonSlurper
//
//def books = '''
//{
//    "books": {
//        "currentBook": {
//            "title": "\\u015fim\\u015fek h\\u0131rs\\u0131z\\u0131",
//            "isbn": "1923912893182938123",
//            "author": {
//                "first": "timoth",
//                "last": "Ferris"
//            },
//            "related": [
//                "\\u015fimek",
//                "h\\u0131rs\\u0131z"
//            ]
//        },
//        "nextBook": {
//            "title": "\\u015fim\\u015fek h\\u0131rs\\u0131z\\u01312",
//            "isbn": "1923912893182938qweqw123",
//            "author": {
//                "first": "timoth",
//                "last": "Ferris"
//            },
//            "related": [
//                "\\u015fimek",
//                "h\\u0131rs\\u0131z"
//            ]
//        }
//    }
//}
//'''
//
//JsonSlurper slurper = new JsonSlurper()
//def json = slurper.parseText(books)
//println(json)
//println(json.books.nextBook.title)

//dosyadan okuma

JsonSlurper slurper = new JsonSlurper()
def json = slurper.parse(new File('data/book.json'))

println(json.books.currentBook)
println(json.books.currentBook.title)
println(json.books.currentBook.author)
println(json.books.currentBook.related)