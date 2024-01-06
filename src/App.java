public class App {
    public static void main(String[] args) throws Exception {
        
        Thread1 td1 = new Thread1();
        Thread2 td2 = new Thread2();

        td1.start();
        td2.start();
        
    }

    
}
