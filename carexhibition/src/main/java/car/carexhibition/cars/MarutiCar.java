package car.carexhibition.cars;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MarutiCar extends Car {

	public MarutiCar() {
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "Maruti";
	}

}
