package pojo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestCarParkManagerTest {
    private CarParkManager parkManager;

    @Before
    public void init(){
        int[] carlots = new int[]{5,4,3};
        parkManager = new BestCarParkManager(3,carlots);
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
    }

    @Test
    public void testIn(){
        Car car = new Car();
        CarPark carPark = parkManager.stopCar(car);
        assertEquals(1,carPark.getCarParkIndex());
    }

}