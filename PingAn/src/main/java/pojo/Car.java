package pojo;

/**
 * Created by jesse_ni on 24/09/14.
 */
public class Car {

    private String carNo;
    private String carType;

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void toParkLot(CarLot parkLot) {
        parkLot.setCar(this);
    }

    public void leaveParkLot() {
        System.out.println("Car leaving CarPark!");
        System.out.println("Car leaved CarPark!");
    }
}
