package GDK.threads.groovy

def t = new Thread() { }  //closure içine runnable verildiği için işimiz baya bir kolaylaşıyor
t.start()

Thread.start() //static olduğu için instance oluşturmadan da çağırabilyorsun.
Thread.start("thread-name") {}

Thread.startDaemon {}
Thread.startDaemon("thread-name") {}

