package GDK.threads.java;

/**
 * @author Semih Saydam
 * @since 25.01.2022
 */
public class Application {

    public static void main(String[] args) {
        Runnable demo = new RunnableDemo();

        Thread t = new Thread(demo);
        t.start(); //calls run

        //java 8
        //since runnable is a functional interface we can make an instance with a lambda expression

        //This is just the start of threads. I would encourage you to read up on threads in Java if you want to learn more

    }
}
