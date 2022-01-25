package GDK.threads.groovy

List numbers = []

//push
10.times{
    println( "push:\t $it")
    numbers << it
}

println(numbers)

//pop
for (i in 9..0) {
    println("pop:\t ${i}")
    numbers.pop()
}
println(numbers)

//Bu ikisini sırasıyla yaptın. Eğer bu ikisi aynı anda çalışsın istiyorsan? İşte bunun cevabı threads..Jmeter mantalitesi
// --> producer-consumer
