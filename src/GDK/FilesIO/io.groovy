package GDK.FilesIO

println("Please enter your favoite sports team : ")

String team
System.in.withReader { reader ->
    team = reader.readLine()
}
println("Your faovirte team is : $team")