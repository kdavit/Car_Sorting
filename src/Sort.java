import model.Car;

import java.util.Collections;
import java.util.List;

public class Sort {
    List<Car> carList;

    public Sort(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> sortList(){

        Collections.sort(carList,(o1, o2) -> o1.getCar().compareTo(o2.getCar()));
        return carList;

    }
}
