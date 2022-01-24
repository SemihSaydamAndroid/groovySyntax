package restServices.json

import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {

    currentBook {
        title 'şimşek hırsızı'
        isbn '1923912893182938123'
        author(first: 'timoth', last: 'Ferris')
        related 'şimek', 'hırsız'
    }

    nextBook {
        title 'şimşek hırsızı2'
        isbn '1923912893182938qweqw123'
        author(first: 'timoth', last: 'Ferris')
        related 'şimek', 'hırsız'
    }
}

new File('data/book.json').write(builder.toPrettyString())