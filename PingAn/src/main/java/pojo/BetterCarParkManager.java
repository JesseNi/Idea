package pojo;

/**
 * Created by jesse_ni on 08/10/14.
 */
public class BetterCarParkManager extends CarParkManager{

    /**
     * @param carParNum
     * @param carlots
     */
    public BetterCarParkManager(int carParNum, int[] carlots) {
        super(carParNum,carlots);
    }

    @Override
    public CarPark stopCar(Car car) {
        CarPark mostEmptyCarPark = pickMostEmptyCarPark();
        if(mostEmptyCarPark==null) {
            return null;
        } else {
           if(mostEmptyCarPark.in(car)) {
               return mostEmptyCarPark;
           } else {
               return null;
           }
        }
    }

    private CarPark pickMostEmptyCarPark(){
        int emptyNum = 0;
        CarPark mostEmptyCarPark = null;
        for(int i=0;i<this.getCarParks().size();i++){
            CarPark carPark = this.getCarParks().get(i);
            if(carPark.getEmptyLotNum()>emptyNum){
                emptyNum = carPark.getEmptyLotNum();
                mostEmptyCarPark =  carPark;
                mostEmptyCarPark.setCarParkIndex(i);
            }
        }
        return mostEmptyCarPark;
    }

}
