package kafkaconsumerone;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

//@Service
public class ConsumerConcurrency {

    private static Logger logger = LoggerFactory.getLogger(ConsumerConcurrency.class);
    //concurreny increase the number of consumers.
    @KafkaListener(topics = "multi-partition-topic",groupId = "course-group", concurrency = "3")
    public void consumeKeyAndMessage(ConsumerRecord<String,String> consumerRecord)
            throws InterruptedException {

        logger.info("Message:{} Key:{} Partition:{} Offset{} "+
                consumerRecord.value(),consumerRecord.key(),
                consumerRecord.partition(), consumerRecord.offset());

        TimeUnit.SECONDS.sleep(1);

    }
}
