package pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jesse_ni on 26/09/14.
 */
public abstract class CarParkManager {

    private String name;

    private int carParkNum;

    private int[] carlots;

    private List<CarPark> carParks = new ArrayList<CarPark>();

    /**
     *
     * @param carParNum
     */
    public CarParkManager(int carParNum,int[] carlots) {
        this.carParkNum = carParNum;
        this.carlots = carlots;
        for(int i=0;i<carParkNum;i++) {
            CarPark carPark = new CarPark(carlots[i]);
            carParks.add(carPark);
        }
    }

    public abstract CarPark stopCar(Car car);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getCarlots() {
        return carlots;
    }

    public void setCarlots(int[] carlots) {
        this.carlots = carlots;
    }

    public Car driveCar(final int carParkIndex,final int carlotsIndex) {
        return null;
    }

    public int getCarParkNum() {
        return carParkNum;
    }

    public void setCarParkNum(int carParkNum) {
        this.carParkNum = carParkNum;
    }

    public List<CarPark> getCarParks() {
        return carParks;
    }

    public void setCarParks(List<CarPark> carParks) {
        this.carParks = carParks;
    }
}
