package kafka.producer.one;

import kafka.producer.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class KafkaProducerOneApplication implements CommandLineRunner {

	@Autowired
	EmployeeProducer employeeProducer;

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		for(int i = 0 ; i < 5 ; i++){
			Employee employee = new Employee("Employee "+i, "emp-"+i, "20-1-1993");
			employeeProducer.sendMessage(employee);
			System.out.println("Employee "+i+"\'s info sent.");

		}

	}
}
