package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class baiHai {
    public static void main(String[] args) {
        Runnable task1 = () ->{
          for (int i =0;i<5;i++){
              System.out.println(Thread.currentThread().getName());
          }
        };
        Runnable task2 = () ->{
            for (int i =0;i<5;i++){
                System.out.println(Thread.currentThread().getName());
            }
        };
        Runnable task3 = () ->{
            for (int i =0;i<5;i++){
                System.out.println(Thread.currentThread().getName());
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.shutdown();
        ;
    }
}
