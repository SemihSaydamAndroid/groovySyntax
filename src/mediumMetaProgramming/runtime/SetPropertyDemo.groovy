package mediumMetaProgramming.runtime

//You can intercept write access to properties by overriding the setProperty() method :

class POGO{

    String property

    //setProperty methodu ile setter methodu overrite etmiş olduk.

    void setProperty(String name, Object value){
        this.@"$name" = 'overridden'
    }
}

def pogo = new POGO()
pogo.property = 'a'

assert pogo.property == 'overridden'