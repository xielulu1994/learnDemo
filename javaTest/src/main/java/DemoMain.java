import entity.Car;
import service.CarDaoService;

/**
 * Created by lucas on 2018/8/3.
 */
public class DemoMain {
    public static void main(String[] args) {
        System.out.println("hello");
        CarDaoService carDaoService = new CarDaoService();
        carDaoService.driver(new Car("宝马","BLACK",245655.23f));

        System.out.println("dddd");
    }

}
