package com.learning.rohit.RabbitMQTutorial;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {
	
	
	  private final static String QUEUE_NAME = "MailQueue";

	  public static void main(String[] args) throws Exception {
	    String uri = System.getenv("CLOUDAMQP_URL");
	    if (uri == null)
	    	uri = "amqp://<user>:<password>@<host>/<usr>"; // use your own uri
	    ConnectionFactory factory = new ConnectionFactory();
	    factory.setUri(uri);
	    factory.setConnectionTimeout(30000);
	    Connection connection = factory.newConnection();
	    Channel channel = connection.createChannel();

	    channel.queueDeclare(QUEUE_NAME, true, false, false, null);
	    String message = "{\"ticketId\":\"1234\",\"name\":\"Rakesh\",\"vendor\":\"vedal\"}";
	    channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
	    System.out.println(" [x] Sent '" + message + "'");

	    channel.close();
	    connection.close();
	  } 
}