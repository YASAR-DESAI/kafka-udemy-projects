package kafka.producer.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public ObjectMapper createObjectMapper(){
        var objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();

        return objectMapper;
    }
}
