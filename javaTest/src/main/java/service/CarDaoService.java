package service;

import dao.CarDao;
import entity.Car;

/**
 * Created by lucas on 2018/8/3.
 */
public class CarDaoService implements CarDao {

    @Override
    public void driver(Car car) {
        System.out.println(car);
    }
}
