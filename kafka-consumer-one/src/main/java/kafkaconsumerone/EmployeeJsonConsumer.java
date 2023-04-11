package kafkaconsumerone;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmployeeJsonConsumer {

    private static Logger log = LoggerFactory.getLogger(EmployeeJsonConsumer.class);

    @KafkaListener(topics = "employee-topic",groupId = "course-group")
    public void jsonListener(String s) throws JsonProcessingException {

        log.info("Employee info (in JSON STRING): "+ s);

    }

}
