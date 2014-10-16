package pojo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by jesse_ni on 26/09/14.
 */
public class BetterCarParkManagerTest {

    private CarParkManager parkManager;

    @Before
    public void init(){
        int[] carlots = new int[]{3,3,5};
        parkManager = new BetterCarParkManager(3,carlots);
        parkManager.stopCar(new Car());
        parkManager.stopCar(new Car());
    }

    @Test
    public void testIn(){
        Car car = new Car();
        CarPark carPark = parkManager.stopCar(car);
        assertEquals(1,carPark.getCarParkIndex()+1);
    }
}
