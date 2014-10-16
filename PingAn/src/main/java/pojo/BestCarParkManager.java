package pojo;

/**
 * Description ...
 * Created by jesse_ni on 16/10/14.
 * Modify by jesse_ni on 16/10/14 for...
 */
public class BestCarParkManager extends CarParkManager {

    public BestCarParkManager(int carParNum, int[] carlots) {
        super(carParNum, carlots);
    }

    @Override
    public CarPark stopCar(Car car) {
        CarPark carPark = pickMaxEmptyRateCarPark();
        if (carPark == null) {
            return null;
        } else {
            printlnCarParkRate();
            if (carPark.in(car)) {
                carPark.setEmptyRate((float) carPark.getEmptyLotNum() / carPark.getCarlotNum());
                return carPark;
            } else {
                return null;
            }
        }
    }

    private CarPark pickMaxEmptyRateCarPark() {
        CarPark maxEmptyRateCarPark = null;
        float temp_rate = 0;
        for (int i = 0; i < this.getCarParks().size(); i++) {
            CarPark carpark = this.getCarParks().get(i);
            if (carpark.getEmptyRate() == 1) {
                maxEmptyRateCarPark = carpark;
                maxEmptyRateCarPark.setCarParkIndex(i+1);
                break;
            }
            if (temp_rate != 0 && carpark.getEmptyRate() == temp_rate
                    && carpark.getEmptyLotNum() > maxEmptyRateCarPark.getEmptyLotNum()) {
                maxEmptyRateCarPark = carpark;
                maxEmptyRateCarPark.setCarParkIndex(i+1);
                temp_rate = carpark.getEmptyRate();
            } else if (carpark.getEmptyRate() > temp_rate) {
                maxEmptyRateCarPark = carpark;
                maxEmptyRateCarPark.setCarParkIndex(i+1);
                temp_rate = carpark.getEmptyRate();
            }
        }
        return maxEmptyRateCarPark;
    }

    private void printlnCarParkRate() {
        System.out.println("=====停车场空置率=====");
        for (int i = 0; i < this.getCarParks().size(); i++) {
            CarPark carpark = this.getCarParks().get(i);
            System.out.println("第" + (i + 1) + "停车场:" + (float) carpark.getEmptyLotNum() / carpark.getCarlotNum());
        }
    }
}
