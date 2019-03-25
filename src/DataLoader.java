import model.Car;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {


    public static List<Car> listLoader() throws IOException {
        Workbook workbook = WorkbookFactory.create(new File("C:/Users/David/Desktop/Car-Sorting.xlsx"));
        List<Car> carList = new ArrayList<>();
        Sheet sheet = workbook.getSheetAt(0);

        for (int rn = 1; rn <= sheet.getLastRowNum(); rn++) {
            Row row = sheet.getRow(rn);
            carList.add(new Car(row.getCell(1).getStringCellValue(),
                    (int)row.getCell(2).getNumericCellValue(),
                    (long)row.getCell(3).getNumericCellValue(),
                    row.getCell(4).getStringCellValue()));
        }
        return carList;
    }
}
