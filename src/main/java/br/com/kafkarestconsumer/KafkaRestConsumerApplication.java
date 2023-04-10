package br.com.kafkarestconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaRestConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaRestConsumerApplication.class, args);
	}

}
