public class A extends Thread {
    public void run() {
        try {
            System.out.println("this is job 1 of class A");
            Thread.sleep(3000);
            System.out.println("this is job 1 of class A and modified variable");
        } catch (Exception ex) {
            System.out.println("there is an exception" + ex);
        }
    }
}
