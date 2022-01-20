package medium6oop.traits
/**
 * @author Semih Saydam
 * @since 20.01.2022
 */
class Bird implements FlyingAbility, SpeakingAbility{
    //Gördüğün gibi 2 tane trait aynı anda implement edilebiliyor. Interface'e de benziyor java'daki default(override edilmiyor) methoduna da.
}

class app {
    static void main(String[] args) {
        Bird b = new Bird()
        assert b.fly() == "I'm flying"
        assert b.speak() == "I'm speaking!"
    }
}
