package workingWithBuilders.objectGraphBuilder

import groovy.transform.ToString

/**
 * @author Semih Saydam
 * @since 23.01.2022
 */

@ToString(includeNames = true)
class Books {
    String title, summary
    List<Section> sections = []
}

@ToString(includeNames = true)
class Section {
    String title
    List<Chapter> chapters = []
}
@ToString(includeNames = true)
class Chapter{
    String title
}

// Java style
/*
public Book createBook(){
    Book b = new Book();
    b.setTitle("my book")
    b.setSummary("my summary")
    
    Section s = new Section();
    s.setTtitle("Section 1");

    Chapter c1 = new Chapter();
    c1.setTitle("Chapter 1");
    Chapter c2 = new Chapter();
    c2.setTitle("Chapter2");

    s.addChapters(c1,c2)
    b.getSections().add(s)

    return book;
}
 */

ObjectGraphBuilder builder = new ObjectGraphBuilder()
def book = builder.book(title:"Groovy book", summary: "xx") {
    Section(title: "section1"){
        Chapter(title:"chapter1")
        Chapter(title:"chapter2")
        Chapter(title:"chapter3")
    }
    Section(title: "section2"){
        Chapter(title:"chapter4")
        Chapter(title:"chapter5")
        Chapter(title:"chapter6")
    }
}
println(book)

assert book.title == "Groovy book"
assert book.Section.size == 2
assert book.Section[0].title == "section1"
assert book.Section[0].Chapter.size() == 3