package kafka.producer.one;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kafka.producer.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import kafka.producer.config.JavaConfig;

@Service
public class EmployeeProducer {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(Employee employee) throws JsonProcessingException {
        var json = objectMapper.writeValueAsString(employee);
        kafkaTemplate.send("employee-topic", json);
    }
}
