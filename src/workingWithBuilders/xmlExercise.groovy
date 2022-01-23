package workingWithBuilders

import groovy.xml.MarkupBuilder

MarkupBuilder markupBuilder = new MarkupBuilder()

builder.books {
    book(isbm:"123123"){
        title("asdfas")
        author("asdfas")
        price("30")
    }
    book(isbm:"123123"){
        title("sdf")
        author("sdf")
        price("303")
    }
    book(isbm:"123123"){
        title("asdfas")
        author("asdddf")
        price("320")
    }
}

