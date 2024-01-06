public class ThreadMethod extends Thread{
    @Override
    public void run(){               
        //그 외 thread 실행제어 method
        //sleep : 지정시간동안 멈춤 + InterruptedException
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        //interrupted : 대기 상태를 실행대기 상태로 만듦
        Thread.interrupted();      

        //yield : 실행 상태를 실행대기 상태로 만듦 (본인은 남은 시간은 넘기고 대기상태로 돌아감)
        Thread.yield();
    }
}