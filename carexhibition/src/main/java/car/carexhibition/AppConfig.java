package car.carexhibition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import car.carexhibition.cars.BMWCar;
import car.carexhibition.cars.Car;
import car.carexhibition.cars.MarutiCar;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean
	@Qualifier("car-list")
	public void carList() {
		
	}

	@Bean
	public Car marutiCar() {
		Car car = new MarutiCar();
		return car;
	}
	
	@Bean
	public Car bmwCar() {
		Car car = new BMWCar();
		return car;
	}
}
