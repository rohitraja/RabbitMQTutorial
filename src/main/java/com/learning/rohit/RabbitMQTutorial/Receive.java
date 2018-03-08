package com.learning.rohit.RabbitMQTutorial;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
public class Receive {
	
	  private final static String QUEUE_NAME = "MailQueue";

	  public static void main(String[] argv) throws Exception {
		    String uri = System.getenv("CLOUDAMQP_URL");
		    if (uri == null) 
		    	uri = "amqp://<user>:<password>@<host>/<usr>";// use your own uri
		    ConnectionFactory factory = new ConnectionFactory();
		    factory.setUri(uri);
		    factory.setConnectionTimeout(30000);
		    Connection connection = factory.newConnection();
		    Channel channel = connection.createChannel();

		    channel.queueDeclare(QUEUE_NAME, true, false, false, null);
		    System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

		    Consumer consumer = new DefaultConsumer(channel) {
		      @Override
		      public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
		          throws IOException {
		    	  Gson gson = new Gson();
		        String message = new String(body, "UTF-8");
				TicketDetails ticket =  gson.fromJson(message, TicketDetails.class);
				System.out.println(" [x] Received '" + ticket.toString() + "'");

		      }
		    };
		    channel.basicConsume(QUEUE_NAME, true, consumer);
	  }

}
