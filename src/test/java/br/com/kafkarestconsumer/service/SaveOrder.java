package br.com.kafkarestconsumer.service;


import java.util.logging.Logger;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SaveOrder {

	@KafkaListener(topics = "SaveOrder", groupId = "MicroserviceSaveOrder")
	private void execute(ConsumerRecord<String, String> record) {
		
		Logger.getLogger("Chave => ", record.key());
		Logger.getLogger("Registro => ", record.value().toString());
	}
}
