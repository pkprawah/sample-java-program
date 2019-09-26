package kafka.produce;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class Producer {

	public static void main(String[] args) {
	
		String bootstrapServerIp = "127.0.0.1:9092";
		// Create producer properties...
		
		Properties properties =new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServerIp);
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		
		// Create Producer
		
		KafkaProducer<String , String> producer = new KafkaProducer<String, String>(properties);
		
		// Create producer Record
		
		ProducerRecord<String, String> record = new ProducerRecord<String, String>("first_topic", "Hello pawan how r you!");
		
		
		// Send producer - Asynchonous . 
		
		producer.send(record);
		
		producer.flush();
		
		producer.close();
		

	}

}
