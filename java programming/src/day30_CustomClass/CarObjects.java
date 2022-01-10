package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
car1.setInfo("Toyota","Camry", "White", 2021, 35000);

        System.out.println(car1);

       Car car2 = new Car();
       car2.setInfo("BMW", "331is", "Black", 2020, 45000);
        System.out.println(car2);

        //Car[] cars ={car1,car2};
        ArrayList<Car> carList =new ArrayList<>();
        carList.addAll(Arrays.asList(car1, car2));
        for (Car each:carList
             ) {
            System.out.println(each.brand + " : "+ each.price);

        }
        carList.removeIf(p-> p.brand.equals("BMW") && p.year>=2005 && p.year<=2008);





    }
}
