package multithreading;

class task1 implements  Runnable{
    @Override
    public void run() {
        for (int i=1;i<=20;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
class task2 implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=20;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}


public class baiMot {
    public static void main(String[] args) {
        Runnable t1 = new task1();
        Runnable t2 = new task2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
