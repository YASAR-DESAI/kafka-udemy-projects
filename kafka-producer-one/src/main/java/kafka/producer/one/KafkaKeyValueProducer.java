package kafka.producer.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaKeyValueProducer {

    private final Logger log = LoggerFactory.getLogger(KafkaKeyValueProducer.class);

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    String topic_name = "multi-partition-topic";


    public void sendKeyAndMessage(String key, String message){
        log.info("Sending msg: {} with key:{} ",message,key);
        kafkaTemplate.send(topic_name, key, message);
    }

}
