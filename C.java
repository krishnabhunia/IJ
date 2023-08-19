public class C implements Runnable {
    public void run() {
        try {
            System.out.println("this is job 3 of class C");
            Thread.sleep(3000);
            System.out.println("this is job 3 of class C and modified variable");
        } catch (Exception ex) {
            System.out.println("there is an exception" + ex);
        }
    }
}
