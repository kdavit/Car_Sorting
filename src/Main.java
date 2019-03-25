import model.Car;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Car> carList = DataLoader.listLoader();

        Sort sort = new Sort(carList);
        sort.sortList();
        for (Car car:carList) {
            System.out.println(car.getCar());
        }
    }
}
