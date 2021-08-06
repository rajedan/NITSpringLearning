package car.carexhibition.cars;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class BMWCar extends Car {

	public BMWCar() {
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "BMW";
	}

}
