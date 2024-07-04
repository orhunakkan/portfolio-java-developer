package myapp.bootstrap;

import myapp.entity.Car;
import myapp.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car car01 = new Car("AAA", "BBB");
        Car car02 = new Car("CCC", "DDD");
        Car car03 = new Car("EEE", "FFF");

        carRepository.save(car01);
        carRepository.save(car02);
        carRepository.save(car03);

    }
}
