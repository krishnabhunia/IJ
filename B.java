public class B extends Thread {
    public void run() {
        try {
            int var_job2 = 100;
            System.out.println("this is job 2 of class B");
            Thread.sleep(3000);
            var_job2 = 200;
            System.out.println("this is job 2 of class B and modified variable");
        } catch (Exception ex) {
            System.out.println("there is an exception" + ex);
        }
    }
}
