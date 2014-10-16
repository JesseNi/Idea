package pojo;

/**
 * Created by jesse_ni on 08/10/14.
 */
public class GenCarParkManager extends CarParkManager{

    public GenCarParkManager(int carParNum, int[] carlots) {
        super(carParNum,carlots);
    }

    @Override
    public CarPark stopCar(Car car) {
        for(int i=0;i<this.getCarParks().size();i++) {
            CarPark carPark = this.getCarParks().get(i);
            if(carPark.in(car)) {
                carPark.setCarParkIndex(i);
                return carPark;
            }
        }
        return null;
    }
}
