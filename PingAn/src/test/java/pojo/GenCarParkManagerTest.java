package pojo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenCarParkManagerTest {
    private CarParkManager parkManager;

    @Before
    public void init(){
        int[] carlots = new int[]{3,3,3};
        parkManager = new GenCarParkManager(3,carlots);
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
    }

    @Test
    public void testIn(){
        Car car = new Car();
        CarPark carPark = parkManager.stopCar(car);
        assertEquals(2,carPark.getCarParkIndex()+1);
    }
}