import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    Queue<Car> carQueue = new ArrayDeque<>();

    public void addToQueue(Car car){
        if(car.getClass()!=Bus.class){
            carQueue.offer(car);
        } else {
            System.out.println("Автобус без тех. обслуживания....");
        }
    }

    public void doService(){
        Car car = carQueue.poll();
        if(car!=null){
            System.out.println("Провел техобслуживание "+car.getModel()+" "+car.getBrand());
            doService();
        } else {
            System.out.println("Очередь пуста. Все машины отремонтированы.");
        }
    }
}
