import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new LinkedList<>();
//
//        for (int i = 0; i < 5_000_000; i++) {
//            list.add(i);
//        }
//
//        long start=System.currentTimeMillis();
//
//        for(int i=0;i<100;i++){
//            list.add(2_000_000, Integer.MAX_VALUE);
//        }
//        System.out.println("Vrema raboty dla LinkedList(v milisecundah) = " + (System.currentTimeMillis()-start));
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 5_000_000; i++) {
//            list.add(i);
//        }
//
//        long start=System.currentTimeMillis();
//
//        for (int i=0;i<100;i++){
//            list.add(2_000_000, Integer.MAX_VALUE);
//        }
//        System.out.println("Время работы для ArrayList (в миллисекундах) = " + (System.currentTimeMillis()-start));
//        getTimeMsOfInsert(new LinkedList());
//        getTimeMsOfInsert(new ArrayList());
//    }
//
//    public static long getTimeMsOfInsert(List list) {
//        //напишите тут ваш код
//        Date currentTime = new Date();
//        insert1000000(list);
//        Date newTime = new Date();
//        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
//        System.out.println("Результат в миллисекундах: " + msDelay);
//        return msDelay;
//
//    }
//
//    public static void insert1000000(List list) {
//        for (int i = 0; i < 1000000; i++) {
//            list.add(0, new Object());
//        }
        Worker worker1 = new Worker("Eldiar",20,"Programmer");
        Worker worker2 = new Worker("Mahamatzhan",13,"Programmer");
        Worker worker3 = new Worker("Nurba",14,"Cook");
        Worker worker4 = new Worker("Syimyk",15,"Jurist");
        Worker worker5 = new Worker("Aziret",19,"Judge");
        List<Worker> workers  = new LinkedList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);
        workers.add(worker5);
        System.out.println(workers);
    }
}
