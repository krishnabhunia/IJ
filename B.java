public class B extends Thread {
    public void run() {
        try {
            System.out.println("this is job 2 of class B");
            Thread.sleep(3000);
            System.out.println("this is job 2 of class B and modified variable");
        } catch (Exception ex) {
            System.out.println("there is an exception" + ex);
        }
    }
}
