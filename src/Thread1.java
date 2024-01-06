public class Thread1 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args){
        Thread1 test = new Thread1();
        test.start();

        for(int i=0; i<10; i++){
            System.out.println(i+" : " +Thread.currentThread().getName());
        }
    }
}