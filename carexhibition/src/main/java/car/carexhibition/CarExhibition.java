package car.carexhibition;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import car.carexhibition.cars.Car;

@Component("carexhibition")
public class CarExhibition {

	@Autowired
	List<Car> cars;

	public void sortByBrandNname() {
		Collections.sort(cars, new Comparator<Car>() {

			public int compare(Car c1, Car c2) {
				if (c1.getBrand().equals(c2.getBrand())) {
					if (c1.getPrice() > c2.getPrice())
						return 1;
					else if (c1.getPrice() < c2.getPrice())
						return -1;
					else
						return 0;
				}
				return 0;
			}
		});
	}
}