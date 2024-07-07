package myapp.bootstrap;

import myapp.entity.Car;
import myapp.entity.Department;
import myapp.entity.Employee;
import myapp.enums.Gender;
import myapp.repository.CarRepository;
import myapp.repository.DepartmentRepository;
import myapp.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    private final CarRepository carRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DataGenerator(CarRepository carRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.carRepository = carRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car car01 = new Car("AAA", "BBB");
        Car car02 = new Car("CCC", "DDD");
        Car car03 = new Car("EEE", "FFF");

        carRepository.save(car01);
        carRepository.save(car02);
        carRepository.save(car03);

        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        Employee employee01 = new Employee("A", "B", "C", LocalDate.now(), Gender.MALE, 1000);
        Employee employee02 = new Employee("A", "B", "C", LocalDate.now(), Gender.MALE, 1000);
        Employee employee03 = new Employee("A", "B", "C", LocalDate.now(), Gender.MALE, 1000);
        Employee employee04 = new Employee("A", "B", "C", LocalDate.now(), Gender.MALE, 1000);
        Employee employee05 = new Employee("A", "B", "C", LocalDate.now(), Gender.MALE, 1000);

        Department department01 = new Department("A", "B");
        Department department02 = new Department("A", "B");
        Department department03 = new Department("A", "B");
        Department department04 = new Department("A", "B");
        Department department05 = new Department("A", "B");

        employeeList.addAll(Arrays.asList(employee01, employee02, employee03, employee04, employee05));
        departmentList.addAll(Arrays.asList(department01, department02, department03, department04, department05));

        employeeRepository.saveAll(employeeList);
        departmentRepository.saveAll(departmentList);

    }
}
