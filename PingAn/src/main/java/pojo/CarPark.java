package pojo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jesse_ni on 24/09/14.
 */
public class CarPark {

    private int carlotNum;

    private int emptyLotNum;

    private int carParkIndex;

    private int carLotIndex;

    private float emptyRate = 1;

    private List<CarLot> lots = new LinkedList<CarLot>();

    public CarPark(int carlotNum) {
        this.carlotNum = carlotNum;
        this.emptyLotNum = carlotNum;
        while(carlotNum-->0) {
            lots.add(new CarLot());
        }
    }

    public boolean in(Car car) {
        for(int i=0;i<this.getCarlotNum();i++) {
            CarLot carLot = this.getLots().get(i);
            if(carLot.getCar()==null) {
                carLot.setCar(car);
                this.emptyLotNum -= 1;
                return true;
            }
        }
        return false;
    }

    public List<CarLot> getLots() {
        return lots;
    }

    public void setLots(List<CarLot> lots) {
        this.lots = lots;
    }

    public boolean in(Car car,int lotNumber) {
        if(this.getLots().get(lotNumber).getCar()==null) {
            car.toParkLot(this.getLots().get(lotNumber));
            return true;
        } else return false;
    }

    public void out(int lotNumber) {
        if(this.getLots().get(lotNumber).getCar()!=null) {
            this.getLots().get(lotNumber).setCar(null);
        }
    }

    public int getCarlotNum() {
        return carlotNum;
    }

    public void setCarlotNum(int carlotNum) {
        this.carlotNum = carlotNum;
    }

    public int getCarParkIndex() {
        return carParkIndex;
    }

    public void setCarParkIndex(int carParkIndex) {
        this.carParkIndex = carParkIndex;
    }

    public int getCarLotIndex() {
        return carLotIndex;
    }

    public void setCarLotIndex(int carLotIndex) {
        this.carLotIndex = carLotIndex;
    }

    public int getEmptyLotNum() {
        return emptyLotNum;
    }

    public void setEmptyLotNum(int emptyLotNum) {
        this.emptyLotNum = emptyLotNum;
    }

    public float getEmptyRate() {
        return emptyRate;
    }

    public void setEmptyRate(float emptyRate) {
        this.emptyRate = emptyRate;
    }
}
