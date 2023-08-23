
public class multiThreading_Classes {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        Thread t = new Thread(new C());

        objA.start();
        objB.start();
        objC.run();
        t.start();
    }
}