public class Thread2 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        //현재 Thread 우선순위 확인하기
        System.out.println("Thread2 Priority : " + Thread.currentThread().getPriority());

    }

    public static void main(String[] args){
        Thread2 test = new Thread2();
        test.run();

        for(int i=0; i<10; i++){
            System.out.println(i+" : " +Thread.currentThread().getName());
        }
    }
}
