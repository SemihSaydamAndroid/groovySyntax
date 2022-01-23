package restServices.xml

import groovy.xml.MarkupBuilder

FileWriter fileWriter = new FileWriter('data/sports.xml')
MarkupBuilder markupBuilder = new MarkupBuilder(fileWriter) //bunun içine yazmazsan içi boş dosya yapar, veriyi kaydetmez.
markupBuilder.doubleQuotes = true

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
