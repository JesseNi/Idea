package pojo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CarParkTest {

    CarPark carPark;

    @Before
    public void before() {
        carPark = new CarPark(2);
        carPark.setCarlotNum(10);
        for(int i=0; i<carPark.getCarlotNum();i++) {
            CarLot parkLot = new CarLot();
            carPark.getLots().add(i,parkLot);
        }
    }

    @After
    public void after() {

    }

    @Test
    public void parkTestPut() {
        Car car = new Car();
        boolean r = carPark.in(car,5);
        assertTrue(r);
    }

    @Test
    public void parkTestOut() {
        carPark.out(5);
    }
}