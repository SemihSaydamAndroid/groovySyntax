package medium6oop
/**
 * @author Semih Saydam
 * @since 22.01.2022
 */
@groovy.transform.Canonical
class Tweet {

    String post
    String username
    Date postDateTime

    private List favorites = []
    private List retweets = []
    private List metions = []
    private List hastags = []

    void favorite(String username){
        favorites << username
    }

    List getFavorites(){ favorites }

    void retweet(String username){
        retweets << username
    }

    List getRetweets(){ retweets }

    List getMentions(){
        String pattern = /\B@[a-z0-9_-]+/
        post.findAll(pattern)
    }

    List getHashtags(){
        String pattern = ~/(?:\s)[##]+([A-Za-z0-9-_]+)/
        post.findAll(pattern)

    }
}

class app2{
    static void main(String[] args) {
        Tweet tweet = new Tweet(post: "This Groovy Course by @therealdanvega is awesome! #Java #groovylang", username: "@threaldanvega", postDateTime: new Date())
        println(tweet)

        tweet.favorite("@ApacheGroovy")
        tweet.retweet("@ApacheGroovy")

        println(tweet.getFavorites())
        println(tweet.getRetweets())

        println(tweet.getMentions())
        println(tweet.getHashtags())

    }
}
