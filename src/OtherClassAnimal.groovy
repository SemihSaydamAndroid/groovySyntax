class OtherClassAnimal {
    static void main(String[] args) {

        def instanceAnimal = new Animal('cat','Miyav')
        println("$instanceAnimal.name says $instanceAnimal.sound")

        instanceAnimal.setSound('miiiyavvvv')
        println("$instanceAnimal.name says $instanceAnimal.sound")

        instanceAnimal.run()

        println(instanceAnimal.toString())

        def dogGrover = new Dog('Grover', 'Grr', 'Derek')

        instanceAnimal.makeSound()
        dogGrover.makeSound()
    }
}
